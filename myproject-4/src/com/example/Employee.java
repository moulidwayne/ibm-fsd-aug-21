package com.example;

public class Employee implements Comparable {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}

	@Override
	public int compareTo(Object arg0) {
	
		Employee e=(Employee)arg0;
		if(this.getEmployeeId()<e.getEmployeeId())
		{
			return 1;
		}
		if(this.getEmployeeId()>e.getEmployeeId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
		
	}

}
