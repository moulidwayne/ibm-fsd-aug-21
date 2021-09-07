package com.example;

import java.util.Scanner;

public class ProtectedAccount extends BasicAccount {
	
	private int pin;
private static Scanner scanner=new Scanner(System.in);
	public ProtectedAccount() {
		super();
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public void createAccount(String name, double balance, double interestRate) {
		
		super.createAccount(name, balance, interestRate);
		System.out.print("Enter Pin: ");
		setPin(scanner.nextInt());
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}
	
	

}
