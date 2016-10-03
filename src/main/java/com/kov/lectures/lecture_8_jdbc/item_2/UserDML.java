package com.kov.lectures.lecture_8_jdbc.item_2;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Kovantonlenko on 12/11/2015.
 */
public class UserDML {

    private static final String INSERT_USER_1 = "INSERT INTO user (id, name, age) VALUES (1, 'Anton', 27)";
    private static final String INSERT_USER_2 = "INSERT INTO user (id, name, age) VALUES (2, 'Vitia', 30)";
    private static final String INSERT_USER_3 = "INSERT INTO user (id, name, age) VALUES (3, 'Pavel', 33)";
    private static final String DELETE_USER = "DELETE FROM user";
    private static final String UPDATE_USER_1 = "UPDATE user set name = 'Santa' where id = 1";

    public static void main(String[] args) throws SQLException {
// очищаем БД от прежних записей. И записываем по-новому юзеров.При этом id не повторятся.
        delete(DELETE_USER);

        insert(INSERT_USER_1);
        insert(INSERT_USER_2);
        insert(INSERT_USER_3);

        update(UPDATE_USER_1);

/*
Если в конце выполним этот запрос, то всё содержимое БД удалится.
        delete(DELETE_USER);
*/
    }

    private static void update(String updateUser) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(updateUser);
        System.out.println("The numbers of updated rows is " + count);

        connection.close();
    }

    private static void delete(String deleteUser) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(deleteUser);
        System.out.println("The numbers of deleted rows is " + count);

        connection.close();
    }

    private static void insert(String insertUser) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(insertUser);
        System.out.println("The numbers of inserted rows is " + count);

        connection.close();
    }
}
