package com.example;

public class SuperMan extends Flyer{

	@Override
	public void takeOff() {
		System.out.println("superman takingoff");
		
	}

	@Override
	public void land() {
		System.out.println("superman landed");
		
	}

	@Override
	public void fly() {
		System.out.println("superman flying");
		
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("hello i am superman");
	}

}
