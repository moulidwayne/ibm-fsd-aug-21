package com.company;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String address;
    private double salary;
    private int age;

    public Employee() {
    }

    public Employee(String name, String address, double salary, int age) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
