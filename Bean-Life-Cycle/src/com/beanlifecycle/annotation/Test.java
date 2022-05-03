package com.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		StudentDAO dao = new StudentDAO();
//		dao.selectAllRows();
//		dao.deleteSongs(6);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//StudentDAO studentDao = context.getBean("studentDAO", StudentDAO.class);
		//studentDao.selectAllRows();
		
		
//		((ClassPathXmlApplicationContext)context).close();
		
		//need to study more on registerShutdownHook
		//context.registerShutdownHook();
	
		
		Hello hello = context.getBean("hello", Hello.class);
		hello.sample();
		
		context.close();
	
	}

}


// bean life cycle approach 
//1. annotation
//2. xml based 
//3. interface 
