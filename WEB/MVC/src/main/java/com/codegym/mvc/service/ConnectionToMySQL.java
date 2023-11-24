package com.codegym.mvc.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToMySQL {
    static final String URL = "jdbc:mysql://localhost:3306/c06";
    static final String USERNAME = "root";
    static final String PASSWORD = "123456";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            return null;
        }
    }
}
