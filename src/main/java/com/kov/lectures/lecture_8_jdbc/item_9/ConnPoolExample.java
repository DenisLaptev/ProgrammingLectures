package com.kov.lectures.lecture_8_jdbc.item_9;

import com.kov.lectures.lecture_8_jdbc.model.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Kovantonlenko on 12/15/2015.
 */
public class ConnPoolExample {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.jdbc.Driver"); //loads the jdbc driver
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test2");
        cpds.setUser("root");
        cpds.setPassword("root");

        cpds.setMinPoolSize(5);
        cpds.setAcquireIncrement(5);
        cpds.setMaxPoolSize(50);

        Connection conn = cpds.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from user");

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));

            System.out.println(user);
            System.out.println("-------------------------");

        }
    }
}
