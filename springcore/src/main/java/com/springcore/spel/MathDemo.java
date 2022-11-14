package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("md")
public class MathDemo {

	@Value("#{T(java.lang.Math).PI}")
	private int pi;
	
	@Value("#{T(java.lang.Math).sqrt(169)}")
	private double sq;
	@Value("#{new java.lang.String('Ranu')}")
	private String name;
	@Value ("#{4%2==0}")
	private boolean yono;

	public int getPi() {
		return pi;
	}

	public void setPi(int pi) {
		this.pi = pi;
	}

	public double getSq() {
		return sq;
	}

	public void setSq(double sq) {
		this.sq = sq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isYono() {
		return yono;
	}

	public void setYono(boolean yono) {
		this.yono = yono;
	}

	@Override
	public String toString() {
		return "MathDemo [pi=" + pi + ", sq=" + sq + ", name=" + name + ", yono=" + yono + "]";
	}

	

	
	
}
