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
        preparedStatement=connection.prepareStatement("insert into customer(first_name,last_name,email,deposited_amount) values(?,?,?,?)");
        preparedStatement.setString(1, customer.getFirstName());
        preparedStatement.setString(2, customer.getLastName());
        preparedStatement.setString(3, customer.getEmail());
        preparedStatement.setDouble(4,customer.getDepositedAmount());
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
            Customer customer=new Customer(resultSet.getString("first_name"),resultSet.getString("last_name"), resultSet.getString("email"),resultSet.getDouble("deposited_amount"));
            customers.add(customer);
        }
        return customers;
    }
}
