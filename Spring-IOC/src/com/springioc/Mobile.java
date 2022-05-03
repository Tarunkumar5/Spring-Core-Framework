package com.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		/*
		 * Spring Framework can create and manage objects for us Spring has its own
		 * container, spring doesn't depends on anybody spring container read our config
		 * file and all the classes that we have mentioned in config file... will
		 * generate objects from the classes in config file. and those objects will
		 * going to manage in that container
		 * 
		 * Spring Inversion of control - can create the objects
		 * 							   - can manage our objects
		 * 							   - Helping our application to be configurable
		 * 							   - Manage dependencies
		 * 
		 * All the objects the spring creates and manages inside the IOC Container is
		 * called as Spring Beans. We can get the bean from IOC Container using
		 * getBean();
		 * 
		 * There are two types of IOC Container: 1. Bean Factory 2. Application Contect
		 * 
		 * Application Context is little advance than Bean Factory ApplicationContext
		 * and Bean Factory are Interface We cannot use interface, because interface
		 * cannot function We should have some implemented classes to use Interfaces For
		 * ApplicationContext there is a implementation class called
		 * ClassPathXmlApplicationContext
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Sim sim = context.getBean("air", Airtel.class);
		sim.Calling();
		sim.Browsing();
		
		Sim sim1 = context.getBean("jio", Jio.class);
		sim1.Calling();
		sim1.Browsing();
	
		

	}

}


















