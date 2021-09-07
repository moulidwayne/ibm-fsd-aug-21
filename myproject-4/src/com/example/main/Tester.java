package com.example.main;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.example.Employee;
import com.example.EmployeeFactory;
import com.example.EmployeeFactoryImpl;

public class Tester {
private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int choice=0;
		EmployeeFactory service=new EmployeeFactoryImpl();
		do {
			System.out.println("1. Create employee.");
			System.out.println("2. Display employees");
			System.out.println("0. Exit");
			System.out.print("Your Choice");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				Employee employee=new Employee();
				System.out.print("first name: ");
				String firstName=scanner.next();
				System.out.print("last name: ");
				String lastName=scanner.next();
				System.out.print("email: ");
				String email=scanner.next();
				employee.setEmail(email);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setEmployeeId(new Random().nextInt());
				Employee tempEmployee=service.createEmployee(employee);
				System.out.println(tempEmployee);
				break;
			case 2:
				Set<Employee> set=service.getEmployees();
				Iterator<Employee> i=set.iterator();
						while(i.hasNext())
						{
							System.out.println(i.next());
						}
			case 0:
				System.out.println("bye");
				break;
			default:
				System.out.println("invalid choice");
			
			}
			
		} while (choice!=0);
		
	}

}
