package com.Enum_demo;

public enum PaymentMode implements Demo {
	
	CASH("payment via cash"),
	UPI("payment via google pay"),
	CARD("payment via credit card");
	
	private String description;
	
	private PaymentMode(String description){
		this.description=description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public void demo() {
	System.out.println("Method from Demo Interface");		
	
	}
	
}
