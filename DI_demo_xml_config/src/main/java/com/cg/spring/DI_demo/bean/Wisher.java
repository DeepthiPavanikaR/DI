package com.cg.spring.DI_demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class Wisher {
public class Wisher implements InitializingBean,DisposableBean{
	private String message;

	public Wisher() {
		System.out.println("Object created");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void wishInit() {// name can be anything
		System.out.println("From init()");
	}
	
	public void wishDestroy() {// name can be anything
		//will be invoked only for singleton objects
		System.out.println("From destroy()");
	}
// from this code onwards implements is needed
	@Override
	public void destroy() throws Exception {
		System.out.println("From DisposableBean destroy()");
		
	}

	@Override //this acts as init-method
	public void afterPropertiesSet() throws Exception {
		System.out.println("From afterPropertiesSet()");
		
	}

}
