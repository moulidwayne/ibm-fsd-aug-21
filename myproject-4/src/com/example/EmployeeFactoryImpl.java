package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeFactoryImpl implements EmployeeFactory {
	private Set<Employee> set = new TreeSet<Employee>(); 

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

}
