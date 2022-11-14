package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collections/collconfig.xml");
		Emp e =context.getBean("emp1",Emp.class);
		System.out.println(e);

}
}
