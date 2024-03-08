package com.temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static Connection getDbConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "kawkaw12");
            System.out.println("connection success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }

    public static void main(String[] args) {
        getDbConnection();
    }
}
