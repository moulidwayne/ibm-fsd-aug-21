package com.company;

import java.util.Random;

public class Customer {

    //blank final variable
    private  final long customerId ;
    private String name;
    private int age;

    public Customer() {
        customerId=getCustomerId();
    }

    public Customer(String name, int age) {
        customerId=getCustomerId();
        this.name = name;
        this.age = age;
    }

    public Customer(long customerId, String name, int age) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
    }

    public long getCustomerId()
    {
        return new Random().nextInt(10000);
    }

    @Override
    public String toString() {
        return "customer id: " + customerId + " name: " + name+" age "+age;
    }
}
