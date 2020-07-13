package com.shrenik.example;

public class Passenger implements Comparable<Passenger>{

	private String name;
	private Address address;
	
	
	public Passenger() {}
	
	public Passenger(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Passenger o) {
		return this.address.getCity().compareTo(o.getAddress().getCity());
	}
	
	
}
