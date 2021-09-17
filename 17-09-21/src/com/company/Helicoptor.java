package com.company;

public class Helicoptor extends Vehicle implements Flyer{

    private int numberOfWings;

    public Helicoptor() {
        super();
    }

    public Helicoptor(String name, double fuelCapacity, int numberOfWings) {
        super(name, fuelCapacity);
        this.numberOfWings = numberOfWings;
    }

    @Override
    public void land() {
        System.out.println("helicoptor landing ");
    }

    @Override
    public void takeOff() {
        System.out.println("helicoptor is takingoff");
    }

    @Override
    public void fly() {
        System.out.println("helicoptor is flying");
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" Number Of Wings: "+numberOfWings;
    }
}
