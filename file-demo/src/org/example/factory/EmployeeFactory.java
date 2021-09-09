package org.example.factory;

import java.io.IOException;
import java.util.List;

import org.example.model.Employee;

public interface EmployeeFactory {
	
	public Employee createEmployee(Employee employee);
	
	public List<Employee> displayAll() throws IOException;

}
