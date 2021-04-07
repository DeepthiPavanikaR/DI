package com.cg.spring.DI_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.DI_demo.bean.Wisher;

public class App 
{
    public static void main( String[] args )
    {
       // ApplicationContext container = new ClassPathXmlApplicationContext("Beans.xml");
       ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Beans.xml");
       Wisher w = (Wisher) container.getBean("wish1");
       System.out.println(w.getMessage());
       // Wisher w1 = container.getBean("wish1",Wisher.class);
       /* Wisher w1 = container.getBean("wish1",Wisher.class);
        System.out.println(w1.getMessage());
        Wisher w2 = container.getBean("wish1",Wisher.class);
        System.out.println(w2.getMessage());
        w1.setMessage("Hello World");
        System.out.println(w2.getMessage());*/
        container.close();
    }
}

// in Beans.xml if scope is not written then by default it takes as singleton