package com.springcore.cschema;

import java.util.List;

public class Person {

	private String fname;
	private String lname;
	private Address addr;
	private List<String> phones;
	
	public Person(String fname, String lname, Address addr, List<String> phones) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.addr = addr;
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", addr=" + addr + ", phones=" + phones + "]";
	}
	
}
