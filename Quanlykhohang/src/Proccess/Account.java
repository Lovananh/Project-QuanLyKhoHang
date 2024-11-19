/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;

import Database.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Account {

    public Connect cn = new Connect();

    // kiem tra tai khoan da co chua
    public boolean CheckAccount(String username) {
        String check = "SELECT *FROM Users WHERE username =?";
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement checkps = conn.prepareStatement(check);
            checkps.setString(1, username);
            ResultSet rs = checkps.executeQuery();
            boolean exists = rs.next();
            rs.close();
            return exists;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // them tai khan
    public boolean AddAccount(String username, String hashedPassword, String email) {
        String sql = "INSERT INTO Users (username,password,email) VALUES (?,?,?)";
        try (Connection conn = cn.connectSQL()) {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, hashedPassword);
            st.setString(3, email);
            int rowInserted = st.executeUpdate();
            return rowInserted > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // dangnhap
    public boolean Login(String name, String hashedPass) {
        try (Connection conn = cn.connectSQL()) {
            String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, hashedPass);

            ResultSet rs = stmt.executeQuery();
            boolean login = rs.next();

            rs.close();
            return login;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
