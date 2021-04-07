package com.cg.spring.DI_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Person;

public class App1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Beans.xml","Beans2.xml");
		Person p = container.getBean("per1",Person.class);
		System.out.println(p.getSsn()+"  "+p.getName());
		System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity()+"  "+p.getAddress().getState());
		container.close();
	}

}
