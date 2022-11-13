package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *Class to create ApplicationContext object and getting bean object
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        	Student stud = (Student)context.getBean("student1");
        	System.out.println(stud);
        	
        	Book book = (Book)context.getBean("book1");
        	System.out.println(book);
        	
        	Book b1=(Book)context.getBean("book2");
        	System.out.println(b1);
        	
        	Employee e1 = (Employee)context.getBean("emp1");
        	System.out.println(e1);
    }
}
