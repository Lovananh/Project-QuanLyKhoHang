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

public class Hangxuat {

    private String Manv;
    private int Sophieuxuat;
    private Date Ngayxuat;
    private String Mathukho;
    private String Mahang;
    private int Soluong;
    private double Gia;

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

    //        String sql = "SELECT hx.Manv, hx.Sophieuxuat, hx.Ngayxuat, hx.Mathukho, "
//                + "px.Mahang, px.Soluongxuat, hh.Gia "
//                + "FROM Hangxuat hx "
//                + "JOIN Phieuxuat px ON hx.Sophieuxuat = px.Sophieuxuat "
//                + "JOIN Hanghoa hh ON px.Mahang = hh.Mahang";
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
        String sql = "INSERT INTO Hangxuat (Manv, Sophieuxuat, Ngayxuat, Mathukho) VALUES (?, ?, ?, ?)";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, obj.getManv());
            ps.setInt(2, obj.getSophieuxuat());
            ps.setDate(3, new java.sql.Date(obj.getNgayxuat().getTime()));
            ps.setString(4, obj.getMathukho());
            return ps.executeUpdate() > 0;
        }
    }

// sua thong tin
    public boolean EditHangxuat(Hangxuat obj) throws SQLException {
        String sql = "UPDATE Hangxuat SET Manv = ?, Ngayxuat = ?, Mathukho = ? WHERE Sophieuxuat = ?";
        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, obj.getManv());
            ps.setDate(2, new java.sql.Date(obj.getNgayxuat().getTime()));
            ps.setString(3, obj.getMathukho());
            ps.setInt(4, obj.getSophieuxuat());
            return ps.executeUpdate() > 0;
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
