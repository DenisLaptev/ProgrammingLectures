package com.kov.lectures.lecture_8_jdbc.item_5;

import com.kov.lectures.lecture_8_jdbc.MyConnection;
import com.kov.lectures.lecture_8_jdbc.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 12/14/2015.
 */
public class UpdatableResultSet {

    private static final String SELECT_USER_BY_NAME = "Select * from user where name = ?";

    public static void main(String[] args) throws SQLException {
        scrollByUsers(SELECT_USER_BY_NAME, "testUpdate1", true);
    }

    private static void scrollByUsers(String sql, String name, boolean isUpdatable) throws SQLException {
        Connection dbConnection = MyConnection.createConnection();

        PreparedStatement preparedStatement = dbConnection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // CONCUR_UPDATABLE - ����������� ResultSet
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();


        while (resultSet.next()) {
//.updateString(String columnLabel, String x) - это метод интерфейса ResultSet.
//Он вписывает значение x в столбец columnLabel выбранного ряда.
            resultSet.updateString("name", "myUser");
            resultSet.updateString("id", "1000000");

            if (isUpdatable)
                resultSet.updateRow();
            else
                resultSet.cancelRowUpdates();
        }
        dbConnection.close();

    }
}
