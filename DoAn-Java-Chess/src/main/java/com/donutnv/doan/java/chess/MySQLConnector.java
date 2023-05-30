/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donutnv.doan.java.chess;
import java.sql.*;

/**
 *
 * @author PC
 */
public class MySQLConnector {
    private Connection connection;
    
    public MySQLConnector() {
        // Thay đổi thông tin kết nối tại đây
        String url = "jdbc:mysql://localhost:3306/Doan_Java_Chess";
        String username = "sa";
        String password = "vanhieu04042002";
        
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String getDataFromTable(String tableName, String columnName) {
        String data = "";
        
        try {
            String sql = "SELECT " + columnName + " FROM " + tableName;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            if (resultSet.next()) {
                data = resultSet.getString(columnName);
            }
            
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return data;
    }
    
}
