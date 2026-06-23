package com.exceptionHandling;

public class SingleTry_catch {

	public static void main(String[] args) {
		try {
			int result = 10 / 0;
		} 
		
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}

}
