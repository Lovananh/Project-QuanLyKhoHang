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
    private String Gioitinh;

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

    public String getgioitinh() {
        return Gioitinh;
    }

    public void setgioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
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
        String sql = "SELECT * FROM Nhanvien";

        List<Nhanvien> list = new ArrayList<>();
        try (Connection conn = cn.connectSQL()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); // Sửa lỗi ở đây

            while (rs.next()) {
                Nhanvien nv = new Nhanvien(); // Khởi tạo đối tượng Nhanvien
                nv.setmanv(rs.getString("Manv"));
                nv.settennv(rs.getString("Tennv"));
                nv.setchuvu(rs.getString("Chucvu"));
                nv.setsdt(rs.getString("Sodienthoai"));
                nv.setemail(rs.getString("Email"));
                nv.setdiachi(rs.getString("Diachi"));
                nv.setgioitinh(rs.getString("Gioitinh"));
                list.add(nv);
            }
        }
        return list;
    }

// Truy vấn một dòng dữ liệu theo mã nhân viên (manv)
    public Nhanvien getNhanvien(String Ma) throws SQLException {
        String sql = "SELECT * FROM Nhanvien WHERE Manv = ?";
        Nhanvien nhanvien = null;

        try (Connection conn = cn.connectSQL()) {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, Ma); // Thiết lập tham số cho câu truy vấn
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    nhanvien = new Nhanvien(); // Khởi tạo đối tượng Nhanvien
                    nhanvien.setmanv(rs.getString("Manv"));
                    nhanvien.settennv(rs.getString("Tennv"));
                    nhanvien.setchuvu(rs.getString("Chucvu"));
                    nhanvien.setsdt(rs.getString("Sodienthoai"));
                    nhanvien.setemail(rs.getString("Email"));
                    nhanvien.setdiachi(rs.getString("Diachi"));
                    nhanvien.setgioitinh(rs.getString("Gioitinh"));
                }
            }
        }
        return nhanvien;
    }

    // them 1 dong moi vao tableNhanvien
    public boolean InsertData(Nhanvien obj) throws SQLException {
        String sql = "INSERT INTO  Nhanvien(Manv, Tennv, Chucvu, Sodienthoai,Email,Diachi,Gioitinh) values (?,?,?,?,?,?,?)";
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, obj.getmanv());
            ps.setString(2, obj.gettennv());
            ps.setString(3, obj.getchucvu());
            ps.setString(4, obj.getsdt());
            ps.setString(5, obj.getemail());
            ps.setString(6, obj.getdiachi());
            ps.setString(7, obj.getgioitinh());
            int rowInserted = ps.executeUpdate();
            return rowInserted > 0; // tra ve true neu chen thanh cong    
        }
    }

    // sua 1 dong
    public boolean EditData(Nhanvien obj) throws SQLException {
        String sql = "UPDATE Nhanvien SET  Tennv =?, Chucvu=?, Sodienthoai =? , Email=? , Diachi =? ,Gioitinh=? WHERE Manv = ?";
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, obj.gettennv());
            ps.setString(2, obj.getchucvu());
            ps.setString(3, obj.getsdt());
            ps.setString(4, obj.getemail());
            ps.setString(5, obj.getdiachi());
            ps.setString(6, obj.getgioitinh());
            ps.setString(7, obj.getmanv());
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

    // Tim kiem 
    public List<Nhanvien> timKiemNhanVienTheoTen(String tenNhanVien) throws SQLException {
        List<Nhanvien> list = new ArrayList<>();
        String sql = "SELECT * FROM Nhanvien WHERE Tennv LIKE ?";

        try (Connection conn = cn.connectSQL()) {

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + tenNhanVien + "%");
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Nhanvien nv = new Nhanvien();
                nv.setmanv(rs.getString("Manv"));
                nv.settennv(rs.getString("Tennv"));
                nv.setchuvu(rs.getString("Chucvu"));
                nv.setsdt(rs.getString("Sodienthoai"));
                nv.setemail(rs.getString("Email"));
                nv.setdiachi(rs.getString("Diachi"));
                nv.setgioitinh(rs.getString("Gioitinh"));
                list.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
