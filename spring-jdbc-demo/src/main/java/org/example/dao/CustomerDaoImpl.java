package org.example.dao;

import org.example.model.Customer;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
