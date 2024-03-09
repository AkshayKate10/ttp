package com.temp.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseTest {
    @Test
    void shouldAbleToConnectToDatabase() throws SQLException, ClassNotFoundException {
        Database database = new MySqlDatabase();
        Connection connection = database.getDbConnection(
                "jdbc:mysql://localhost:3306/mysql",
                "root",
                "kawkaw12"
        );
        System.out.println("connection : " + connection);
        assertNotNull(connection);
    }
}
