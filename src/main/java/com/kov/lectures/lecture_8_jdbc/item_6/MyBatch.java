package com.kov.lectures.lecture_8_jdbc.item_6;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kovantonlenko on 12/14/2015.
 */
public class MyBatch {
    public static final String INSERT_USER = "INSERT INTO user (name, age) VALUES (?,?)";

    public static void main(String[] args) throws SQLException {
        batchUpdate(INSERT_USER);
    }

    private static void batchUpdate(String sql) throws SQLException {
        Connection dbConnection = MyConnection.createConnection();
        PreparedStatement preparedStatement = null;
            preparedStatement = dbConnection.prepareStatement(sql);


            dbConnection.setAutoCommit(false);

            for (int i = 0; i < 5; i++) {
                preparedStatement.setString(1, "test_" + i);
                preparedStatement.setInt(2, i);
                preparedStatement.addBatch();
            }


            int[] counts = preparedStatement.executeBatch();

            System.out.println("Were executed " + counts.length + " rows");
            dbConnection.commit();


            dbConnection.close();
        }
    }
