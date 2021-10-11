package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Instructor;
import org.example.entity.Student;
import org.example.entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.UUID;

public class App
{
    public static void main( String[] args )

    {
      try {
          BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
          SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Instructor.class).buildSessionFactory();
          /*System.out.print("Enter First Name: ");
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
          System.out.println("1 student created");*/
          Instructor instructor=new Instructor();
        instructor.setInstructorId(100);
          instructor.setId(UUID.randomUUID().toString());
          instructor.setInstructorName("John Doe");
          instructor.setSubject(Subject.ANGULAR);
          Session session=sessionFactory.getCurrentSession();
          session.getTransaction().begin();
          session.save(instructor);
          session.getTransaction().commit();
          System.out.println("instructor created");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
