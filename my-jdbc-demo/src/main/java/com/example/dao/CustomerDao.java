package com.example.dao;

import com.example.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    public Customer createCustomer(Customer customer) throws SQLException;
    public List<Customer> displayAllCustomer() throws SQLException;
    public Customer findById(Integer id) throws SQLException;
}
