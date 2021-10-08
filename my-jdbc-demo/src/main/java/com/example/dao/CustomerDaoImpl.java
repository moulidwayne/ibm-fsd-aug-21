package com.example.dao;

import com.example.connection.MyConnection;
import com.example.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private PreparedStatement preparedStatement;
    @Override
    public Customer createCustomer(Customer customer) throws SQLException {
        connection=MyConnection.getMyConnection();
        preparedStatement=connection.prepareStatement("insert into customer(first_name,last_name,email,deposited_amount,interest_rate) values(?,?,?,?,?)");
        preparedStatement.setString(1, customer.getFirstName());
        preparedStatement.setString(2, customer.getLastName());
        preparedStatement.setString(3, customer.getEmail());
        preparedStatement.setDouble(4,customer.getDepositedAmount());
        preparedStatement.setDouble(5,customer.getInterestRate());
        preparedStatement.executeUpdate();
        return customer;
    }

    @Override
    public List<Customer> displayAllCustomer() throws SQLException {
        connection=MyConnection.getMyConnection();
        statement= connection.createStatement();
        resultSet= statement.executeQuery("select * from customer");
        List<Customer> customers=new ArrayList<Customer>();
        while (resultSet.next())
        {
            Customer customer=new Customer(resultSet.getString("first_name"),resultSet.getString("last_name"), resultSet.getString("email"),resultSet.getDouble("deposited_amount"), resultSet.getDouble("interest_rate"));
            customers.add(customer);
        }
        return customers;
    }

    @Override
    public Customer findById(Integer id) throws SQLException {
        connection=MyConnection.getMyConnection();
        preparedStatement=connection.prepareStatement("select * from customer where customer_id=? limit 1");
        preparedStatement.setInt(1,id);
        resultSet= preparedStatement.executeQuery();
        List<Customer> customers= new ArrayList<>();
        while (resultSet.next())
        {
            Customer customer=new Customer(resultSet.getString("first_name"),resultSet.getString("last_name"), resultSet.getString("email"),resultSet.getDouble("deposited_amount"), resultSet.getDouble("interest_rate"));
            customers.add(customer);
        }
        Customer theCustomer=null;
        if(customers.isEmpty())
        {
            System.err.println("invalid customer id try again.");
            return theCustomer;
        }
        else
        {
            theCustomer=customers.get(0);

            return  theCustomer;
        }



    }
}
