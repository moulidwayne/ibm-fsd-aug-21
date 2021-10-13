package org.example;

import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;
import org.example.service.CDService;
import org.example.service.CDServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        CDService service=new CDServiceImpl();
        SpecialEditionCD specialEditionCD=new SpecialEditionCD();
        specialEditionCD.setCdName("Titanic");
        specialEditionCD.setReleaseYear("1998");
        CD cd=service.createSpecialCD(specialEditionCD);
        System.out.println(cd);
        InternationalCD internationalCD=new InternationalCD();
        internationalCD.setCdName("Godzilla");
        internationalCD.setReleaseYear("2001");
        CD cd1=service.createSpecialCD(internationalCD);
        System.out.println(cd1);

    }
}
