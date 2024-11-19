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
        if (dsHanghoa == null) {
            dsHanghoa = new ArrayList<>(); // Khởi tạo danh sách nếu nó là null
        }
        return dsHanghoa;
    }

    public void setDShanghoa(List<Hanghoa> dsHanghoa) {
        this.dsHanghoa = dsHanghoa;
    }
    // connect data
    public Connect cn = new Connect();

    //truy van vao table
    public List<Hangxuat> getHangxuat() throws SQLException {

        String sql = "SELECT Hangxuat.Manv, Hangxuat.Sophieuxuat, Hangxuat.Ngayxuat, Hangxuat.Mathukho,"
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
        String sql = "SELECT Hangxuat.Manv, Hangxuat.Sophieuxuat, Hangxuat.Ngayxuat, Hangxuat.Mathukho,"
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
        if (obj == null) {
            System.out.println("Dữ liệu hàng xuất không hợp lệ.");
            return false; 
        }
        String sqlHangxuat = "INSERT INTO Hangxuat (Manv, Sophieuxuat, Ngayxuat, Mathukho) VALUES (?, ?, ?, ?)";
        String sqlphieuxuat = "INSERT INTO Phieuxuat (Mahang, Sophieuxuat, Soluongxuat) VALUES (?, ?, ?, ?)";

        try (Connection conn = cn.connectSQL()) {
            // Bắt đầu một transaction
            conn.setAutoCommit(false);  // Tắt chế độ tự động commit

            try (PreparedStatement pshangxuat = conn.prepareStatement(sqlHangxuat); PreparedStatement psphieuxuat = conn.prepareStatement(sqlphieuxuat)) {

                // Thiết lập các tham số cho câu lệnh INSERT vào bảng Hangxuat
                pshangxuat.setString(1, obj.getManv());
                pshangxuat.setInt(2, obj.getSophieuxuat());
                pshangxuat.setDate(3, new java.sql.Date(obj.getNgayxuat().getTime()));
                pshangxuat.setString(4, obj.getMathukho());

                // Thiết lập các tham số cho câu lệnh INSERT vào bảng Phieuxuat
                psphieuxuat.setString(1, obj.getMahang());
                psphieuxuat.setInt(2, obj.getSophieuxuat());
                psphieuxuat.setInt(3, obj.getSoluong());

                // Thực thi câu lệnh chèn vào bảng Hangxuat
                int result1 = pshangxuat.executeUpdate();
                // Thực thi câu lệnh chèn vào bảng Phieuxuat
                int result2 = psphieuxuat.executeUpdate();

                // Nếu cả hai câu lệnh đều thành công, commit transaction
                if (result1 > 0 && result2 > 0) {
                    conn.commit(); // Commit transaction
                    return true;
                } else {
                    conn.rollback(); // Nếu có lỗi, rollback transaction
                    return false;
                }
            } catch (SQLException e) {
                conn.rollback(); // Rollback nếu có lỗi xảy ra trong quá trình thực thi
                e.printStackTrace();
                return false;
            }
        }
    }

    public boolean EditHangxuat(Hangxuat obj) throws SQLException {
        if (obj == null) {
            System.out.println("Dữ liệu hàng xuất không hợp lệ.");
            return false;
        }
        String sqlhangxuat = "UPDATE Hangxuat SET Sophieuxuat = ?, Ngayxuat = ?, Mathukho = ? WHERE Manv = ?";
        try (Connection conn = cn.connectSQL()) {

            PreparedStatement pshangxuat = conn.prepareStatement(sqlhangxuat);

            // Cập nhật bảng Hangxuat
            pshangxuat.setInt(1, obj.getSophieuxuat());
            pshangxuat.setDate(2, new java.sql.Date(obj.getNgayxuat().getTime()));
            pshangxuat.setString(3, obj.getMathukho());
            pshangxuat.setString(4, obj.getManv());

            return pshangxuat.executeUpdate() > 0;

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
