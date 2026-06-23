package com.inheritance;

public class C extends A {
	
	
	private int z=70;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	public C(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void add() {
		int z=90;
		System.out.println(x+y+this.z);
	}

}
