package com.cg.spring.DI_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.spring.DI_demo.bean.Person;

public class AutowiringDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Autowiring_eg_beans.xml");
		Person p = container.getBean("per1",Person.class);
		System.out.println(p.getSsn()+"  "+p.getName());
		System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity()+"  "+p.getAddress().getState());
		container.close();
		
	}

}
//setter injection is used in byType 
//constructor injection is used in constructor
//for byName the id should be same as the name given in person class