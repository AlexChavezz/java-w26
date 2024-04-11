package com.example.restservice;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private String username, password;
    private java.sql.Connection connection;

    public Connection(String username, String password) {
        this.username = username;
        this.password = password;
        this.connection = null;
    }

    public void connect() {

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
             this.connection = DriverManager.getConnection("jdbc:mysql://140.84.170.44/jdbcdatabase", username, password);
             System.out.print("Connection successful");
        } catch (SQLException ex) {
            //ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}