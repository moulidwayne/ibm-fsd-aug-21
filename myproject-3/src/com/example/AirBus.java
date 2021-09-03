package com.example;

public class AirBus extends Flyer{

	@Override
	public void takeOff() {
		System.out.println("airbus takingoff");
		
	}

	@Override
	public void land() {
		System.out.println("airbus landing");
		
	}

	@Override
	public void fly() {
		System.out.println("airbus flying");
		
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		System.out.println("hello i am airbus");
	}
	
	

}
