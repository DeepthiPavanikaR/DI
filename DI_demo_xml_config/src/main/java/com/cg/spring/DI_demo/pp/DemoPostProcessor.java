package com.cg.spring.DI_demo.pp;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) { //preinit method
		System.out.println("From ppbi()");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) { //postinit method
		System.out.println("From ppai()");
		return bean;
	}

}
//this preinit method and postinit method is common to all the beans in this application
