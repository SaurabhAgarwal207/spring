package com.springcore.stereotype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student stud =context.getBean("student",Student.class);
		System.out.println(stud);
		System.out.println(stud.getAddress());
		System.out.println(stud.getAddress().getClass().getName());
		
		System.out.println("-------------------");
		System.out.println("Hashcode of stud object : "+stud.hashCode());
		Student stud1 = context.getBean("student",Student.class);
		System.out.println("Hashcode of stud1 object : "+ stud1.hashCode());
	}
}
