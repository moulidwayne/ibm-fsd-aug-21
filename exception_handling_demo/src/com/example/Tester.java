package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	
		MyClass myClass=null;
	
		try {
			
			System.out.println("Enter first Number: ");
			myClass.setFirstNumber(scanner.nextInt());
			System.out.println("Enter 2nd Number: ");
			myClass.setSecondNumber(scanner.nextInt());
		}
		catch(NullPointerException npe)
		{
			System.out.println("null pointer exception occured ");
		}
		/*
		 * catch (InputMismatchException e) {
		 * //System.out.println("provide valid input:"); e.printStackTrace(); }
		 */
		/*
		 * catch(Exception e) { System.out.println("exception occured"); }
		 */
		System.out.println(myClass.devide());
		
		
		
		
		

	}

}
