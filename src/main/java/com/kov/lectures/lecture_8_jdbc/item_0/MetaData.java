package com.kov.lectures.lecture_8_jdbc.item_0;

import com.kov.lectures.lecture_8_jdbc.MyConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kovantonlenko on 12/14/2015.
 */
public class MetaData {
    public static void main(String[] args) throws SQLException {
        Connection connection = MyConnection.createConnection();
        DatabaseMetaData metaData = connection.getMetaData();

        System.out.println("Support batch update: " + metaData.supportsBatchUpdates());
        System.out.println("Support insensetiveRS: " + metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
        System.out.println("Support sensetiveRS: " + metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
        System.out.println("Support cuncurrent updatable: " + metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE));
        System.out.println();
    }
}
