package com.Enum_demo;

public class Runner {

	public static void main(String[] args) {

		System.out.println(PaymentMode.CARD.getDescription());
		int index = PaymentMode.CARD.ordinal();
		System.out.println(index);
		PaymentMode[] modes = PaymentMode.values();

		for (PaymentMode mode : modes) {
			System.out.println(mode);
		}
		
		PaymentMode.UPI.demo();
	}

}
