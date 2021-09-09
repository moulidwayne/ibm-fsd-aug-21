package org.example.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.example.model.Employee;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		FileWriter writer =null;
		BufferedWriter bufferedWriter=null;
		int choice = -1;
		String firstName, lastName, email = null;
		String answer = null;
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = null;
		do {
			System.out.println("1. Create Employee(s): ");
			System.out.println("2. Write List of employees to output.txt");
			System.out.println("3. Display all employees. ");
			System.out.println("0.Exit ");
			System.out.print("enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				do {
					System.out.println("Enter first name: ");
					firstName = scanner.next();
					System.out.println("Enter last name: ");
					lastName = scanner.next();
					System.out.println("Enter email: ");
					email = scanner.next();
					employee = new Employee();
					employee.setEmployeeId(new Random().nextInt(1000));
					employee.setEmail(email);
					employee.setFirstName(firstName);
					employee.setLastNAme(lastName);
					employees.add(employee);
					System.out.println("Employees Added Sucessfully.");
					System.out.print("want to add more employee??('y/n) ");
					answer = scanner.next();
				} while (!answer.equals("n"));
				System.out.println(employees);

				break;
			case 2:
				try {
					 writer = new FileWriter(new File("a"));
					bufferedWriter = new BufferedWriter(writer);
					Iterator<Employee> i = employees.iterator();
					while (i.hasNext()) {
						Employee e=i.next();
						String str = e.getEmployeeId() + "," + e.getFirstName() + ","
								+ e.getLastNAme() + "," + e.getEmail();
						while(str!=null){
							bufferedWriter.write(str,0,str.length());
							bufferedWriter.newLine();
							str=null;
						}
						bufferedWriter.close();
						writer.close();
						
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					bufferedWriter.close();
					writer.close();
				}
				break;
			case 3:
				Iterator<Employee> i = employees.iterator();
				while (i.hasNext()) {
					System.out.println(
							"EmployeeId: " + i.next().getEmployeeId() + " First Name: " + i.next().getFirstName());
				}
				break;
			default:
				break;
			}

		} while (choice != 0);

	}

}
