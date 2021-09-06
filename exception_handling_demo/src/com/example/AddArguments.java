package com.example;

public class AddArguments {

	public static void main(String[] args) {
		//primitive type
		int sum=0;
		//boxing
		int i=0;
		//convert a primitive type to wrapper type
		Integer sum1=new Integer(i);
		//convert wrapper type to primitive type//unboxing
		int b=sum1.intValue();
		//autoboxing
		Integer a=200;
		//auto unboxing
		int result=a;
		
		//code which may occur exception at runtime put it on try block
		
		
			for(String str:args)
			{
				try {
				sum+=Integer.parseInt(str);
				}
				catch(NumberFormatException nfe)
				{
					System.err.println("[" + str + "] is not an integer"
							+ " and will not be included in the sum.");
				}
			}
			System.out.println("Sum is: "+sum);
			
		
		
		}
		
		
	

	}


