package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor of double and double");
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor of int and int)");
	}

	
	public void doSum() {
		System.out.println("sum is : "+(this.a+this.b));
	}
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	

}
