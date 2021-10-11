package org.example.dao;

import org.example.entity.Instructor;
import org.example.factory.MyFactory;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class InstructorDaoImpl implements  InstructorDao {

    @Override
    public Instructor createInstructor(Instructor instructor) {
        Session session=MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        session.save(instructor);
        session.getTransaction().commit();
        return  instructor;
    }

    @Override
    public List<Instructor> displayAllInstructor() {
        Session session=MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Query query=session.createQuery("SELECT I FROM Instructor I ",Instructor.class);
        List<Instructor> list=query.getResultList();
        session.getTransaction().commit();

        return list;
    }
}
