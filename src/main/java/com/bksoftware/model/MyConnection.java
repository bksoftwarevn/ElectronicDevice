package com.bksoftware.model;

import com.bksoftware.common.AppConfig;

import java.sql.*;

public class MyConnection {

    //khi connect thanh cong bang driver thi tra ve connection chua thong tin database
    public static Connection connection = null; //khi chua ket noi la object ne de null
    private static Statement Statement = null;// dung de luu querry de thuc hien
    private static ResultSet ResultSet = null;// chua ket qua ta ve khi querry statement
    //testDriver

    public void driverTest() throws ClassNotFoundException {
        try {
            Class.forName(AppConfig.DRIVER);
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("SQL Server JDBC Driver not found" + ex.getMessage());
        }
    }

    public Connection getMyconnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            driverTest();
            try {
                connection = DriverManager.getConnection(AppConfig.URL, AppConfig.USER, AppConfig.PASS); //quan ly tat ca ket noi den datamysql
                if (connection != null)
                System.out.println("DB connected");
            } catch (Exception e) {
                throw new SQLException("Khong the ket noi den DB " + e.getMessage());
            }
        }
        return connection;
    }


    // donh lai tat ca cac ket noi, dong nguoc mo
    public void closeConnection() throws SQLException {
        //close resultset
        if (ResultSet != null) {
            ResultSet.close();
        }
        //close statement
        if (Statement != null) {
            Statement.close();
        }
        //close connection
        if (connection != null) {
            connection.close();
        }
    }
}
