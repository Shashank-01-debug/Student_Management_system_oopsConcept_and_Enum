package com.builder;

public class Runner {

	public static void main(String[] args) {
		
		
		Emp e2 = new Emp.Builder().name("uday").salary(20000).empId("E-201").build();
		System.out.println(e2);
	}

}
