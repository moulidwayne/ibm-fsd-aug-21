package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args )
    {
        try {
            //step-1 Register the driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //step-2 connect with the database
           Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
           //step-3 create an object of statement

            Statement statement=connection.createStatement();
            //step-4 execute the query
           ResultSet resultSet= statement.executeQuery("select * from employees LIMIT 20");

           //step-5 retrive the data from resultset

            System.out.println("EMPLOYEE ID\t FIRST_NAME\tLAST_NAME\tEMAIL\tSALARY");
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt("employee_id")+"\t"+resultSet.getString("first_name")
                +"\t"+resultSet.getString("last_name")+"\t"+resultSet.getString("email")+"\t"+resultSet.getDouble("salary"));
            }


        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
    }
}
