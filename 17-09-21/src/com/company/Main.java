package com.company;
import static java.lang.System.out;
import static com.company.Employee.employeeId;
public class Main {

    private int i=10;
    private static int j=20;
    public static void main(String[] args) {
        System.out.println(Employee.employeeId);
        Customer customer=new Customer(100,"John",23);
        System.out.println(customer);
        out.println(employeeId);

    }

    public static void sum(int... numbers)
    {
        System.out.println(j);
    }
}
