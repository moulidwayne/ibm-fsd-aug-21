package com.example;

import java.util.Random;

import com.example.exception.InvalidInputException;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	public Employee() {
		super();
	}
	
	public void createEmployee(String firstName,String lastName,String email) throws InvalidInputException
	{
		employeeId=new Random().nextInt(1000);
		this.firstName=firstName;
		this.lastName=lastName;
		if(email.indexOf("@")<0)
		{
			throw new InvalidInputException("wrong email");
		}
		this.email=email;
		System.out.println("Employee Created Sucessfully");
	
		
	}

}
