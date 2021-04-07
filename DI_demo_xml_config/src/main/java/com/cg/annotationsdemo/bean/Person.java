package com.cg.annotationsdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Person {
	//int ssn;
	//String name;
	int ssn=7001;
	String name="Jerry";
	/*//@Autowired
	//@Qualifier("add2") // This is used when there are 2 id's for address
	Address address;*/
	
	@Autowired
	Address address;

	public Person() {
	}

	public Person(int ssn, String name, Address address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	//@Autowired
	//cannot use @Qualifier("add2") on constructor
	public Person(Address address) {
		this.address=address;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	//@Autowired
	//@Qualifier("add2") 
	public void setAddress(Address address) {
		this.address = address;
	}

}
