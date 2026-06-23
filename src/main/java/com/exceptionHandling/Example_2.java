package com.exceptionHandling;

public class Example_2 {

	public static void main(String[] args) {

		try {
			int result = 10 / 2;
			int[] a = new int[5];
			System.out.println(a[2]);
			Person p = null;

			System.out.println(p.getName());
		}

		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {

		System.err.println(e.getMessage());
		
	}

}
}