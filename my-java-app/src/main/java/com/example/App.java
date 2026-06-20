package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
       public static void main(String[] args) {
        // 1. Define your database details
        String url = "jdbc:mysql://localhost:3306/shubham"; 
        String user = "root";
        String password = "Shubham@123";

        // 2. Establish the connection using a try-with-resources block
        try {
            System.out.println("Connecting to the database...");
            Connection connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection successful!");
            
            // Your database operations (Queries, Updates) go here
            
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check your URL, username, or password.");
            e.printStackTrace();
        }
    }
}
