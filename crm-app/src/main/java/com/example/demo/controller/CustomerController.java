package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	private CustomerDao customerDao;
	
	
	@Autowired
	public CustomerController(CustomerDao customerDao) {
		
		this.customerDao = customerDao;
	}



	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerDao.getAllCustomers();
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
}


