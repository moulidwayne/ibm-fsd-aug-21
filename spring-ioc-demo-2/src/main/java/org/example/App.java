package org.example;
import org.example.model.Coach;
import org.example.model.Customer;
import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        try {
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            /*Coach myCoach=context.getBean("theCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());*/
            Customer customer=context.getBean("customer",Customer.class);
            System.out.println(customer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
