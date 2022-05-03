package com.spring.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegebean") //it will create the obj for this college class
public class College {
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	//@Value("Java University")
	@Value("${College.name}")
	private String collegeName;
//	
//	public College(Principal principal) {
//		this.principal = principal;
//	}
	
	/*
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("Principal setter called");
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("Teacher setter called");
	}
	
	*/

	@Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My College name is: "+ collegeName);
		System.out.println("testing done");
	}

	
}
