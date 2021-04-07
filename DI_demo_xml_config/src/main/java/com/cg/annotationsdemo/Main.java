package com.cg.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.annotationsdemo.bean.Person;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Annotationsdemo_beans.xml");
		//Person p = container.getBean("per1",Person.class);
		Person p = container.getBean(Person.class);
		System.out.println(p.getSsn()+"  "+p.getName());
		System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity()+"  "+p.getAddress().getState());
		container.close();
	}

}
