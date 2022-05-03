package com.spring.college;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.college")
@PropertySource("classpath:College-Info.properties")
public class CollegeConfig {
	
	/*
	@Bean
	public Teacher mathteacherbean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalbean() {
		return new Principal();
	}
	
	@Bean
	public College collegebean() { // bean id- collegebean
		//College college = new College(principalbean());
		College college = new College();
		college.setPrincipal(principalbean());
		college.setTeacher(mathteacherbean());
		return college;
	}

	*/
}
