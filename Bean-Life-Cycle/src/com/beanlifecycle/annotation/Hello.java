package com.beanlifecycle.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean{
	
//	public void init() {
//		System.out.println("calling init method");
//	}
//	
//	public void destroy() {
//		System.out.println("calling destroy method");
//	}

	//interface approach
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method --> init");
		
	}
	
	public void sample() {
		System.out.println("My sample method");
	}

	@Override
	public void destroy() throws Exception {
	System.out.println("Inside destroy method --> destroy");
	
}

}
