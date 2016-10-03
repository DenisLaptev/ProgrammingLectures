package com.kov.lectures.lecture_8_jdbc.item_1;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Kovantonlenko on 12/11/2015.
 */
public class UserDDL {

    private static final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS user (id INT NOT NULL , name VARCHAR(45) NULL, PRIMARY KEY (id))";
    private static final String UPDATE_USER_TABLE = "ALTER TABLE user ADD age INTEGER ";
    private static final String ADD_AUTOINCREMENT_USER_TABLE = "ALTER TABLE user CHANGE COLUMN id id INT(11) NOT NULL AUTO_INCREMENT";
    private static final String DROP_USER_TABLE = "DROP TABLE user";

    public static void main(String[] args) throws SQLException {
        //dropTable(DROP_USER_TABLE);
        createTable(CREATE_USER_TABLE);
        updateTable(UPDATE_USER_TABLE);
        updateTable(ADD_AUTOINCREMENT_USER_TABLE);
    }



    private static void updateTable(String updateUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        statement.execute(updateUserTable);

        connection.close();
    }

    private static void createTable(String createUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        statement.execute(createUserTable);

        connection.close();
    }
    private static void dropTable(String dropUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        statement.execute(dropUserTable);

        connection.close();
    }
}

