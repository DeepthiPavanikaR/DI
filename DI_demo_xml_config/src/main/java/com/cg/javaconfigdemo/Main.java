package com.cg.javaconfigdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cg.javaconfigdemo.bean.Person;
import com.cg.javaconfigdemo.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		Person p = container.getBean(Person.class);
		System.out.println(p.getSsn()+"  "+p.getName());
		System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity()+"  "+p.getAddress().getState());
		container.close();
	}

}
