package com.dependencyinjection;

public class Student {

	private int id;
	private String studentName;
	
	
	
// setter injection
	
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
	
// Constructor Injection
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public void DisplayStudentInfo() {
		System.out.println("Student Id is = "+ id +"\n"+ "Student Name is = "+ studentName);
	}

}
