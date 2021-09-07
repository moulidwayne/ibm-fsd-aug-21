package com.example;

import java.util.HashSet;
import java.util.Iterator;
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

	@Override
	public Employee findEmployeeByEmployeeId(int employeeId) {
		Iterator<Employee> i=set.iterator();
		Employee employee=null;
		Employee tempEmployee=null;
		while(i.hasNext())
		{
			employee=i.next();
			if(employee.getEmployeeId()==employeeId)
			{
				tempEmployee=employee;
				break;
			}
		}
		return tempEmployee;
	}

}
