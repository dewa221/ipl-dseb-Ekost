/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sikobra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hary Permana
 */
public class KoneksiDB {

    public static Connection conn;
    public static Statement stm;
    public static ResultSet rs;
    String sql;

    public Connection getConnection() {
        return conn;
    }

    public void Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, User, Password;
            url = "jdbc:mysql://localhost:3306/sikobra"; //alamat DB  
            User = "root";
            Password = "";
            conn = DriverManager.getConnection(url, User, Password);

            System.out.println("Koneksi Sukses");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + e);
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!" + ex
            );
        }
    }

    public static void main(String[] kon) {
        new KoneksiDB().Connection();
    }

}
