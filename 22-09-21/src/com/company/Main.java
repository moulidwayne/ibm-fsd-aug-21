package com.company;

import com.company.factory.EmployeeFactory;

import java.io.*;

import java.util.List;

import static java.lang.System.*;

public class Main {
private static final EmployeeFactory employeeFactory;

static {
    employeeFactory=new EmployeeFactory();
}
    public static void main(String[] args) throws IOException {
        String name, address ;
        int age,choice;
        double salary;
        Employee employee ;
        InputStreamReader reader=new InputStreamReader(in);
        BufferedReader bufferedReader=new BufferedReader(reader);
        do {

            out.println("1. Create and Add Employee to List.");
            out.println("2. Add List to employee.data file.");
            out.println("3. Display All Employees from employee.data file");
            out.println("0. Exit");
            out.println("enter your choice: ");
            choice=Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 1:
                    out.print("enter employee name: ");
                    name = bufferedReader.readLine();
                    out.print("enter address: ");
                    address = bufferedReader.readLine();
                    out.print("enter age");
                    age=Integer.parseInt(bufferedReader.readLine());
                    out.print("enter salary");
                    salary=Double.parseDouble(bufferedReader.readLine());
                    employee = new Employee(name, address,salary,age);
                    employeeFactory.createEmployee(employee);
                    break;
                case 2:
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream("employee.data");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        List<Employee> list = employeeFactory.getEmployees();
                        objectOutputStream.writeObject(list);
                        out.println("list of employees written on employee.data file");
                    } catch (IOException ioException) {
                        err.println(ioException.getMessage());
                    }
                    break;
                case 3:
                    try {
                        FileInputStream fileInputStream = new FileInputStream("employee.data");
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                        List<Employee> employees = (List<Employee>) objectInputStream.readObject();
                        for (Employee e : employees) {
                            System.out.println(e.getName() + " " + e.getAddress()+ " "+e.getSalary()+" "+e.getAge());
                        }
                    } catch (IOException | ClassNotFoundException ioException) {
                        err.println(ioException.getMessage());
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

