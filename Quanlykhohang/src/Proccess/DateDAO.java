package Proccess;

import Database.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateDAO {

    public class Hangxuat {

        private String sophieuxuat;
        private String mahang;
        private int soluong;
        private Date ngayxuat;

        // Getter và Setter
        public String getSophieuxuat() {
            return sophieuxuat;
        }

        public void setSophieuxuat(String sophieuxuat) {
            this.sophieuxuat = sophieuxuat;
        }

        public String getMahang() {
            return mahang;
        }

        public void setMahang(String mahang) {
            this.mahang = mahang;
        }

        public int getSoluong() {
            return soluong;
        }

        public void setSoluong(int soluong) {
            this.soluong = soluong;
        }

        public Date getNgayxuat() {
            return ngayxuat;
        }

        public void setNgayxuat(Date ngayxuat) {
            this.ngayxuat = ngayxuat;
        }
    }

    public class Hangnhap {

        private int sophieunhap;
        private String tenhang;
        private int soluong;
        private double dongia;
        private Date ngaynhap;

        // Getters và Setters
        public int getSophieunhap() {
            return sophieunhap;
        }

        public void setSophieunhap(int sophieunhap) {
            this.sophieunhap = sophieunhap;
        }

        public String getTenhang() {
            return tenhang;
        }

        public void setTenhang(String tenhang) {
            this.tenhang = tenhang;
        }

        public int getSoluong() {
            return soluong;
        }

        public void setSoluong(int soluong) {
            this.soluong = soluong;
        }

        public double getDongia() {
            return dongia;
        }

        public void setDongia(double dongia) {
            this.dongia = dongia;
        }

        public Date getNgaynhap() {
            return ngaynhap;
        }

        public void setNgaynhap(Date ngaynhap) {
            this.ngaynhap = ngaynhap;
        }
    }

    // hang tồn kho
    public class TonKho {

        private String mahang;
        private String tenhang;
        private int tongNhap;
        private int tongXuat;
        private int tonKho;

        // Getters và Setters
        public String getMahang() {
            return mahang;
        }

        public void setMahang(String mahang) {
            this.mahang = mahang;
        }

        public String getTenhang() {
            return tenhang;
        }

        public void setTenhang(String tenhang) {
            this.tenhang = tenhang;
        }

        public int getTongNhap() {
            return tongNhap;
        }

        public void setTongNhap(int tongNhap) {
            this.tongNhap = tongNhap;
        }

        public int getTongXuat() {
            return tongXuat;
        }

        public void setTongXuat(int tongXuat) {
            this.tongXuat = tongXuat;
        }

        public int getTonKho() {
            return tonKho;
        }

        public void setTonKho(int tonKho) {
            this.tonKho = tonKho;
        }
    }
    Connect cn = new Connect();

    // Phương thức lấy dữ liệu hàng nhập theo khoảng ngày
    public List<Hangnhap> getHangnhapByDate(Date fromDate, Date toDate) throws SQLException {
        List<Hangnhap> hangnhapList = new ArrayList<>();
        String sql = "SELECT Hangnhap.Sophieunhap, Hanghoa.Tenhang, Phieunhap.Soluongxn AS Soluong, "
                + "Phieunhap.Dongia, Hangnhap.Ngaynhap "
                + "FROM Hangnhap "
                + "JOIN Phieunhap ON Hangnhap.Sophieunhap = Phieunhap.Sophieunhap "
                + "JOIN Hanghoa ON Phieunhap.Mahang = Hanghoa.Mahang "
                + "WHERE Hangnhap.Ngaynhap BETWEEN ? AND ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Thiết lập tham số
            ps.setDate(1, new java.sql.Date(fromDate.getTime()));
            ps.setDate(2, new java.sql.Date(toDate.getTime()));

            // Thực thi truy vấn
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hangnhap hang = new Hangnhap();
                hang.setSophieunhap(rs.getInt("Sophieunhap"));
                hang.setTenhang(rs.getString("Tenhang"));
                hang.setSoluong(rs.getInt("Soluong"));
                hang.setDongia(rs.getDouble("Dongia"));
                hang.setNgaynhap(rs.getDate("Ngaynhap"));
                hangnhapList.add(hang);
            }
        }
        return hangnhapList;
    }

    // Phương thức lấy dữ liệu hàng xuất theo khoảng ngày
    public List<Hangxuat> getHangxuatByDate(Date fromDate, Date toDate) throws SQLException {
        List<Hangxuat> hangxuatList = new ArrayList<>();

        String sql = "SELECT Hanghoa.Mahang, Hangxuat.Sophieuxuat, Hangxuat.Ngayxuat, Phieuxuat.Soluongxuat AS Soluong "
                + "FROM Hangxuat "
                + "JOIN Phieuxuat ON Hangxuat.Sophieuxuat = Phieuxuat.Sophieuxuat "
                + "JOIN Hanghoa ON Phieuxuat.Mahang = Hanghoa.Mahang "
                + "WHERE Hangxuat.Ngayxuat BETWEEN ? AND ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Thiết lập tham số
            ps.setDate(1, new java.sql.Date(fromDate.getTime()));
            ps.setDate(2, new java.sql.Date(toDate.getTime()));

            // Thực thi truy vấn
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hangxuat hang = new Hangxuat();
                hang.setSophieuxuat(rs.getString("Sophieuxuat"));
                hang.setMahang(rs.getString("Mahang"));
                hang.setSoluong(rs.getInt("Soluong"));
                hang.setNgayxuat(rs.getDate("Ngayxuat"));
                hangxuatList.add(hang);
            }
        }
        return hangxuatList;
    }

    public List<TonKho> getBaocaoTonKho(Date fromDate, Date toDate) throws SQLException {
        List<TonKho> tonKhoList = new ArrayList<>();
        String sql = "SELECT hh.Mahang,hh.Tenhang, "
                + "COALESCE(SUM(pn.Soluongtn), 0) AS TongNhap, "
                + "COALESCE(SUM(px.Soluongxuat), 0) AS TongXuat, "
                + "(COALESCE(SUM(pn.Soluongtn), 0) - COALESCE(SUM(px.Soluongxuat), 0)) AS TonKho "
                + "FROM HangHoa hh "
                + "LEFT JOIN Hangnhap hn ON hn.Sophieunhap = pn.Sophieunhap "
                + "LEFT JOIN PhieuNhap pn ON hh.Mahang = pn.Mahang AND hn.Ngaynhap BETWEEN ? AND ? "
                + "LEFT JOIN Hangxuat hx ON hx.Sophieuxuat = pn.Sophieuxuat "
                + "LEFT JOIN PhieuXuat px ON hh.Mahang = px.Mahang AND hx.Ngayxuat BETWEEN ? AND ? "
                + "GROUP BY hh.Mahang, hh.Tenhang "
                + "ORDER BY TonKho DESC"; // Hoặc ASC nếu muốn sắp xếp tăng dần
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            // Thiết lập tham số
            ps.setDate(1, new java.sql.Date(fromDate.getTime()));
            ps.setDate(2, new java.sql.Date(toDate.getTime()));
            ps.setDate(3, new java.sql.Date(fromDate.getTime()));
            ps.setDate(4, new java.sql.Date(toDate.getTime()));

            // Thực thi truy vấn
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TonKho tonKho = new TonKho();
                tonKho.setMahang(rs.getString("Mahang"));
                tonKho.setTenhang(rs.getString("Tenhang"));
                tonKho.setTongNhap(rs.getInt("TongNhap"));
                tonKho.setTongXuat(rs.getInt("TongXuat"));
                tonKho.setTonKho(rs.getInt("TonKho"));
                tonKhoList.add(tonKho);
            }
        }
        return tonKhoList;
    }

    /*
    // Phương thức lấy toàn bộ dữ liệu hàng nhập
    public List<Hangnhap> getAllHangnhap() throws SQLException {
        List<Hangnhap> hangnhapList = new ArrayList<>();
        String sql = "SELECT * FROM Hangnhap";
        try (Connection conn = cn.connectSQL(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Hangnhap hang = new Hangnhap();
                hang.setTenhang(rs.getString("Sophieunhap"));
                hang.setTenhang(rs.getString("Tenhang"));
                hang.setSoluong(rs.getInt("Soluong"));
                hang.setNgaynhap(rs.getDate("Ngaynhap"));
                hangnhapList.add(hang);
            }
        }
        return hangnhapList;
    }

    // Phương thức lấy toàn bộ dữ liệu hàng xuất
    public List<Hangxuat> getAllHangxuat() throws SQLException {
        List<Hangxuat> hangxuatList = new ArrayList<>();
        String sql = "SELECT * FROM Hangxuat";
        try (Connection conn = cn.connectSQL(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Hangxuat hang = new Hangxuat();
                hang.setTenhang(rs.getString("Sophieuxuat"));
                hang.setTenhang(rs.getString("Tenhang"));
                hang.setSoluong(rs.getInt("Soluong"));
                hang.setNgayxuat(rs.getDate("Ngayxuat"));
                hangxuatList.add(hang);
            }
        }
        return hangxuatList;
    }
     */
}
