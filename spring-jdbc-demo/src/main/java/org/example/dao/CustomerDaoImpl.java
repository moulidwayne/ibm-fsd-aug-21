package org.example.dao;

import org.example.model.Customer;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{
    private DataSource dataSource;

    public CustomerDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        try{
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into customer(first_name,last_name,email)" +
                    "values (?,?,?)");
            preparedStatement.setString(1,customer.getFirstName());
            preparedStatement.setString(2,customer.getLastName());
            preparedStatement.setString(3,customer.getEmail());
            preparedStatement.executeUpdate();

        }catch (SQLException se)
        {
            se.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers=null;
        try
        {
            Connection connection=dataSource.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select id,first_name,last_name,email from customer");
           customers=new ArrayList<>();
            while (resultSet.next())
            {
                Customer customer=new Customer(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4) );
                customers.add(customer);
            }
        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        return customers;
    }
}
