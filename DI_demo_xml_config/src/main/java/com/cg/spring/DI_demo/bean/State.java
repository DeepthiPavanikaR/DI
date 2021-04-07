package com.cg.spring.DI_demo.bean;

import java.util.List;
import java.util.Set;

public class State {
	String stateName;
	//Set<String> cities;
	List<String> cities;

	public State() {
	}

	//public State(String stateName, Set<String> cities) {
	public State(String stateName, List<String> cities) {
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

	//public Set<String> getCities() {
	public List<String> getCities() {
		return cities;
	}

	//public void setCities(Set<String> cities) {
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
