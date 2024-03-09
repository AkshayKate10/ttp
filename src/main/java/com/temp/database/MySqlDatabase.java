package com.temp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDatabase implements Database {
    public Connection getDbConnection(String databaseUrl, String userName, String password) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(databaseUrl, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
