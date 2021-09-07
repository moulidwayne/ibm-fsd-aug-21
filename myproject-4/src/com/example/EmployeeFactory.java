package com.example;

import java.util.Set;

public interface EmployeeFactory {

	public Employee createEmployee(Employee employee);

	public Set<Employee> getEmployees();

	public Employee findEmployeeByEmployeeId(int employeeId);

	public Employee findEmployeeByEmail(String email);

}
