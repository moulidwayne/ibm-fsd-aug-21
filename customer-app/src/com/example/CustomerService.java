package com.example;
import java.util.Scanner;

import com.model.Address;
import com.model.Customer;
public class CustomerService {
	
	private Scanner scanner=new Scanner(System.in);
	
	public Customer createCustomer()
	{
		System.out.print("Customer id: ");
		int id=scanner.nextInt();
		System.out.println("customer name: " );
		String name=scanner.next();
		System.out.print("address line1: ");
		String line1=scanner.next();
		System.out.print("address line2: ");
		String line2=scanner.next();
		System.out.print("country: ");
		String country=scanner.next();
		System.out.print("city: ");
		String city=scanner.next();
		System.out.print("mobile number: ");
		String mobile=scanner.next();
		Customer customer=new Customer();
		Address address=new Address();
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		address.setAddressLine1(line1);
		address.setAddressLine2(line2);
		address.setCity(city);
		address.setCountry(country);
		address.setMobileNumber(mobile);
		customer.setAddress(address);
		return customer;
	}
	
	
	

}
