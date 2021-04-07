package com.cg.spring.DI_demo.bean;

import java.util.Map;

public class State2 {
	String stateName;

	Map<String, String> cities;

	public State2() {
	}

	public State2(String stateName, Map<String, String> cities) {
		super();
		this.stateName = stateName;
		this.cities = cities;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

}
