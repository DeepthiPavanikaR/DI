package com.cg.spring.DI_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.State;

public class Main2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Beans4.xml");
		State s=container.getBean("state1",State.class);
		System.out.println(s.getStateName());
		System.out.println("--------- Cities -------");
		for(String c: s.getCities())
			System.out.println(c);
		container.close();
	}

}
