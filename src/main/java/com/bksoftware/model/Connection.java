//package com.bksoftware.model;
//
//import com.bksoftware.common.AppConfig;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Connection {
//
//    //khi connect thanh cong bang driver thi tra ve connection chua thong tin database
//    private static Connection conn = null; //khi chua ket noi la object ne de null
//    private static Statement Statement = null;// dung de luu querry de thuc hien
//    private static ResultSet ResultSet = null;// chua ket qua ta ve khi querry statement
//    //testDriver
//
//    public void driverTest() throws ClassNotFoundException {
//        try {
//            Class.forName(AppConfig.DRIVER);
//        } catch (ClassNotFoundException ex) {
//            throw new ClassNotFoundException("SQL Server JDBC Driver not found" + ex.getMessage());
//        }
//    }
//
//    public Connection getMyconnection() throws ClassNotFoundException, SQLException {
//        if (conn == null) {
//            driverTest();
//            try {
//                conn = DriverManager.getConnection(AppConfig.URL, AppConfig.USER, AppConfig.PASS); //quan ly tat ca ket noi den datamysql
//            } catch (Exception e) {
//                throw new SQLException("Khong the ket noi den DB " + e.getMessage());
//            }
//        }
//        return conn;
//    }
//
//    //lay statement de truy van
//    public Statement getStatement() throws SQLException, ClassNotFoundException {
//        if (Statement == null ? true : Statement.isClosed()) { //statement null hoac da dong
//            Statement = getMyconnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            System.out.println(Statement.toString());
//        }
//        return Statement;
//    }
//
//    public ResultSet excuteStatementQuery(String query) throws SQLException {
//        try {
//            ResultSet = getStatement().executeQuery(query);
//        } catch (Exception e) {
//            throw new SQLException("ERROR" + e.getMessage());
//        }
//        return ResultSet;
//    }
//
//    // donh lai tat ca cac ket noi, dong nguoc mo
//    public void closeConnection() throws SQLException {
//        //close resultset
//        if (ResultSet != null) {
//            ResultSet.close();
//        }
//        //close statement
//        if (Statement != null) {
//            Statement.close();
//        }
//        //close connection
//        if (conn != null) {
//            conn.close();
//        }
//    }
//}
