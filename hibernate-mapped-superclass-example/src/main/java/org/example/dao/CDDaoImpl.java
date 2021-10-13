package org.example.dao;

import org.example.factory.MyFactory;
import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;
import org.hibernate.Session;

import java.util.List;
import java.util.Scanner;

public class CDDaoImpl implements CDDao{

    private Session session;
    private Scanner scanner=new Scanner(System.in);
    @Override
    public CD createSpecialCD(CD cd) {

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


}
