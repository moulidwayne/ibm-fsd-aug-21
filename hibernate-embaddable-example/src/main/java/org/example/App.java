package org.example;

import org.example.entity.Address;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();

        // create the object
        Student tempStudent =
                new Student("John", "Doe", "john@luv2code.com");
        // create the address object
        Address homeAddress = new Address("1 Main St", "Philadelphia", "19103");
        // start a transaction
        session.beginTransaction();
        // save the object
        System.out.println("Saving the student and address..");
        tempStudent.setHomeAddres(homeAddress);
        session.persist(tempStudent);
        session.getTransaction().commit();
        System.out.println("student saved...");
    }
}
