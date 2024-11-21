package Proccess;

import Database.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date; // Sử dụng java.util.Date
import java.util.List;

public class DateDAO {

    public class Hangxuat {

        private int id;
        private String tenhang;
        private int soluong;
        private Date ngayxuat;

        // Getter và Setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        private int id;
        private String tenhang;
        private int soluong;
        private Date ngaynhap;

        // Getter và Setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

    public List<Hangnhap> getHangnhapBydate(Date fromnhap, Date tonhap) throws SQLException {
        List<Hangnhap> hangnhapList = new ArrayList<>();
        String sql = "SELECT * FROM Hangnhap WHERE Ngaynhap BETWEEN ? AND ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Thiết lập tham số cho câu truy vấn
            ps.setDate(1, new java.sql.Date(fromnhap.getTime()));
            ps.setDate(2, new java.sql.Date(tonhap.getTime()));

            // Thực thi câu truy vấn
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hangnhap hang = new Hangnhap();
                hang.setId(rs.getInt("Id"));
                hang.setTenhang(rs.getString("Tenhang"));
                hang.setSoluong(rs.getInt("Soluong"));
                hang.setNgaynhap(rs.getDate("Ngaynhap"));
                hangnhapList.add(hang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hangnhapList;
    }

    public List<Hangxuat> getHangxuatByDateRange(Date fromDate, Date toDate) {
        List<Hangxuat> hangxuatList = new ArrayList<>();
        String sql = "SELECT * FROM Hangxuat WHERE Ngayxuat BETWEEN ? AND ?";

        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {

            // Thiết lập tham số cho câu truy vấn
            ps.setDate(1, new java.sql.Date(fromDate.getTime()));
            ps.setDate(2, new java.sql.Date(toDate.getTime()));

            // Thực thi câu truy vấn
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hangxuat hang = new Hangxuat();
                hang.setId(rs.getInt("Id"));
                hang.setTenhang(rs.getString("Tenhang"));
                hang.setSoluong(rs.getInt("Soluong"));
                hang.setNgayxuat(rs.getDate("Ngayxuat"));
                hangxuatList.add(hang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hangxuatList;
    }

    

}
