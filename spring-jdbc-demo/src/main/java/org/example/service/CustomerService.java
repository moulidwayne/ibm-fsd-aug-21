package org.example.service;

import org.example.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public List<Customer> getAllCustomer();
}
