package com.shrenik.example;

public class Client{
	
	private String clientname;
	private int age;
	
	
	public Client() {}
	
	public Client(String clientname, int age) {
		super();
		this.clientname = clientname;
		this.age = age;
	}

	public String getClientname() {
		return clientname;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Client [clientname=" + clientname + ", age=" + age + "]";
	}
}
