/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;

//import java.time.LocalDate;
import java.sql.*;
import Database.Connect;
import java.util.ArrayList;
import java.util.List;
import Proccess.Hanghoa;

public class Hangxuat {

    private String Manv;
    private int Sophieuxuat;
    private Date Ngayxuat;
    private String Mathukho;
    private String Mahang;
    private int Soluong;
    private double Gia;
    private List<Hanghoa> dsHanghoa;

//     public Hangxuat(String Manv, int Sophieuxuat, Date Ngayxuat,int Mathukho, String Mahang, int Soluong, double Gia) {
//        this.Manv = Manv;
//        this.Sophieuxuat = Sophieuxuat; 
//        this.Ngayxuat = Ngayxuat;
//        this.Mathukho = Mathukho;
//        this.Mahang = Mahang;
//        this.Soluong = Soluong;
//        this.Gia = Gia;
//    }
    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getManv() {
        return Manv;
    }

    public void setSophieuxuat(int Sophieuxuat) {
        this.Sophieuxuat = Sophieuxuat;
    }

    public int getSophieuxuat() {
        return Sophieuxuat;
    }

    public void setNgayxuat(Date Ngayxuat) {
        this.Ngayxuat = Ngayxuat;
    }

    public Date getNgayxuat() {
        return Ngayxuat;
    }

    public void setMathukho(String Mathukho) {
        this.Mathukho = Mathukho;
    }

    public String getMathukho() {
        return Mathukho;
    }

    public void setMahang(String Mahang) {
        this.Mahang = Mahang;
    }

    public String getMahang() {
        return Mahang;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getSoluong() {

        return Soluong;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getGia() {
        return Gia;
    }

    public List<Hanghoa> getDSHanghoa() {
        return dsHanghoa;
    }

    public void setDShanghoa(List<Hanghoa> dsHanghoa) {
        this.dsHanghoa = dsHanghoa;
    }
    // connect data
    public Connect cn = new Connect();

    //truy van vao table
    public List<Hangxuat> getHangxuat() throws SQLException {

        String sql = "SELECT Hangxuat.Manv, Hangxuat.Sophieuxuat, Hangxuat.Ngayxuat, "
                + "Hanghoa.Mahang, Hanghoa.Gia, Phieuxuat.Soluongxuat "
                + "FROM Hangxuat, Hanghoa, Phieuxuat "
                + "WHERE Hangxuat.Sophieuxuat = Phieuxuat.Sophieuxuat "
                + "AND Hanghoa.Mahang = Phieuxuat.Mahang";
        List<Hangxuat> dshangxuat = new ArrayList<>();
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hangxuat hx = new Hangxuat();
                hx.setManv(rs.getString("Manv"));
                hx.setSophieuxuat(rs.getInt("Sophieuxuat"));
                hx.setNgayxuat(rs.getDate("Ngayxuat"));
                hx.setMathukho(rs.getString("Mathukho"));
                hx.setMahang(rs.getString("Mahang"));
                hx.setSoluong(rs.getInt("Soluongxuat"));
                hx.setGia(rs.getDouble("Gia"));
                dshangxuat.add(hx);
            }
        }
        return dshangxuat;
    }

    // truy van vao  1 dong
    public Hangxuat getHangxuat(int SoPhieuXuat) throws SQLException {
        String sql = "SELECT Hangxuat.Manv, Hangxuat.Sophieuxuat, Hangxuat.Ngayxuat, "
                + "Hanghoa.Mahang, Hanghoa.Gia, Phieuxuat.Soluongxuat "
                + "FROM Hangxuat, Hanghoa, Phieuxuat "
                + "WHERE Hangxuat.Sophieuxuat = Phieuxuat.Sophieuxuat "
                + "AND Hanghoa.Mahang = Phieuxuat.Mahang "
                + "AND Hangxuat.Sophieuxuat = ?";
        Hangxuat hangxuat = null;

        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, SoPhieuXuat);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    hangxuat = new Hangxuat();
                    hangxuat.setManv(rs.getString("Manv"));
                    hangxuat.setSophieuxuat(rs.getInt("Sophieuxuat"));
                    hangxuat.setNgayxuat(rs.getDate("Ngayxuat"));
                    hangxuat.setMathukho(rs.getString("Mathukho"));
                    hangxuat.setMahang(rs.getString("Mahang"));
                    hangxuat.setSoluong(rs.getInt("Soluongxuat"));
                    hangxuat.setGia(rs.getDouble("Gia"));
                }
            }
        }
        return hangxuat;
    }

