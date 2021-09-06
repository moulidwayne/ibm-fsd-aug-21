package com.example;



public class MyClass {
	
	private int firstNumber;
	private int secondNumber;
	private int result;
	public MyClass() {
		super();
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public int devide()
	{
		try {
			result=getFirstNumber()/getSecondNumber();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
