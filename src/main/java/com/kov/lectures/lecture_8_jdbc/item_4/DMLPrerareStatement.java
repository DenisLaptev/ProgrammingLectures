package com.kov.lectures.lecture_8_jdbc.item_4;

import com.kov.lectures.lecture_8_jdbc.MyConnection;
import com.kov.lectures.lecture_8_jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 12/14/2015.
 */
public class DMLPrerareStatement {

    public static final String QUERY = "INSERT INTO user (name, age) VALUES (?,?)";
    public static final String QUERY_WITH_ID = "INSERT INTO user (id, name, age) VALUES (?,?,?)";
    public static final String UPDATE_USER = "UPDATE user SET name = ? WHERE id = ?";
    private static final String SELECT_USER_BY_NAME = "Select * from user where name = ?";

    public static void main(String[] args) throws SQLException {
        insert(QUERY);
        update(UPDATE_USER);
        List<User> users = findUsersByName(SELECT_USER_BY_NAME, "Santa");

        System.out.println(users);
    }

    private static void insert(String query) throws SQLException {

        Connection dbConnection = MyConnection.createConnection();
        PreparedStatement preparedStatement = dbConnection.prepareStatement(query); // �������� ���� ������������� �����

//        preparedStatement.setInt(1, 666); // ���� ��������� id
        preparedStatement.setString(1, "myUser");
        preparedStatement.setInt(2, 100);

        preparedStatement.executeUpdate();

        dbConnection.close();
    }

    private static void update(String query) throws SQLException {
        Connection dbConnection = MyConnection.createConnection();
        PreparedStatement preparedStatement = dbConnection.prepareStatement(query);

        preparedStatement.setString(1, "TestUpdate");
        preparedStatement.setInt(2, 3);

        preparedStatement.executeUpdate();

        dbConnection.close();
    }

    private static List<User> findUsersByName(String sql, String name) throws SQLException {
        Connection dbConnection = MyConnection.createConnection();

        PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<User> usersList = new ArrayList<>();

        while (resultSet.next()) {

            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));

            usersList.add(user);
        }
        dbConnection.close();

        return usersList;
    }


}

