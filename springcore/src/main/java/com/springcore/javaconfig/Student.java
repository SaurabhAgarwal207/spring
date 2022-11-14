package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Course course;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student(Course course) {
		super();
		this.course = course;
	}

	public void study() {
		this.course.display();
		System.out.println("student is running book");
	}

	
}
