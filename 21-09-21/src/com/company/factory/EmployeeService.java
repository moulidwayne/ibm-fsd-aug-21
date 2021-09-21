package com.company.factory;

import com.company.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);
    public Collection<Employee> displayAllEmployees();
    public void removeEmployeeById(String employeeId);
    public Employee findByEmployeeId(String employeeId);
}
