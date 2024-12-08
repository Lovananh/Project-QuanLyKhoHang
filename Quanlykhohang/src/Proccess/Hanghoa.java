package Proccess;

import java.sql.*;
import Database.Connect;
import java.util.ArrayList;
import java.util.List;

public class Hanghoa {

    private String Mahh;
    private String Tenhh;
    private int Soluong;
    private double Gia;
    private String Donvt;
    private String Tinhtrang;

    public void setMahh(String Mahh) {
        this.Mahh = Mahh;
    }

    public String getMahh() {
        return Mahh;
    }

    public void setTenhh(String Tenhh) {
        this.Tenhh = Tenhh;
    }

    public String getTenhh() {
        return Tenhh;
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

    public void setDonvt(String Donvt) {
        this.Donvt = Donvt;
    }

    public String getDonvt() {
        return Donvt;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    // connect data
    public Connect cn = new Connect();

    // truy van vao du lieu trong table Hanghoa
    public List<Hanghoa> getHanghoa() throws SQLException {
        String sql = "SELECT * FROM Hanghoa";

        List<Hanghoa> list = new ArrayList<>();
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Hanghoa hh = new Hanghoa();
                hh.setMahh(rs.getString("Mahang"));
                hh.setTenhh(rs.getString("Tenhang"));
                hh.setSoluong(rs.getInt("Soluong"));
                hh.setGia(rs.getDouble("Gia"));
                hh.setDonvt(rs.getString("Donvitinh"));
                hh.setTinhtrang(rs.getString("Tinhtrang"));
                list.add(hh);
            }
        }
        return list;
    }

    // truy van vao 1 dong du lieu theo mahh
    public Hanghoa getHanghoa(String Mahh) throws SQLException {
        String sql = "SELECT * FROM Hanghoa WHERE Mahang = ?";
        Hanghoa hanghoa = null;

        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, Mahh);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    hanghoa = new Hanghoa();
                    hanghoa.setMahh(rs.getString("Mahang"));
                    hanghoa.setTenhh(rs.getString("Tenhang"));
                    hanghoa.setSoluong(rs.getInt("Soluong"));
                    hanghoa.setGia(rs.getDouble("Gia"));
                    hanghoa.setDonvt(rs.getString("Donvitinh"));
                    hanghoa.setTinhtrang(rs.getString("Tinhtrang"));
                }
            }
        }
        return hanghoa;
    }

    // them
    public boolean InsertHanghoa(Hanghoa obj) throws SQLException {
        String sql = "INSERT INTO Hanghoa (Mahang, Tenhang, Soluong, Gia, Donvitinh, Tinhtrang) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, obj.getMahh());
            ps.setString(2, obj.getTenhh());
            ps.setInt(3, obj.getSoluong());
            ps.setDouble(4, obj.getGia());
            ps.setString(5, obj.getDonvt());
            ps.setString(6, obj.getTinhtrang());
            return ps.executeUpdate() > 0;
        }
    }

    // sua thong tin
    public boolean EditHanghoa(Hanghoa obj) throws SQLException {
        String sql = "UPDATE Hanghoa SET Tenhang = ?, Soluong = ?, Gia = ?, Donvitinh = ?, Tinhtrang = ? WHERE Mahang = ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, obj.getTenhh());
            ps.setInt(2, obj.getSoluong());
            ps.setDouble(3, obj.getGia());
            ps.setString(4, obj.getDonvt());
            ps.setString(5, obj.getTinhtrang());
            ps.setString(6, obj.getMahh());
            return ps.executeUpdate() > 0;
        }
    }

    // xoa 1 dong
    public boolean DeleteHanghoa(String mahanghoa) throws SQLException {
        String sql = "DELETE FROM Hanghoa WHERE Mahang = ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, mahanghoa);
            int rowsDeleted = stm.executeUpdate();
            if (rowsDeleted > 0) {
                return true; // Xóa thành công
            } else {
                System.out.println("Không có hàng nào bị xóa. Có thể mã hàng hóa không tồn tại.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Lỗi SQL khi thực hiện xóa: " + e.getMessage());
        }
    }

    // Tim kiem 
    public List<Hanghoa> timKiemHanghoa(String tenHH) throws SQLException {
        List<Hanghoa> list = new ArrayList<>();
        String sql = "SELECT * FROM Hanghoa WHERE Tenhang LIKE ?";

        try (Connection conn = cn.connectSQL(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, "%" + tenHH + "%");
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    Hanghoa hh = new Hanghoa();
                    hh.setMahh(rs.getString("Mahang"));
                    hh.setTenhh(rs.getString("Tenhang"));
                    hh.setSoluong(rs.getInt("Soluong"));
                    hh.setGia(rs.getDouble("Gia"));
                    hh.setDonvt(rs.getString("Donvitinh"));
                    hh.setTinhtrang(rs.getString("Tinhtrang"));
                    list.add(hh);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Lỗi khi tìm kiếm hàng hóa: " + ex.getMessage());
        }
        return list;
    }

    // hiển thị tổng số lượng
    public int[] getSoLuongNhapXuat() throws SQLException {
        int tongNhap = 0;
        int tongXuat = 0;

        String query = """
        SELECT   COALESCE(SUM(pn.Soluongtn), 0) AS TongNhap,
                 COALESCE(SUM(px.Soluongxuat), 0) AS TongXuat
        FROM Hanghoa h
        LEFT JOIN PhieuNhap pn ON h.Mahang = pn.Mahang
        LEFT JOIN PhieuXuat px ON h.Mahang = px.Mahang """;

        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(query); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                tongNhap = rs.getInt("TongNhap");
                tongXuat = rs.getInt("TongXuat");
            }
        }
        return new int[]{tongNhap, tongXuat};
    }
}
