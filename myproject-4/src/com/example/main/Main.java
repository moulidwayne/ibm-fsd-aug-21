package com.example.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.Employee;
import com.example.exception.InvalidInputException;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String args[])
	{
		Employee employee=null;
		try {
			employee=new Employee();
			System.out.print("first name: ");
			String firstName=scanner.next();
			System.out.print("last name: ");
			String lastName=scanner.next();
			System.out.print("email: ");
			String email=scanner.next();
			employee.createEmployee(firstName, lastName, email);
			
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		catch(IllegalArgumentException ire)
		{
			ire.printStackTrace();
		}
		catch(InputMismatchException ime)
		{
			ime.printStackTrace();
		}
		catch(InvalidInputException iie)
		{
			System.out.println("invalid inout exception caught: "+iie.getMessage());
			
			//iie.printStackTrace();
		}
	}

}
