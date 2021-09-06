package com.example.main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.example.Country;
import com.example.Department;
import com.example.Employee;
import com.example.Location;

public class Tester {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Employee employee = null;
		Department department = null;
		Location location = null;
		try {
			employee = new Employee();
			department = new Department();
			location = new Location();
			System.out.print("First Name: ");
			String firstName = scanner.next();
			System.out.print("last Name: ");
			String lastName = scanner.next();
			System.out.print("Email: ");
			String email = scanner.next();
			department.setDepartmentId(new Random().nextInt(1000));
			System.out.println("Department Name: ");
			department.setDepartmentName(scanner.next());
			System.out.println("Department Location: ");

			location.setLocationId(new Random().nextInt(1000));
			System.out.print("Location Name: ");
			location.setCityName(scanner.next());
			System.out.print("Location Country: ");
			location.setCountry(Country.valueOf(scanner.next()));
			Employee tempEmployee = employee.createEmployee(firstName, lastName, email, department, location);
			System.out.println(tempEmployee);
		} catch (NullPointerException npe) {
			System.out.println("within  null pointer  exception handler");
			npe.printStackTrace();
		} catch (InputMismatchException ime) {
			System.out.println("within input mismatched exception handler");
			ime.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("within number formart exception handler");
			nfe.printStackTrace();
		} 
		catch(IllegalArgumentException iae)
		{
			System.out.println("within illegal argument exception handler");
			iae.toString();
		}
		catch (Exception exception) {
			System.out.println("within global exception handler");
			exception.printStackTrace();
		}

		finally {
			System.out.println(">>entered finally block.");

			employee = null;
			department = null;
			location = null;

			System.out.println("finally block executed sucessfully......");
		}

	}

}
