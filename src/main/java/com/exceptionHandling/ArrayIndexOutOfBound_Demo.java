package com.exceptionHandling;

public class ArrayIndexOutOfBound_Demo {

	public static void main(String[] args) {
		int[] a = new int[3];
		
		a[0]=31;
		a[1]=38;
		a[2]=75;
		try {
				
				System.out.println(a[5]);
				System.out.println("inside try block");
				}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		
		for(int i:a) {
			System.out.println(i);
		}

			
	}

}
