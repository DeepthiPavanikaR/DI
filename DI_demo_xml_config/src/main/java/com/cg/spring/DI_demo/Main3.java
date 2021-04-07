package com.cg.spring.DI_demo;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.State2;

public class Main3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Beans4.xml");
		State2 s = container.getBean("state2", State2.class);
		System.out.println(s.getStateName());
		System.out.println("--------- Cities -------");
		for (Entry<String, String> c : s.getCities().entrySet())
			System.out.println(c.getKey() + "  " + c.getValue());
		container.close();
	}
}
