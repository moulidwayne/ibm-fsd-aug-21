package com.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {

    private static Connection connection;
    public static Connection getMyConnection()throws SQLException
    {
        Properties properties=new Properties();
        properties.put("url","jdbc:mysql://localhost:3306/hr");
        properties.put("user","root");
        properties.put("password","root");
        if (connection==null)
        {
            connection= DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));

        }
        return connection;
    }
}
