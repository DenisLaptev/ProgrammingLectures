package com.kov.lectures.lecture_8_jdbc.item_7;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by Kovantonlenko on 12/14/2015.
 */
public class TransactionExample {
    private static final String INSERT_QUERY = "INSERT INTO user (id, name, age) VALUES (?,?,?)";
    public static final String UPDATE_USER = "UPDATE user SET name = ? WHERE name = ?";

    public static void main(String[] args) throws SQLException {
        insertWithUpdate();
    }

    private static void insertWithUpdate() throws SQLException {
        Connection dbConnection = MyConnection.createConnection();
        PreparedStatement preparedStatement = null;
        try {

            dbConnection.setAutoCommit(false);

            preparedStatement = dbConnection.prepareStatement(INSERT_QUERY);
            preparedStatement.setInt(1, 1000);
            preparedStatement.setString(2, "test_Transaction");
            preparedStatement.setInt(3, 25);
            preparedStatement.executeUpdate();

            dbConnection.commit();

            preparedStatement = dbConnection.prepareStatement(UPDATE_USER);
            preparedStatement.setString(1, "test_Transaction_Update");
            preparedStatement.setString(2, "test_Transaction");
            preparedStatement.executeUpdate();

            dbConnection.commit();// Если убрать эту строчку, то посколку дальше
            //идут ошибочные команды, программа откатится до commit-а, и
            //имя не обновится,
            //а останется "test_Transaction", вместо "test_Transaction_Update".

            preparedStatement = dbConnection.prepareStatement(INSERT_QUERY);
            preparedStatement.setInt(1, 1000);
            preparedStatement.setString(2, "WRONG_USER_ID");
            preparedStatement.setInt(3, 25);
            preparedStatement.executeUpdate();

            dbConnection.commit();

        } catch (SQLException e) {
            dbConnection.rollback();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }

        dbConnection.close();
    }
}

