package com.company;

import com.company.factory.EmployeeFactory;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
private static EmployeeFactory employeeFactory=null;
private static Scanner scanner=new Scanner(System.in);
static {
    employeeFactory=new EmployeeFactory();
}
    public static void main(String[] args) {
        String name, address = null;
        int choice = 0;
        Employee employee = null;
        do {

            System.out.println("1. Create and Add Employee to List.");
            System.out.println("2. Add List to employee.data file.");
            System.out.println("3. Display All Employees from employee.data file");
            System.out.println("0. Exit");
            System.out.println("enter your choice: ");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter employee name: ");
                    name = scanner.next();
                    System.out.print("enter address: ");
                    address = scanner.next();
                    employee = new Employee(name, address);
                    employeeFactory.createEmployee(employee);
                    break;
                case 2:
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream("employee.data");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        List<Employee> list = employeeFactory.getEmployees();
                        objectOutputStream.writeObject(list);
                        System.out.println("list of employees written on employee.data file");
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        FileInputStream fileInputStream = new FileInputStream("employee.data");
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        List<Employee> employees = (List<Employee>) objectInputStream.readObject();
                        for (Employee e : employees) {
                            System.out.println(e.getName() + " " + e.getAddress());
                        }
                    } catch (IOException | ClassNotFoundException ioException) {
                        ioException.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }

        } while (choice != 0) ;
    }

    }

