package com.bksoftware.model;

import com.bksoftware.common.AppConfig;

import java.sql.*;

public class MyConnection {

    //khi connect thanh cong bang driver thi tra ve connection chua thong tin database
    public static Connection connection = null; //khi chua ket noi la object ne de null

    public void driverTest() throws ClassNotFoundException {
        try {
            Class.forName(AppConfig.DRIVER);
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("SQL Server JDBC Driver not found" + ex.getMessage());
        }
    }

    public Connection connectDB() throws ClassNotFoundException, SQLException {
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
        //close connection
        if (connection != null) {
            connection.close();
            System.out.println("Connection is closed");
        }
    }
}
