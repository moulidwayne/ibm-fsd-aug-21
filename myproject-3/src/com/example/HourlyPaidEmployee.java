package com.example;

import java.util.Scanner;

public class HourlyPaidEmployee  extends Employee implements EmployeeInterface{
	private static Scanner scanner=new Scanner(System.in);
	private double payPerHour;
	private double actualWorkingHour;
	private double finalAmount;
	public HourlyPaidEmployee() {
		super();
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public double getActualWorkingHour() {
		return actualWorkingHour;
	}

	public void setActualWorkingHour(double actualWorkingHour) {
		this.actualWorkingHour = actualWorkingHour;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		HourlyPaidEmployee employee2 = null;
		if (employee instanceof HourlyPaidEmployee)

		{
			employee2 = (HourlyPaidEmployee) employee;
			System.out.print("Pay Per Hour Rate : ");
			employee2.setPayPerHour(scanner.nextDouble());
			System.out.print("Actual Working Hour: ");
			employee2.setActualWorkingHour(scanner.nextDouble());
		}

		return employee2;
	}

	@Override
	public double calculateSalary(Employee employee) {
		HourlyPaidEmployee employee2 = null;
		if (employee instanceof HourlyPaidEmployee)

		{
			employee2 = (HourlyPaidEmployee) employee;
		}
	finalAmount=employee2.getPayPerHour()*employee2.getActualWorkingHour() ;
		return finalAmount;
	}

	@Override
	public String displayEmployee() {
		// TODO Auto-generated method stub
		return super.toString()+ "Amount To Be Paid: "+"$"+finalAmount;
	}

}
