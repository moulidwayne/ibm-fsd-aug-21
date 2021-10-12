package org.example;


import org.example.entity.Instructor;
import org.example.entity.Student;
import org.example.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class App
{
    private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(UserEntity.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session= sessionFactory.getCurrentSession();
     /*   UserEntity userEntity =new UserEntity();
        userEntity.setFirstName("A");
        userEntity.setLastName("B");
        userEntity.setEmail("C");
        Student student=new Student();
        student.setFirstName("D");
        student.setLastName("E");
        student.setEmail("F");
        student.setCourse("Learning Python");
        Instructor instructor=new Instructor();
        instructor.setFirstName("G");
        instructor.setLastName("H");
        instructor.setEmail("I");
        instructor.setSalary(14000.0);
        session.getTransaction().begin();
        session.persist(userEntity);
        session.persist(student);
        session.persist(instructor);
        session.getTransaction().commit();
        System.out.println("done....!");*/
        System.out.print("Enter ID: ");
        int id=scanner.nextInt();
        session.getTransaction().begin();
        UserEntity userEntity=session.find(UserEntity.class,id);
        session.getTransaction().commit();
        UserEntity u=null;
        Student s=null;
        Instructor i=null;
        if(userEntity==null)
        {
            System.out.println("user un-available");
        }
        else
        {

            if(userEntity instanceof Student)
            {
                System.out.println("its student entity");
                session= sessionFactory.getCurrentSession();
                s=(Student) userEntity;
                System.out.println("Enter New First Name: ");
                String fName=scanner.next();
                System.out.println("Enter New Last Name: ");
                String lName=scanner.next();
                System.out.println("Enter New Email Name: ");
                String email=scanner.next();
                System.out.println("Enter New Course Name: ");
                String course=scanner.next();
                s.setFirstName(fName);
                s.setLastName(lName);
                s.setEmail(email);
                s.setCourse(course);
                session.getTransaction().begin();
                session.merge(s);
                session.getTransaction().commit();
            }
           else if(userEntity instanceof Instructor)
            {
                System.out.println("its instructor entity");
                session= sessionFactory.getCurrentSession();
                i=(Instructor) userEntity;
                System.out.println("Enter New First Name: ");
                String fName=scanner.next();
                System.out.println("Enter New Last Name: ");
                String lName=scanner.next();
                System.out.println("Enter New Email Name: ");
                String email=scanner.next();
                System.out.println("Enter New Salary: ");
                double salary=scanner.nextDouble();
                i.setFirstName(fName);
                i.setLastName(lName);
                i.setEmail(email);
                i.setSalary(salary);
                session.getTransaction().begin();
                session.merge(i);
                session.getTransaction().commit();
            }
            else
            {
                System.out.println("its normal user");
                session= sessionFactory.getCurrentSession();
                u=userEntity;
                System.out.println("Enter New First Name: ");
                String fName=scanner.next();
                System.out.println("Enter New Last Name: ");
                String lName=scanner.next();
                System.out.println("Enter New Email Name: ");
                String email=scanner.next();
                u.setFirstName(fName);
                u.setLastName(lName);
                u.setEmail(email);
                session.getTransaction().begin();
                session.merge(u);
                session.getTransaction().commit();
            }
        }



    }
}
