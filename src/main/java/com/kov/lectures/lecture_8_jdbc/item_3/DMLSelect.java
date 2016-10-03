package com.kov.lectures.lecture_8_jdbc.item_3;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Kovantonlenko on 12/14/2015.
 */
public class DMLSelect {

    public static final String QUERY = "select * from user";

    public static void main(String[] args) throws SQLException {
        getALL(QUERY);
    }

    private static void getALL(String query) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();

        boolean execute = statement.execute(query); // �� ������ ���������

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");// ������ ����� ��������� ������ ����������, � ���� ����������� ����� ������ ��� �� ������� ��� �� �����
            String name = resultSet.getString("name");
//            String name = resultSet.getString(2); то же самое, что и выше.
            int age = resultSet.getInt("age");

            System.out.println(id);
            System.out.println(name);
            System.out.println(age);

            System.out.println("---------------------");
        }

        connection.close();
    }
}
