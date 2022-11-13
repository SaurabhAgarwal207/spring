package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/collegeconfig.xml");
		College c = (College)context.getBean("c1");
		System.out.println(c);
		context.registerShutdownHook();
	}

}
