package org.example.dao;

import org.example.entity.Instructor;
import org.example.exception.InstructorNotFoundException;
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

    @Override
    public Instructor getInstructorById(Integer instructorId) {
        Session session=MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Instructor instructor=session.get(Instructor.class,instructorId);
        session.getTransaction().commit();

        return instructor;
    }

    @Override
    public Instructor getInstructorByUniqueId(String uniqueId) {
        Session session=MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Query query=session.createQuery("FROM Instructor I WHERE I.id=:uId",Instructor.class);
        query.setParameter("uId",uniqueId);
        List<Instructor> list=query.getResultList();
        if(list==null)
        {
                System.out.println("no such unique id available");
                System.exit(0);

        }
        return list.get(0);
    }

    @Override
    public List<Instructor> getInstructorByName(String instructorName) {
        Session session=MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Query query=session.createQuery("FROM Instructor I WHERE I.instructorName=:iName",Instructor.class);
        query.setParameter("iName",instructorName);
        return query.getResultList();
    }
}
