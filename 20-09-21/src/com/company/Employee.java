package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private String mobileNumber;
    private static Scanner scanner = new Scanner(System.in);

    public Employee() {
    }

    public Employee(String name, double salary, String mobileNumber) {
        this.name = name;
        this.salary = salary;
        this.mobileNumber = mobileNumber;
    }

    public void createEmployee() throws InvalidSalaryException, InvalidMobileNumberException {
        System.out.print("enter employee name: ");
        this.name = scanner.next();
        System.out.print("enter employee salary: ");
        this.salary = scanner.nextDouble();
        if (salary < 0) {
            throw new InvalidSalaryException("salary must be >=0");
        }
        System.out.print("enter employee mobile number: ");
        this.mobileNumber = scanner.next();
        if (mobileNumber.length() != 10) {
            throw new InvalidMobileNumberException("Invalid mobile number ");
        }
    }

    public String displayDetail() {
        return "name: " + name + " salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(mobileNumber, employee.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, mobileNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
