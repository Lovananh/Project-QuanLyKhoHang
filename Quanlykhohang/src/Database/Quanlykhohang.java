/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Database;

import Interface.frTrangChu;
import java.sql.Connection;
import java.sql.SQLException;

public class Quanlykhohang {

    public static void main(String[] args) {
        frTrangChu trangchu = new frTrangChu();
        trangchu.setVisible(true);
        Connect dbConnect = new Connect();
        try {
            Connection conn = dbConnect.connectSQL();
            if (conn != null) {
                System.out.println("Kết nối thành công!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
