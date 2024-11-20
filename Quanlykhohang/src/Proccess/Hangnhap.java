/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;

import java.sql.*;
import Database.Connect;
import java.util.ArrayList;
import java.util.List;

public class Hangnhap {

    private String mahang;
    private String makho;
    private String mathukho;
    private int sophieun;
    private int soluongtn;
    private int soluongxn;
    private Date ngaynhap;
    private double dongia;

    public void setmahang(String mahang) {
        this.mahang = mahang;
    }

    public String getmahang() {
        return mahang;
    }

    public void setmakho(String makho) {
        this.makho = makho;
    }

    public String getmakho() {
        return makho;
    }

    public void setmathukho(String mathukho) {
        this.mathukho = mathukho;
    }

    public String getmathukho() {
        return mathukho;
    }

    public void setsophieun(int sophieun) {
        this.sophieun = sophieun;
    }

    public int getsophieun() {
        return sophieun;
    }

    public void setsoluongtn(int soluongtn) {
        this.soluongtn = soluongtn;
    }

    public int getsoluongtn() {
        return soluongtn;
    }

    public void setsoluongxn(int soluongxn) {
        this.soluongxn = soluongxn;
    }

    public int getsoluongxn() {
        return soluongxn;
    }

    public void setngaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public Date getngaynhap() {
        return ngaynhap;
    }

    public void setdongia(double dongia) {
        this.dongia = dongia;
    }

    public double getdongia() {
        return dongia;
    }

    Connect cn = new Connect();

