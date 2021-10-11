package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Instructor;
import org.example.entity.Student;
import org.example.entity.Subject;
import org.example.exception.InstructorNotFoundException;
import org.example.service.InstructorService;
import org.example.service.InstructorServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;

public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        InstructorService service=new InstructorServiceImpl();
        /*  Instructor instructor=new Instructor();
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
          }*/

            /*System.out.print("Enter instructor id: ");
            Integer id=Integer.parseInt(bufferedReader.readLine());
            Instructor instructor= service.getInstructorById(id);
            if(instructor ==null)
            {
                System.err.println("instructor with given id not found");
            }
            else
            {
                System.out.println("FOUND=======\n");
                System.out.println(instructor);
            }*/
       /* System.out.print("Enter instructor unique id: ");
        String id=bufferedReader.readLine();
        Instructor instructor= service.getInstructorByUniqueId(id);
        if(instructor ==null)
        {
            System.err.println("instructor with given id not found");
        }
        else
        {
            System.out.println("FOUND=======\n");
            System.out.println(instructor);
        }





*/
        System.out.println("Enter Instructor Name: ");
        String name=bufferedReader.readLine();
        List<Instructor> list=service.getInstructorByName(name);
        if(list.isEmpty())
        {
            System.out.println("empty list");
        }
        else
        {
            for (Instructor i:list)
            {
                System.out.println(i);
            }
        }

    }
}
