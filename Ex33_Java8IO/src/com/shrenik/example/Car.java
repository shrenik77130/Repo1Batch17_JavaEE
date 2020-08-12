package com.shrenik.example;

import java.io.Serializable;

public class Car implements Serializable{
	private int carid;
	private String carname;
	private String color;
	private float fuelcap;
	
	
	public Car() {}
	
	public Car(int carid, String carname, String color, float fuelcap) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.color = color;
		this.fuelcap = fuelcap;
	}
	
	

	public int getCarid() {
		return carid;
	}

	public String getCarname() {
		return carname;
	}

	public String getColor() {
		return color;
	}

	public float getFuelcap() {
		return fuelcap;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", color=" + color + ", fuelcap=" + fuelcap + "]";
	}	
}



/*

	Database of Showroom -> "Car Table" -> 500 Records
	
	1. get Data from Database in Java Class

*/