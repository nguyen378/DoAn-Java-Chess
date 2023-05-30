/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donutnv.doan.java.chess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Chi Nguyen
 */
public class DBConnection {
   public static void main(String args) {
        Connection conn = null;
        String url = "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=Doan_Java_Chess";
        

        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to SQL Server!");
            // Thực hiện các thao tác với cơ sở dữ liệu ở đây
            
        } catch (SQLException e) {
            System.out.println("Error connecting to SQL Server!");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Disconnected from SQL Server!");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}