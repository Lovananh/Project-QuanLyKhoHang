package Proccess;

import Database.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateDAO {

    public class Hangxuat {

        private String sophieuxuat ;
        private String tenhang;
        private int soluong;
        private Date ngayxuat;

        // Getter và Setter
        public String getSophieuxuat() {
            return sophieuxuat;
        }

        public void setSophieuxuat(String sophieuxuat) {
            this.sophieuxuat = sophieuxuat;
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

        public Date getNgayxuat() {
            return ngayxuat;
        }

        public void setNgayxuat(Date ngayxuat) {
            this.ngayxuat = ngayxuat;
        }
    }
    
    public class Hangnhap {
        private String sophieunhap ;
        private String tenhang;
        private int soluong;
        private Date ngaynhap;

        // Getter và Setter
         public String getSophieunhap() {
            return sophieunhap;
        }

        public void setSophieunhap(String sophieunhap) {
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

        public Date getNgaynhap() {
            return ngaynhap;
        }

        public void setNgaynhap(Date ngaynhap) {
            this.ngaynhap = ngaynhap;
        }
    }

    
    Connect cn = new Connect();

    // Phương thức lấy dữ liệu hàng nhập theo khoảng ngày
    public List<Hangnhap> getHangnhapByDate(Date fromDate, Date toDate) throws SQLException {
        List<Hangnhap> hangnhapList = new ArrayList<>();
        String sql = "SELECT * FROM Hangnhap WHERE Ngaynhap BETWEEN ? AND ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Thiết lập tham số
            ps.setDate(1, new java.sql.Date(fromDate.getTime()));
            ps.setDate(2, new java.sql.Date(toDate.getTime()));

            // Thực thi truy vấn
            ResultSet rs = ps.executeQuery();
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

    // Phương thức lấy dữ liệu hàng xuất theo khoảng ngày
    public List<Hangxuat> getHangxuatByDate(Date fromDate, Date toDate) throws SQLException {
        List<Hangxuat> hangxuatList = new ArrayList<>();
        String sql = "SELECT * FROM Hangxuat WHERE Ngayxuat BETWEEN ? AND ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Thiết lập tham số
            ps.setDate(1, new java.sql.Date(fromDate.getTime()));
            ps.setDate(2, new java.sql.Date(toDate.getTime()));

            // Thực thi truy vấn
            ResultSet rs = ps.executeQuery();
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
}
