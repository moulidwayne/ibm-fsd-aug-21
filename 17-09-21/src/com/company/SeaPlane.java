package com.company;

public class SeaPlane extends Vehicle implements Flyer{
    private int pasengerCapacity;
    public SeaPlane() {
        super();
    }

    public SeaPlane(String name, double fuelCapacity, int pasengerCapacity) {
        super(name, fuelCapacity);
        this.pasengerCapacity = pasengerCapacity;
    }

    @Override
    public void land() {
        System.out.println("seaplane is landing");
    }

    @Override
    public void takeOff() {
        System.out.println("seaplane is takingOff");
    }

    @Override
    public void fly() {
        System.out.println("seaplane is flying");
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" Pasenger Capacity: "+pasengerCapacity;
    }
}
