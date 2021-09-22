package com.company.factory;

import com.company.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFactory {
    private List<Employee> employees=null;

    public EmployeeFactory() {
        employees=new ArrayList<Employee>();
    }

    public void createEmployee(Employee employee)
    {
        employees.add(employee);
        System.out.println("employee added");
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }
}