// them
    public boolean InsertHangxuat(Hangxuat obj) throws SQLException {
        if (!CheckHangxuat(obj)) {
            return false;
        }
        String sqlHangxuat = "INSERT INTO Hangxuat (Manv, Sophieuxuat, Ngayxuat, Mathukho) VALUES (?, ?, ?, ?)";
        String sqlPhieuxuat = "INSERT INTO Phieuxuat ( Mahang,Sophieuxuat, Soluongxuat) VALUES (?, ?, ?)";

        try (Connection conn = cn.connectSQL()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pshangxuat = conn.prepareStatement(sqlHangxuat); PreparedStatement psphieuxuat = conn.prepareStatement(sqlPhieuxuat)) {
                pshangxuat.setString(1, obj.getManv());
                pshangxuat.setInt(2, obj.getSophieuxuat());
                pshangxuat.setDate(3, new java.sql.Date(obj.getNgayxuat().getTime()));
                pshangxuat.setString(4, obj.getMathukho());
                pshangxuat.executeUpdate();

                for (Hanghoa hanghoa : obj.getDSHanghoa()) {
                    psphieuxuat.setString(1, hanghoa.getMahh());
                    psphieuxuat.setInt(2, obj.getSophieuxuat());
                    psphieuxuat.setInt(3, hanghoa.getSoluong());
                    psphieuxuat.executeUpdate();
                }
                // Commit các thay đổi
                conn.commit();
                return true;

            } catch (SQLException e) {
                // Rollback nếu có lỗi xảy ra
                conn.rollback();
                e.printStackTrace();
                return false;
            } finally {
                // Bật lại chế độ auto-commit
                conn.setAutoCommit(true);
            }
        }
    }

    private boolean CheckHangxuat(Hangxuat obj) {
        // Kiểm tra nếu đối tượng Hangxuat hoặc danh sách hàng hóa là null hoặc trống
        if (obj == null || obj.getDSHanghoa() == null || obj.getDSHanghoa().isEmpty()) {
            System.out.println("Dữ liệu không hợp lệ hoặc danh sách hàng hóa trống.");
            return false;
        }

        // Kiểm tra các trường trong Hangxuat
        if (obj.getManv() == null || obj.getManv().isEmpty()) {
            System.out.println("Mã nhân viên không hợp lệ.");
            return false;
        }

        if (obj.getNgayxuat() == null) {
            System.out.println("Ngày xuất không hợp lệ.");
            return false;
        }

        if (obj.getMathukho() == null || obj.getMathukho().isEmpty()) {
            System.out.println("Mã thủ kho không hợp lệ.");
            return false;
        }

        // Kiểm tra từng mặt hàng trong danh sách hàng hóa
        for (Hanghoa hanghoa : obj.getDSHanghoa()) {
            if (hanghoa.getMahh() == null || hanghoa.getMahh().isEmpty()) {
                System.out.println("Mã hàng hóa không hợp lệ.");
                return false;
            }

            if (hanghoa.getSoluong() <= 0) {
                System.out.println("Số lượng xuất phải lớn hơn 0.");
                return false;
            }
        }

        return true; // Nếu tất cả các điều kiện đều hợp lệ
    }
// sua thong tin

    public boolean EditHangxuat(Hangxuat obj) throws SQLException {
        if (!CheckHangxuat(obj)) {
            return false;
        }

        String sqlhangxuat = "UPDATE Hangxuat SET Manv = ?, Ngayxuat = ?, Mathukho = ? WHERE Sophieuxuat = ?";
        String sqlphieuxuat = "UPDATE Phieuxuat SET Mahang = ?, Soluongxuat=? WHERE Sophieuxuat = ?";

        try (Connection conn = cn.connectSQL()) {
            conn.setAutoCommit(false);

            try (PreparedStatement pshangxuat = conn.prepareStatement(sqlhangxuat); PreparedStatement psphieuxuat = conn.prepareStatement(sqlphieuxuat)) {

                // Cập nhật bảng Hangxuat
                pshangxuat.setString(1, obj.getManv());
                pshangxuat.setDate(2, new java.sql.Date(obj.getNgayxuat().getTime()));
                pshangxuat.setString(3, obj.getMathukho());
                pshangxuat.setInt(4, obj.getSophieuxuat());
                pshangxuat.executeUpdate();

                // Cập nhật từng mặt hàng trong danh sách hàng hóa
                for (Hanghoa hanghoa : obj.getDSHanghoa()) {
                    psphieuxuat.setString(1, hanghoa.getMahh());
                    psphieuxuat.setInt(2, hanghoa.getSoluong());
                    psphieuxuat.setInt(3, obj.getSophieuxuat());
                    psphieuxuat.executeUpdate();
                }

                // Commit các thay đổi
                conn.commit();
                return true;

            } catch (SQLException e) {
                // Rollback nếu có lỗi xảy ra
                conn.rollback();
                e.printStackTrace(); // In thông tin chi tiết lỗi
                return false;
            } finally {
                // Bật lại chế độ auto-commit
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // In thông tin chi tiết lỗi kết nối cơ sở dữ liệu
            return false;
        }
    }

// xoa 1 dong
    public boolean DeleteHangxuat(int sophieuxuat) throws SQLException {
        String sql = "DELETE FROM Hangxuat WHERE Sophieuxuat = ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1, sophieuxuat);
            return stm.executeUpdate() > 0;
        }
    }
}
