package com.springcore.lifecycle;

public class School {
	private double fees;

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		System.out.println("Setting fees");
		this.fees = fees;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "School [fees=" + fees + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}

}
