package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Instructor;
import org.example.entity.Student;
import org.example.entity.Subject;
import org.example.service.InstructorService;
import org.example.service.InstructorServiceImpl;
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
          InstructorService service=new InstructorServiceImpl();
          Instructor instructor=new Instructor();
          instructor.setId(UUID.randomUUID().toString());
          System.out.println("Enter Instructor Name: ");
          String name=bufferedReader.readLine();
          System.out.println("Enter Subject: ");
          String subject= bufferedReader.readLine();
          instructor.setInstructorName(name);
          instructor.setSubject(Subject.valueOf(subject));
          instructor.setSubject(Subject.ANGULAR);
          service.createInstructor(instructor);
          System.out.println("instructor created");

          System.out.println("Displaying All Instructor...!");
          for(Instructor i:service.displayAllInstructor())
          {
              System.out.println(i);
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
