package org.example;

import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Student tempStudent = new Student("Marry", "Public", "marry@luv2code.com");
        Set<String> theImages = tempStudent.getImages();
        theImages.add("myphoto1.jpg");
        theImages.add("myphoto1.jpg");
        theImages.add("photo3.jpg");
        // start a transaction
        session.beginTransaction();
        session.save(tempStudent);
        session.getTransaction().commit();
        System.out.println("student saved successfully");
    }
}
