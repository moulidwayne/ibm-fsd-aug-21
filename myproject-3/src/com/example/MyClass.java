package com.example;

public class MyClass  {

	public static void main(String args[])
	{
		Flyer myFlyer=null;
		myFlyer=new SuperMan();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		myFlyer.getDetails();
		myFlyer=new Bird();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		myFlyer.getDetails();
		//not accessable because its not the part of base class
		//myFlyer.displayBird();
		myFlyer=new AirBus();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		myFlyer.getDetails();
		
	}
}
