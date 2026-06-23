package com.exceptionHandling;

public class Sample {

	public static void main(String[] args) throws ArithmeticException{
		
		System.out.println("Line 1");		
		System.out.println("Line 2");	
	//	int result=10/0;
		
		try {
			//risky code
		int result=10/0;
		
		}
		
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
					}
		
		System.out.println("Line 3");		
	}

}
