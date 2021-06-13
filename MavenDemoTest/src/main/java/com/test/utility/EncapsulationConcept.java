package com.test.utility;

import Oops.EncapsulationConcept;

public class EncapsulationConcept {

	private int id;
	private String name;
	private int age;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
		EncapsulationConcept emp = new EncapsulationConcept();
		emp.setId(77303);
		emp.setAge(24);
		emp.setName("Tom Sawyer");
		
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
	}


}
