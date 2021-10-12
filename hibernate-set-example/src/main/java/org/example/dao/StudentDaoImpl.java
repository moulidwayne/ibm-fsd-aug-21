package org.example.dao;

import org.example.factory.MyFactory;
import org.example.model.Student;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao{
    private Session session;
    private static Scanner scanner=new Scanner(System.in);

    @Override
    public Student createStudent(Student student) {
        session= MyFactory.getMyCurrentSession();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
        return student;
    }

    @Override
    public List<Student> displayStudents() {
        session= MyFactory.getMyCurrentSession();
        session.beginTransaction();
        Query query= session.createQuery("FROM Student S");
        List<Student> students=query.getResultList();
        return students;
    }

    @Override
    public Student getStudentById(Integer id) {
        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Student student=session.find(Student.class,id);
        session.getTransaction().commit();
        return student;
    }

    @Override
    public Student updateStudentById(Integer id) {
        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Student student=session.find(Student.class,id);
        session.getTransaction().commit();
        if(student==null)
        {
            return null;
        }
        else
        {
            System.out.print("Enter New First Name: ");
            String fName=scanner.next();
            System.out.print("Enter New Last Name: ");
            String lName=scanner.next();
            System.out.print("Enter New Email: ");
            String email=scanner.next();
            student.setFirstName(fName);
            student.setLastName(lName);
            student.setEmail(email);
            session.getTransaction().begin();
            session.merge(student);
            session.getTransaction().commit();
            return student;
        }

    }

    @Override
    public void removeStudentById(Integer id) {
        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Student student=session.find(Student.class,id);
        session.getTransaction().commit();
        if(student==null)
        {
            System.out.println("no such student available");
        }
        else {
            session.getTransaction().begin();
            session.remove(student);
            session.getTransaction().commit();
            System.out.println("student removed successfully..");
        }
    }
}
