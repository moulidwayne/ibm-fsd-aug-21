package com.example;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.example.exception.EmployeeNotFoundException;

public class EmployeeFactoryImpl implements EmployeeFactory {
	private Set<Employee> set = new TreeSet<Employee>();

	private static Scanner scanner=new Scanner(System.in);
	@Override
	public Employee createEmployee(Employee employee) {

		try {

			set.add(employee);

		} catch (Exception e) {

		}
		return employee;
	}

	@Override
	public Set<Employee> getEmployees() {

		return set;
	}

	@Override
	public Employee findEmployeeByEmployeeId(int employeeId) {
		Iterator<Employee> i = set.iterator();
		Employee employee = null;
		Employee tempEmployee = null;
		while (i.hasNext()) {
			employee = i.next();
			if (employee.getEmployeeId() == employeeId) {
				tempEmployee = employee;
				break;
			}
		}
		return tempEmployee;
	}

	@Override
	public Employee findEmployeeByEmail(String email) {
		Iterator<Employee> i = set.iterator();
		Employee employee = null;
		Employee tempEmployee = null;
		while (i.hasNext()) {
			employee = i.next();
			if (employee.getEmail().equals(email)) {
				tempEmployee = employee;
				break;
			}
		}
		return tempEmployee;
	}

	@Override
	public Employee updateEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		Employee e1=findEmployeeByEmployeeId(employeeId);
		if(e1==null)
		{
			throw new EmployeeNotFoundException("no employee found");
		}
		System.out.print("Enter new first name: ");
		e1.setFirstName( scanner.next());
		System.out.print("Enter new last name: ");
		e1.setLastName( scanner.next());
		System.out.print("Enter new email: ");
		e1.setEmail( scanner.next());
		System.out.println("updation is success");
		return e1;
	}

	@Override
	public Employee deleteEmployyByEmployeeId(int employeeId) {
		Employee e1=findEmployeeByEmployeeId(employeeId);
		if(e1==null)
		{
			throw new EmployeeNotFoundException("no employee found");
		}
		set.remove(e1);
		System.out.println("employee removed sucessfully");
		return e1;
	}

}
