package com.shrenik.example;

public class Person {
	public String name;
	public int age;
	
	public Person() {}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
