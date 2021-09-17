package com.company;

public class ShirtTest {

    public static void main(String [] args)
    {
        Shirt myShirt=new Shirt(1,2200,ColorCode.G);
        Shirt yourShirt=new Shirt(2,2100,ColorCode.B);
        System.out.println(myShirt.getDetails());
        System.out.println(yourShirt.getDetails());
    }
}
