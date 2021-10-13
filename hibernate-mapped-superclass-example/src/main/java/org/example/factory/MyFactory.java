package org.example.factory;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class MyFactory {
    private static SessionFactory getMySessionFactory()
    {
        return new Configuration().configure().addAnnotatedClass(InternationalCD.class).addAnnotatedClass(SpecialEditionCD.class).buildSessionFactory();
    }
    public static Session getMyCurrentSession()
    {
        Session session=getMySessionFactory().openSession();
        return  session;
    }
}
