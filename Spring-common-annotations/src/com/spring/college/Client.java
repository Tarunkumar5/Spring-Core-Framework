package com.spring.college;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegebean", College.class);
		System.out.println(college);
		college.test();
		context.close();
	}

}
