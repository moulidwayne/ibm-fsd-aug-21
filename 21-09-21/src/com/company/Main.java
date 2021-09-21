package com.company;

import com.company.factory.EmployeeService;
import com.company.factory.EmployeeServiceImpl;
import com.company.model.Employee;

import java.util.*;

public class Main {
private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeService service=new EmployeeServiceImpl();

        int choice=0;
        String id;
        String name;
        double salary;
        do{
            System.out.println("1. Create An Employee.");

            System.out.println("2. Display All employees.");
            System.out.println("3. Display by key: ");
            System.out.println("4. Delete by key: ");
            System.out.print("enter your choice. ");
            choice=scanner.nextInt();
            switch (choice)
            {
                case  1:
                    System.out.print("enter employee id: ");
                    id=scanner.next();
                    System.out.print("enter name: ");
                    name=scanner.next();
                    System.out.print("enter salary: ");
                    salary=scanner.nextDouble();
                    Employee employee=new Employee(id,name,salary);
                    Employee tempEmployee=service.createEmployee(employee);
                    System.out.println("employee added successfully: "+tempEmployee);
                    break;
                case 2:
                    try
                    {


                        Collection<Employee> collection=service.displayAllEmployees();


                            Iterator<Employee> iterator=collection.iterator();
                            while (iterator.hasNext())
                            {
                                System.out.println(iterator.next());
                            }

                    }
                    catch (EmptyCollectionException e)
                    {
                        System.err.println(e.getMessage());
                    }


                    break;
                case 3:
                    System.out.print("enter key: ");
                    Employee employee1=service.findByEmployeeId(scanner.next());
                    if(employee1==null)
                    {
                        System.out.println("not found");
                    }
                    else
                    {
                        System.out.println(employee1);
                    }
                    break;
                case 4:
                    System.out.print("enter key: ");
                    String key=scanner.next();
                    service.removeEmployeeById(key);

                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("invalid choice.");
                    break;

            }

        }while (choice!=0);



    }
}
