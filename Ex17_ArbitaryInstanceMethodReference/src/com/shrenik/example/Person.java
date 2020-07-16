package com.shrenik.example;

public class Person {
	private final String personname;
	private final int age;
	
	public Person(String personname, int age) {
		super();
		this.personname = personname;
		this.age = age;
	}

	public String getPersonname() {
		return personname;
	}

	public int getAge() {
		return age;
	}	
}
