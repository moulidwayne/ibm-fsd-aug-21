package org.example;
import org.example.model.Coach;
import org.example.model.Customer;
import org.example.model.Order;
import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.Scanner;

public class App
{
    private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        try {
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            /*Coach myCoach=context.getBean("theCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());*//*
            Customer customer=context.getBean("customer",Customer.class);
            System.out.println(customer);*/
            Order order=context.getBean("order",Order.class);
            Customer customer=context.getBean("customer",Customer.class);
            System.out.print("Enter Customer Name: ");
            String customerName=scanner.next();
            System.out.println("enter order details.....\n=============================\n");
            System.out.print("Order Name:");
            String orderName=scanner.next();
            System.out.print("Order Quantity:");
            int orderQuantity=scanner.nextInt();
            System.out.print("Order Final Price: ");
            double orderPrice=scanner.nextDouble();
            order.setOrderId(new Random().nextInt(10000));
            order.setOrderName(orderName);
            order.setOrderQuantity(orderQuantity);
            order.setOrderValue(orderPrice);
            customer.setCustomerId(new Random().nextInt(10000));
            customer.setCustomerName(customerName);
            customer.setOrder(order);
            System.out.println("customer created: "+customer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
