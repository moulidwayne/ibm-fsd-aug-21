package com.example;

import java.util.UUID;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private Department department;

	public Employee() {
		super();
		department = new Department();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee createEmployee(String firstName, String lastName, String email, Department department,
			Location location) {

		Employee employee = new Employee();
		employee.setEmployeeId(UUID.randomUUID().toString());
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		employee.setDepartment(department);
		employee.getDepartment().setLocation(location);
		System.out.println(employeeId);
		return employee;

	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", department=" + department + "]";
	}

}
