package org.example;


import org.example.entity.Instructor;
import org.example.entity.Student;
import org.example.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(UserEntity.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session= sessionFactory.getCurrentSession();
        UserEntity userEntity =new UserEntity();
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
        System.out.println("done....!");
    }
}
