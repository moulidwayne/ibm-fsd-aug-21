package org.example.service;

import org.example.dao.CustomerDao;
import org.example.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.createCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }
}
