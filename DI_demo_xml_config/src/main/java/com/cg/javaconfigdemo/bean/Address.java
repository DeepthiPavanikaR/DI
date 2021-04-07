package com.cg.javaconfigdemo.bean;

import org.springframework.stereotype.Component;

//@Component
public class Address {
	String hno="1-2-3";
	String street="Sidlaghatta";
	String city="Chikkaballapur";
	String state="Karnataka";

	public Address() {
	}

	public Address(String hno, String street, String city, String state) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
