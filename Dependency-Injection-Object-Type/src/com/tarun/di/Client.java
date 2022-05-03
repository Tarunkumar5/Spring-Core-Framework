package com.tarun.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*
		 * Student stud = new Student(); MathCheat cheat = new MathCheat();
		 * stud.setMathcheat(cheat); stud.Cheating();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stud = context.getBean("stud", Student.class);
		stud.StudentCheating();

		AnotherStudent anotherstud = context.getBean("anotherstud", AnotherStudent.class);
		anotherstud.AnotherStudentCheating();

	}

}
