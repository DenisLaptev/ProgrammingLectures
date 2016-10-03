package com.kov.lectures.lecture_8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Kovantonlenko on 12/10/2015.
 */
public class MyConnection {

    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test2";
    private static String user = "root";
    private static String password = "root";

    public static void main(String[] args) {
        Connection connection = createConnection();
        System.out.println("connection is created");
    }

    public static Connection createConnection() {
        Connection conn = null;

        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection createConnectionWay2() {
        //второй способ создать connection.

        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
