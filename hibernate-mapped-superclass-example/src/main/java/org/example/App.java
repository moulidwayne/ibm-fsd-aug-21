package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.model.CD;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;
import org.example.service.CDService;
import org.example.service.CDServiceImpl;

import java.util.List;
import java.util.Scanner;
@Slf4j
public class App 
{
private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        CDService service=new CDServiceImpl();
        /*CDService service=new CDServiceImpl();
        SpecialEditionCD specialEditionCD=new SpecialEditionCD();
        specialEditionCD.setCdName("Titanic");
        specialEditionCD.setReleaseYear("1998");

        CD cd=service.createSpecialCD(specialEditionCD);
        System.out.println(cd);
        InternationalCD internationalCD=new InternationalCD();
        internationalCD.setCdName("Godzilla");
        internationalCD.setReleaseYear("2001");
        CD cd1=service.createSpecialCD(internationalCD);
        System.out.println(cd1);*/
        String choice=null;
        String cdName,releaseYear=null;
        CD cd=null;
        do {
            System.out.println("1. Create New CD: ");
            System.out.println("2. Display All International CDS: ");
            System.out.println("3. Display All Special Edition CDS: ");
            System.out.println("0. Exit:  ");
            System.out.print("Enter Your Choice: ");
            choice=scanner.next();
            switch (choice)
            {
                case "1":
                    System.out.print("Enter CD Name: ");
                    cdName=scanner.next();
                    System.out.print("Enter Release Year: ");
                    releaseYear=scanner.next();

                   System.out.println("CD Type(s for special edition/i for international): ");
                   String type=scanner.next();
                   if (type.equals("s"))
                   {
                       cd=new SpecialEditionCD();
                   }
                   if (type.equals("i"))
                   {
                       cd=new InternationalCD();
                   }
                   cd.setCdName(cdName);
                   cd.setReleaseYear(releaseYear);
                   System.out.println(service.createCD(cd));
                   log.info("cd created successfully...");
                   break;
                case "2":
                    log.info("displaying all international cds.");
                    List<InternationalCD> internationalCDS=service.displayAllInterNationalCD();
                    for(InternationalCD i:internationalCDS)
                    {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    log.info("displaying all international cds.");
                    List<SpecialEditionCD> specialEditionCDS=service.displayAllSpecialEditionCD();
                    for(SpecialEditionCD s:specialEditionCDS)
                    {
                        System.out.println(s);
                    }
                    break;
                case "0":
                    System.out.println("Bye..!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }

        }while (!choice.equalsIgnoreCase("n"));

    }
}
