package com.staticDemo;

public class Emp {
	
	
	private String name;
	static String companyName;
	
	public Emp(String name) {
		this.name=name;
		System.out.println("Inside the Emp Constructor");
		
	}
	
	static{
		
		companyName="Oracle";
		System.out.println("Inside the static Block");
	}
	
	static{
		companyName="Patanjali";
		System.out.println("Inside the static Block 2");
	}
	
	static{
		companyName="comcast";
		System.out.println("Inside the static Block 3");
	}

}
