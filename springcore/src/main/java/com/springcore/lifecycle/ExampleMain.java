package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/lifecycle/exampleconfig.xml");
		Example e = (Example)context.getBean("eg");
		System.out.println(e);
		context.registerShutdownHook();

	}

}
