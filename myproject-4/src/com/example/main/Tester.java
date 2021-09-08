package com.example.main;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.example.Employee;
import com.example.EmployeeFactory;
import com.example.EmployeeFactoryImpl;
import com.example.exception.EmployeeNotFoundException;

public class Tester {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		EmployeeFactory service = new EmployeeFactoryImpl();
		do {
			System.out.println("1. Create employee.");
			System.out.println("2. Display employees");
			System.out.println("3. Find Employee.");
			System.out.println("4. Update Employee.");
			System.out.println("5. Remove Employee.");
			System.out.println("0. Exit");
			System.out.print("Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Employee employee = new Employee();
				System.out.print("first name: ");
				String firstName = scanner.next();
				System.out.print("last name: ");
				String lastName = scanner.next();
				System.out.print("email: ");
				String email = scanner.next();
				employee.setEmail(email);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setEmployeeId(new Random().nextInt(1000));
				Employee tempEmployee = service.createEmployee(employee);
				System.out.println(tempEmployee);
				break;
			case 2:
				Set<Employee> set = service.getEmployees();
				Iterator<Employee> i = set.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				break;
			case 3:
				System.out.print("enter employee id: ");
				int id = scanner.nextInt();
				Employee tempEmployee2 = service.findEmployeeByEmployeeId(id);
				if (tempEmployee2 == null) {
					throw new EmployeeNotFoundException("employee with the given id is not found.");
				}
				System.out.println("Employee Found: \n"+tempEmployee2);
				break;
			case 4:
				System.out.print("enter employee id: ");
				id = scanner.nextInt();
				tempEmployee2 = service.updateEmployeeByEmployeeId(id);
				if (tempEmployee2 == null) {
					throw new EmployeeNotFoundException("employee with the given id is not found.");
				}
				System.out.println("Employee updated: \n"+tempEmployee2);
				break;
			case 5:
				System.out.print("enter employee id: ");
				id = scanner.nextInt();
				tempEmployee2 = service.deleteEmployyByEmployeeId(id);
				if (tempEmployee2 == null) {
					throw new EmployeeNotFoundException("employee with the given id is not found.");
				}
				System.out.println("Employee removed: \n"+tempEmployee2);
				break;
			case 0:
				System.out.println("bye");
				break;
			default:
				System.out.println("invalid choice");

			}

		} while (choice != 0);

	}

}
