package org.example.factory;
import org.example.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class MyFactory {
    private static SessionFactory getMySessionFactory()
    {
        return new Configuration().configure().addAnnotatedClass(Instructor.class).buildSessionFactory();
    }
    public static Session getMyCurrentSession()
    {
        Session session=getMySessionFactory().getCurrentSession();
        return  session;
    }
}
