package com.cg.javaconfigdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cg.javaconfigdemo.bean.Address;
import com.cg.javaconfigdemo.bean.Person;

//This is equal to the xml file
@Configuration
//@ComponentScan(basePackages="com.cg.javaconfigdemo.bean")
public class AppConfig {
	//the below code wont be there for @Component and @Autowired
	//the below code is equivalent to xml bean definition
	@Bean
	public Address address() {
		return new Address("4-5-6","MG Colony","Hyderabad","Telangana");
	}
	
	@Bean
	public Person person() {
		return new Person(200,"Vijay",address());
	}

}
