package com.tarun.loadingfrompropfiles;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String Name;
	
	@Value("${student.Intrestedcourse}")
	private String Intrestedcourse;
	
	@Value("${student.Hobby}")
	private String Hobby;

//	@Value("${student.name}")
//	public void setName(String name) {
//		Name = name;
//	}
//
//	@Required
//	@Value("${student.Intrestedcourse}")
//	public void setIntrestedcourse(String intrestedcourse) {
//		Intrestedcourse = intrestedcourse;
//	}
//
//	@Value("${student.Hobby}")
//	public void setHobby(String hobby) {
//		Hobby = hobby;
//	}

	public void studentInfo() {
		System.out.println("Student name is " + Name);
		System.out.println("Student Intrested Course is " + Intrestedcourse);
		System.out.println("Student Hobbies is " + Hobby);
	}

}
