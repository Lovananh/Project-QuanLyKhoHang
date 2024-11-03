package Proccess;

import java.sql.*;
import Database.Connect;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class Nhanvien {

    private String manv;
    private String tennv;
    private String chuvu;
    private String sdt;
    private String email;
    private String diachi;

    public void setmanv(String manv) {
        this.manv = manv;
    }

    public String getmanv() {
        return manv;
    }

    public void settennv(String tennv) {
        this.tennv = tennv;
    }

    public String gettennv() {
        return tennv;
    }

    public void setchuvu(String chucvu) {
        this.chuvu = chucvu;
    }

    public String getchucvu() {
        return chuvu;
    }

    public void setsdt(String sdt) {
        this.sdt = sdt;
    }

    public String getsdt() {
        return sdt;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getdiachi() {
        return diachi;
    }

    // khoi tao database
    public Connect cn = new Connect();

    // Truy vấn vào du lieu trong table Nhanvien
    public List<Nhanvien> getNhanvien() throws SQLException {
        String sql = "SELECT*FROM Nhanvien";

        List<Nhanvien> list = new ArrayList<>();
        try (Connection conn = cn.connectSQL()) {

            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Nhanvien nv = new Nhanvien(); // khoi tao lop nhanvien
                nv.setmanv(rs.getString("Manv"));
                nv.settennv(rs.getString("Tennv"));
                nv.setchuvu(rs.getString("Chucvu"));
                nv.setsdt(rs.getString("Sodienthoai"));
                nv.setemail(rs.getString("Email"));
                nv.setdiachi(rs.getString("Diachi"));
                list.add(nv);
            }
        }
        return list;
    }

    //truy van cac dong theo manv
    public Nhanvien getNhanvien(String Ma) throws SQLException {
        String sql = "SELECT*FROM Nhanvien where Manv =?";
        Nhanvien nhanvien = null;

        try (Connection conn = cn.connectSQL()) {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, Ma);
//            ResultSet rs = pstm.executeQuery();/
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    nhanvien = new Nhanvien(); // khoi tao lop nhanvien
                    nhanvien.setmanv(rs.getString("Manv"));
                    nhanvien.settennv(rs.getString("Tennv"));
                    nhanvien.setchuvu(rs.getString("Chucvu"));
                    nhanvien.setsdt(rs.getString("Sodienthoai"));
                    nhanvien.setemail(rs.getString("Email"));
                    nhanvien.setdiachi(rs.getString("Diachi"));
                }
            }

        }
        return nhanvien;
    }

    // them 1 dong moi vao tableNhanvien
    public boolean InsertData(Nhanvien obj) throws SQLException {
        String sql = "INSERT INTO  Nhanvien(Manv, Tennv, Chucvu, Sodienthoai,Email,Diachi) values (?,?,?,?,?,?)";
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, obj.getmanv());
            ps.setString(2, obj.gettennv());
            ps.setString(3, obj.getchucvu());
            ps.setString(4, obj.getsdt());
            ps.setString(5, obj.getemail());
            ps.setString(6, obj.getdiachi());
            int rowInserted = ps.executeUpdate();
            return rowInserted > 0; // tra ve true neu chen thanh cong    
        }
    }

    // sua 1 dong
    public boolean EditData(Nhanvien obj) throws SQLException {
        String sql = "UPDATE Nhanvien set Manv = ? where Tennv =?, Chucvu=?, Sodienthoai =? , Email=? , Diachi =?";
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, obj.getmanv());
            ps.setString(2, obj.gettennv());
            ps.setString(3, obj.getchucvu());
            ps.setString(4, obj.getsdt());
            ps.setString(5, obj.getemail());
            ps.setString(6, obj.getdiachi());
            int rowUpdated = ps.executeUpdate();
            return rowUpdated > 0;
        }
    }
    //xoa 1 dong du lieu khoi table

    public boolean DeleteData(String ml) throws SQLException {
        String sql = "DELETE FROM Nhanvien WHERE Manv = ?";

        try (Connection conn = cn.connectSQL()) {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, ml);
            int rowsDeleted = stm.executeUpdate();
            return rowsDeleted > 0;  // Trả về true nếu xóa thành công
        }
    }
}