    public List<Hangnhap> getHangnhap() throws SQLException {
        String sql = "SELECT Hangnhap.Makho, Hangnhap.Sophieunhap, Hangnhap.Mathukho, Hangnhap.Ngaynhap, "
                + "Phieunhap.Soluongtn, Phieunhap.Soluongxn, Phieunhap.Dongia, Hanghoa.Mahang "
                + "FROM Hangnhap "
                + "JOIN Phieunhap ON Hangnhap.Sophieunhap = Phieunhap.Sophieunhap "
                + "JOIN Hanghoa ON Phieunhap.Mahang = Hanghoa.Mahang "
                + "JOIN Khohang ON Hangnhap.Makho = Khohang.Makho";

        List<Hangnhap> list = new ArrayList<>();
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hangnhap hn = new Hangnhap();
                hn.setmahang(rs.getString("Mahang"));
                hn.setmakho(rs.getString("Makho"));
                hn.setngaynhap(rs.getDate("Ngaynhap"));
                hn.setmathukho(rs.getString("Mathukho"));
                hn.setsophieun(rs.getInt("Sophieunhap"));
                hn.setsoluongtn(rs.getInt("Soluongtn"));
                hn.setsoluongxn(rs.getInt("Soluongxn"));
                hn.setdongia(rs.getDouble("Dongia"));
                list.add(hn);
            }
        }
        return list;
    }

    // Truy vấn một hàng từ bảng Hangnhap theo so phieu
    public Hangnhap getHangnhap(int soPhieunhap) throws SQLException {
        String sql = "SELECT Hangnhap.Makho, Hangnhap.Sophieunhap, Hangnhap.Mathukho, Hangnhap.Ngaynhap, "
                + "Phieunhap.Soluongtn, Phieunhap.Soluongxn, Phieunhap.Dongia, Hanghoa.Mahang "
                + "FROM Hangnhap "
                + "JOIN Phieunhap ON Hangnhap.Sophieunhap = Phieunhap.Sophieunhap "
                + "JOIN Hanghoa ON Phieunhap.Mahang = Hanghoa.Mahang "
                + "JOIN Khohang ON Hangnhap.Makho = Khohang.Makho "
                + "WHERE Hangnhap.Sophieunhap = ?";
        Hangnhap hangnhap = null;

        try (Connection conn = cn.connectSQL(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, soPhieunhap);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    hangnhap = new Hangnhap();
                    hangnhap.setmahang(rs.getString("Mahang"));
                    hangnhap.setmakho(rs.getString("Makho"));
                    hangnhap.setmathukho(rs.getString("Mathukho"));
                    hangnhap.setsophieun(rs.getInt("Sophieunhap"));
                    hangnhap.setsoluongtn(rs.getInt("Soluongtn"));
                    hangnhap.setsoluongxn(rs.getInt("Soluongxn"));
                    hangnhap.setngaynhap(rs.getDate("Ngaynhap"));
                    hangnhap.setdongia(rs.getDouble("Dongia"));
                }
            }
        }
        return hangnhap;
    }

    // Thêm mới một dòng vào bảng Hangnhap
    public boolean InsertHangnhap(Hangnhap obj) throws SQLException {
        try (Connection conn = cn.connectSQL()) {
            conn.setAutoCommit(false); // Bắt đầu một transaction
            // Thêm vào bảng Hangnhap
            String sqlHangnhap = "INSERT INTO Hangnhap (Makho, Sophieunhap, Ngaynhap , Mathukho) VALUES (?,?,?,?)";
            try (PreparedStatement psHangnhap = conn.prepareStatement(sqlHangnhap)) {
                psHangnhap.setString(1, obj.getmakho());
                psHangnhap.setInt(2, obj.getsophieun());
                psHangnhap.setDate(3, new java.sql.Date(obj.getngaynhap().getTime()));
                psHangnhap.setString(4, obj.getmathukho());
                psHangnhap.executeUpdate();
            }

            // Thêm thông tin vào bảng Phieunhap
            String sqlPhieunhap = "INSERT INTO Phieunhap (Mahang, Sophieunhap, Soluongtn, Soluongxn, Dongia) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement psPhieunhap = conn.prepareStatement(sqlPhieunhap)) {
                psPhieunhap.setString(1, obj.getmahang());
                psPhieunhap.setInt(2, obj.getsophieun());
                psPhieunhap.setInt(3, obj.getsoluongtn());
                psPhieunhap.setInt(4, obj.getsoluongxn());
                psPhieunhap.setDouble(5, obj.getdongia());
                psPhieunhap.executeUpdate();
            }

            conn.commit(); // Commit transaction
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Cập nhật thông tin hàng nhập
    public boolean EditHangnhap(Hangnhap obj) throws SQLException {
        try (Connection conn = cn.connectSQL()) {
            conn.setAutoCommit(false); // Bắt đầu một transaction

           
            String sqlHangnhap = "UPDATE Hangnhap SET Makho = ?, Ngaynhap = ?, Mathukho = ? WHERE Sophieunhap = ?";
            try (PreparedStatement psHangnhap = conn.prepareStatement(sqlHangnhap)) {
                psHangnhap.setString(1, obj.getmakho());
                psHangnhap.setDate(2, new java.sql.Date(obj.getngaynhap().getTime()));
                psHangnhap.setString(3, obj.getmathukho());
                psHangnhap.setInt(4, obj.getsophieun()); 
                int updatedRows = psHangnhap.executeUpdate();
                if (updatedRows == 0) {
                    // Nếu không có dòng nào được cập nhật, có thể ném lỗi hoặc xử lý khác
                    throw new SQLException("Không tìm thấy hàng nhập với mã số phiếu nhập " + obj.getsophieun());
                }
            }

            // Cập nhật thông tin trong bảng Phieunhap
            String sqlPhieunhap = "UPDATE Phieunhap SET Soluongtn = ?, Soluongxn = ?, Dongia = ? WHERE Mahang = ? AND Sophieunhap = ?";
            try (PreparedStatement psPhieunhap = conn.prepareStatement(sqlPhieunhap)) {
                psPhieunhap.setInt(1, obj.getsoluongtn());
                psPhieunhap.setInt(2, obj.getsoluongxn());
                psPhieunhap.setDouble(3,obj.getdongia());
                psPhieunhap.setString(4, obj.getmahang());
                psPhieunhap.setInt(5, obj.getsophieun());
                int updatedRows = psPhieunhap.executeUpdate();
                if (updatedRows == 0) {
                    // Nếu không có dòng nào được cập nhật, có thể ném lỗi hoặc xử lý khác
                    throw new SQLException("Không tìm thấy phiếu nhập với mã hàng và số phiếu nhập " + obj.getmahang() + ", " + obj.getsophieun());
                }
            }
            conn.commit(); // Commit transaction
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Xóa một dòng khỏi bảng Hangnhap
    public boolean DeleteHangnhap(int sophieunhap) throws SQLException {
        try (Connection conn = cn.connectSQL()) {
            conn.setAutoCommit(false); // Bắt đầu một transaction

            // Xóa thông tin phiếu nhập từ bảng Phieunhap
            String sqlPhieunhap = "DELETE FROM Phieunhap WHERE Sophieunhap = ?";
            try (PreparedStatement psPhieunhap = conn.prepareStatement(sqlPhieunhap)) {
                psPhieunhap.setInt(1, sophieunhap);
                psPhieunhap.executeUpdate();
            }

            // Xóa thông tin hàng nhập từ bảng Hangnhap
            String sqlHangnhap = "DELETE FROM Hangnhap WHERE Sophieunhap = ?";
            try (PreparedStatement psHangnhap = conn.prepareStatement(sqlHangnhap)) {
                psHangnhap.setInt(1, sophieunhap);
                psHangnhap.executeUpdate();
            }

            conn.commit(); // Commit transaction
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
