package com.example;

public class Bird extends Flyer{

	@Override
	public void takeOff() {
		System.out.println("bird takingoff");
		
	}

	@Override
	public void land() {
		System.out.println("bird landing");
		
	}

	@Override
	public void fly() {
		System.out.println("bird flying");
		
	}
public void displayBird()
{
	System.out.println("hello i am bird");
}
}
