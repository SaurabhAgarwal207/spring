package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        	Student stud = (Student)context.getBean("student1");
        	System.out.println(stud);
        	
        	Book book = (Book)context.getBean("book1");
        	System.out.println(book);
        	
        	Book b1=(Book)context.getBean("book2");
        	System.out.println(b1);
        	
        	Employee e1 = (Employee)context.getBean("employee1");
        	System.out.println(e1);
    }
}
