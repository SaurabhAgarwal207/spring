package com.springcore.cschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CSchemaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cschema/cschemaconfig.xml");
				Person p = (Person)context.getBean("per");
				System.out.println(p);
	
	}

}
