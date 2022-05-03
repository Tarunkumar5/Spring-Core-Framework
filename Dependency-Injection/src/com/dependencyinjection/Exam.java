package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	Student tarun = context.getBean("tarun", Student.class);
	tarun.DisplayStudentInfo();
	
	Student chandu = context.getBean("chandu", Student.class);
	chandu.DisplayStudentInfo();
	}

}
