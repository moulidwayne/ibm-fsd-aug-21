package com.example;

import java.util.Scanner;

public class MinimumAccout extends ProtectedAccount {
	private double minimum;
	private double penalty;
	
	private static Scanner scanner=new Scanner(System.in);
	public MinimumAccout() {
		super();
	}
	public double getMinimum() {
		return minimum;
	}
	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}
	public double getPenalty() {
		return penalty;
	}
	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	@Override
	public void createAccount(String name, double balance, double interestRate) {
		
		super.createAccount(name, balance, interestRate);
		setMinimum(500);
		
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}
	public double checkPenalty()
	{
		if(getBalance()<minimum)
		{
			penalty=10;
		}
		return penalty;
	}
	
	
}

