package com.shrenik.example;

public class User {
	private String fname;
	private String lname;
	private String gender;
	private int age;
	
	
	public User() {}
	
	public User(String fname, String lname, String gender, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
