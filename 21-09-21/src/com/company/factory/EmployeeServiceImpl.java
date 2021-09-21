package com.company.factory;

import com.company.EmptyCollectionException;
import com.company.model.Employee;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService{
    private Map<String,Employee> employeeMap=null;

    public EmployeeServiceImpl() {
        employeeMap=new TreeMap<String,Employee>();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        String[] str= UUID.randomUUID().toString().split("-");
        employeeMap.put(str[0],employee);
        return employee;
    }

    @Override
    public Collection<Employee> displayAllEmployees() throws EmptyCollectionException {
        Collection<Employee> collection=employeeMap.values();
        if(collection.isEmpty())
        {
            throw  new EmptyCollectionException("no employees database is empty");
        }
        System.out.println(employeeMap.keySet());
        return employeeMap.values();
    }

    @Override
    public void removeEmployeeById(String employeeId) {
        Employee tempEmployee=employeeMap.get(employeeId);
        if(tempEmployee==null)
        {
            System.out.println("not found");
        }
        else {
            employeeMap.remove(employeeId);
            System.out.println("deletion successful");
        }

    }

    @Override
    public Employee findByEmployeeId(String employeeId) {
        Employee tempEmployee=employeeMap.get(employeeId);
        return tempEmployee;
    }
}
