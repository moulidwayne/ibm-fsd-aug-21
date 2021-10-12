package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App
{
    private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        Student student=null;
        StudentService service=new StudentServiceImpl();
       int id,choice=0;
       String firstName,lastName,email=null;
       do{
           System.out.println("1. Create Student..");
           System.out.println("2. Display Students..");
           System.out.println("3. Find Student By Id..");
           System.out.println("4. Update Student By Id..");
           System.out.println("5. Remove Student By Id..");
           System.out.println("0. Exit..");
           System.out.print("Enter Your Choice: ");
           choice= scanner.nextInt();
           switch (choice)
           {
               case 1:
                   System.out.print("First Name: ");
                   firstName=scanner.next();
                   System.out.print("Last Name: ");
                   lastName=scanner.next();
                   System.out.print("Email: ");
                   email=scanner.next();
                   String ans="n";
                   student=new Student(firstName,lastName,email);
                   Set<String> images=student.getImages();
                   do{
                       System.out.print("Enter Image File Name: ");
                       String img=scanner.next();
                       images.add(img);
                       System.out.println("Want To Add More????   ");
                       ans=scanner.next();

                   }while(!ans.equals("n"));
                   System.out.println("");
                   student.setImages(images);
                   student= service.createStudent(student);
                   System.out.println("Student Created: "+student);
                   break;
               case 2:
                   List<Student> students=service.displayStudents();
                   if(students.isEmpty())
                   {
                       System.out.println("empty database...!");
                   }
                   else
                   {
                       for(Student s:students)
                       {
                           System.out.println(s);
                       }
                   }
                   break;
               case 3:
                   System.out.println("Enter Id: ");
                   id=scanner.nextInt();
                   student= service.getStudentById(id);
                   if(student==null)
                   {
                       System.out.println("no such students");
                   }
                   else
                   {
                       System.out.println(student);
                   }
                   break;

               case 4:
                   System.out.println("Enter Id: ");
                   id=scanner.nextInt();
                   student=service.updateStudentById(id);
                   if (student==null)
                   {
                       System.out.println("no such student available...");
                   }
                   else
                   {
                       System.out.println("Student Updated: "+student);
                   }
                   break;
               case 5:
                   System.out.println("Enter Id: ");
                   id=scanner.nextInt();
                   service.removeStudentById(id);
                   break;
               case 0:
                   System.out.println("Bye...");
                   System.exit(0);
                   break;
               default:
                   System.out.println("invalid choice try again...!");
                   break;
           }

       }while (choice!=0);

    }
}
