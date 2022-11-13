package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class College implements InitializingBean,DisposableBean {

	private double fees;

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [fees=" + fees + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("working as destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println( " afterPropertiesSet called , working as init");
		
	}
	
}
