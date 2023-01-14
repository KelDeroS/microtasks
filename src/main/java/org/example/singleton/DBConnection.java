package org.example.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static DBConnection instance = null;
    private Connection connection = null;

    private DBConnection() {
        System.out.println("init connection");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}