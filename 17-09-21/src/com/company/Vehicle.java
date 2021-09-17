package com.company;

public class Vehicle {

    private String name;
    private double fuelCapacity;

    public Vehicle() {
    }

    public Vehicle(String name, double fuelCapacity) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
    }

    public String getDetails()
    {
        return "Name: "+name+" Fuel capacity: "+fuelCapacity;
    }
}
