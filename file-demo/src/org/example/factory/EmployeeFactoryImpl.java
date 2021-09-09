package org.example.factory;

import java.io.IOException;
import java.util.List;

import org.example.dao.EmployeeDao;
import org.example.model.Employee;

public class EmployeeFactoryImpl implements EmployeeFactory{

	private EmployeeDao employeeDao;
	
	public EmployeeFactoryImpl() {
		super();
	employeeDao=new EmployeeDao();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> displayAll() throws IOException {
		
		return employeeDao.getEmployeesFromFile();
	}

}
