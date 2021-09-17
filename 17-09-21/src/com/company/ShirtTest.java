package com.company;
import static com.company.ColorCode.*;
public class ShirtTest {

    public static void main(String [] args)
    {
        Shirt myShirt=new Shirt(1,2200,G);
        Shirt yourShirt=new Shirt(2,2100,B);
        Shirt anotherShirt=new Shirt(3,3300,R);
        System.out.println(myShirt.getDetails());
        System.out.println(yourShirt.getDetails());
    }
}
