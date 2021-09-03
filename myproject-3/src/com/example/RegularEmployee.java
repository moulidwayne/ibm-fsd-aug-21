package com.example;

import java.util.Scanner;

public class RegularEmployee extends Employee implements EmployeeInterface {
	private double salary;
	private double bonus;
	private static Scanner scanner = new Scanner(System.in);

	public RegularEmployee() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Employee createEmployee(Employee employee) {

		RegularEmployee employee2 = null;
		if (employee instanceof RegularEmployee)

		{
			employee2 = (RegularEmployee) employee;
			System.out.print("Salary: ");
			employee2.setSalary(scanner.nextDouble());
			System.out.print("Bonus: ");
			employee2.setBonus(scanner.nextDouble());
		}

		return employee2;
	}

	@Override
	public double calculateSalary(Employee employee) {
		RegularEmployee employee2 = null;
		if (employee instanceof RegularEmployee)

		{
			employee2 = (RegularEmployee) employee;
			
		}
		employee2.setSalary(employee2.getSalary() + employee2.getBonus());
		return employee2.getSalary() ;
	}

	@Override
	public String displayEmployee() {

		return super.toString() + " Salary: " + "$"+salary;
	}

}
