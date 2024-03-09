package com.temp.database;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection getDbConnection(String databaseUrl, String userName, String password) throws ClassNotFoundException, SQLException;
}
