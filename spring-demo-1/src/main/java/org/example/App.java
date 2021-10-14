package org.example;


import org.example.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //get the context(entry to IOC Container)
     try {
         ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
         Coach myCoach=context.getBean("theCoach",Coach.class);
         System.out.println(myCoach.getDailyWorkout());
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }

    }
}
