package com.example;

public class BasicAccount {
	private String name;
	private double balance;
	private double interestRate;
	public BasicAccount() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void createAccount(String name,double balance,double interestRate)
	{
	
		this.name=name;
		this.balance=balance;
		this.interestRate=interestRate;
		System.out.println("account created.");
	}

}
