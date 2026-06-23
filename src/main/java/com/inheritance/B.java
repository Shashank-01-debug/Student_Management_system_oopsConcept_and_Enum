package com.inheritance;

public class B extends A {
	int x=150;
	

	public B(int x, int y) {
		super(x, y);
		
	}

	public void add() {
		int y=40;
		System.out.println(this.x + y);
	}

}
