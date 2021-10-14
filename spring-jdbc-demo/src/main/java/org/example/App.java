package org.example;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner=new Scanner(System.in);

    public static void main( String[] args )
    {
        CustomerService customerService=null;
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        customerService=context.getBean("customerService", CustomerServiceImpl.class);
       /* System.out.print("Enter First Name: ");
        String fName=scanner.next();
        System.out.print("Enter Last Name: ");
        String lName=scanner.next();
        System.out.print("Enter Email: ");
        String email=scanner.next();
        Customer customer=new Customer(fName,lName,email);
        Customer theCustomer=customerService.createCustomer(customer);
        System.out.println("Customer Created: "+customer);*/
        List<Customer> list=customerService.getAllCustomer();
        if(list.isEmpty())
        {
            System.out.println("no customer available.");
        }
        else
        {
            for(Customer c:list)
            {
                System.out.println(c);
            }
        }
    }
}
