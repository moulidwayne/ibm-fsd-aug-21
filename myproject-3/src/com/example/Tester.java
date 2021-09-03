package com.example;

import java.util.Scanner;
import java.util.UUID;

public class Tester {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Employee employee = null;
		int choice = -1;
		do {
			System.out.println("1. Create Regular Employee.");
			System.out.println("Create Hourly Paid Employee.");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				employee = new RegularEmployee();
				employee.setEmployeeID(UUID.randomUUID().toString());
				System.out.print("employee first name: ");
				employee.setFirstName(scanner.next());
				System.out.print("employee last name: ");
				employee.setLastName(scanner.next());
				System.out.print("email: ");
				employee.setEmail(scanner.next());
				RegularEmployee emp = new RegularEmployee();
				Employee e = emp.createEmployee(employee);
				if (e instanceof RegularEmployee) {
					emp = (RegularEmployee) e;
				}
				emp.calculateSalary(employee);
				System.out.println(emp.displayEmployee());
				break;
			case 2:
				employee = new HourlyPaidEmployee();
				employee.setEmployeeID(UUID.randomUUID().toString());
				System.out.print("employee first name: ");
				employee.setFirstName(scanner.next());
				System.out.print("employee last name: ");
				employee.setLastName(scanner.next());
				System.out.print("email: ");
				employee.setEmail(scanner.next());
				HourlyPaidEmployee hEmp = new HourlyPaidEmployee();
				Employee e1 = hEmp.createEmployee(employee);

				if (e1 instanceof HourlyPaidEmployee) {
					hEmp = (HourlyPaidEmployee) e1;
				} 
				double finalAmount = hEmp.calculateSalary(hEmp); 
				System.out.println("calculated amount is:" + finalAmount);
				System.out.println(hEmp.displayEmployee());
				break;

			case 0:
				System.out.println("bye.");
				break;
			default:
				break;
			}
		} while (choice != 0);

	}

}
