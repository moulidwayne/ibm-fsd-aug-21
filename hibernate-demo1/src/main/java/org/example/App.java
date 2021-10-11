package org.example;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )

    {
      try {
          BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
          SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
          System.out.print("Enter First Name: ");
          String firstName= bufferedReader.readLine();
          System.out.print("Enter Last Name: ");
          String lastName= bufferedReader.readLine();
          System.out.print("Email: ");
          String email= bufferedReader.readLine();
          Student student=new Student(firstName,lastName,email);
          Session session= sessionFactory.getCurrentSession();
          session.getTransaction().begin();
          session.save(student);
          session.getTransaction().commit();
          System.out.println("1 student created");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
