package com.example;

import java.util.HashSet;
import java.util.Set;

public class EmployeeFactoryImpl implements EmployeeFactory {
	private Set<Employee> set = new HashSet<Employee>();
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

}
