package org.example.dao;

import org.example.factory.MyFactory;
import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class CDDaoImpl implements CDDao{

    private Session session;
    private Scanner scanner=new Scanner(System.in);
    @Override
    public CD createCD(CD cd) {

        if(cd instanceof SpecialEditionCD)
        {
            session= MyFactory.getMyCurrentSession();
            System.out.print("Enter Special Feature: ");
            String sf=scanner.next();
            SpecialEditionCD specialEditionCD=(SpecialEditionCD) cd;
            specialEditionCD.setSpecialFeature(sf);
            session.getTransaction().begin();
            session.persist(specialEditionCD);
            session.getTransaction().commit();


        }
        if(cd instanceof InternationalCD)
        {
            session= MyFactory.getMyCurrentSession();
            System.out.print("Enter language: ");
            String lan=scanner.next();
            InternationalCD internationalCD=(InternationalCD) cd;
            internationalCD.setLanguage(lan);
            session.getTransaction().begin();
            session.persist(internationalCD);
            session.getTransaction().commit();

        }
        return cd;
    }

    @Override
    public List<SpecialEditionCD> displayAllSpecialEditionCD() {
        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Query query=session.createQuery("FROM SpecialEditionCD ");
        List<SpecialEditionCD> specialEditionCDS=query.getResultList();
        session.getTransaction().commit();
        return specialEditionCDS;
    }

    @Override
    public List<InternationalCD> displayAllInterNationalCD() {
        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        Query query=session.createQuery("FROM InternationalCD ");
        List<InternationalCD> internationalCDS=query.getResultList();
        session.getTransaction().commit();
        return internationalCDS;
    }

    @Override
    public SpecialEditionCD findSpecialEditonCDById(Integer id) {
        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        SpecialEditionCD specialEditionCD=session.get(SpecialEditionCD.class,id);
        session.getTransaction().commit();
        return specialEditionCD;
    }

    @Override
    public InternationalCD findInternationalCDById(Integer id) {

        session= MyFactory.getMyCurrentSession();
        session.getTransaction().begin();
        InternationalCD internationalCD=session.get(InternationalCD.class,id);
        return internationalCD;
    }


}
