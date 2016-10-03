package com.kov.lectures.lecture_8_jdbc.item_8;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.*;

/**
 * Created by Kovantonlenko on 12/15/2015.
 */
public class SavePointExample {

    public static final String QUERY = "INSERT INTO user (id, name, age) VALUES (?,?,?)";

    public static void main(String[] args) throws SQLException {
        savePointExample();
    }

    private static void savePointExample() throws SQLException {
        Savepoint savepoint1 = null;

        Connection conn = MyConnection.createConnection();
        conn.setAutoCommit(false);

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(QUERY);
            preparedStatement.setInt(1, 666);
            preparedStatement.setString(2, "myUser");
            preparedStatement.setInt(3, 22);
            preparedStatement.execute();

            savepoint1 = conn.setSavepoint("savepoint1");

            preparedStatement = conn.prepareStatement(QUERY);
            preparedStatement.setInt(1, 666);
            preparedStatement.setString(2, "newMyUser");
            preparedStatement.setInt(3, 100);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e);
            conn.rollback(savepoint1);

        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                conn.commit();
                conn.close();
            }
        }

    }
}
