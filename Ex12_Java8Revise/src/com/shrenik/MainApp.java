package com.shrenik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.shrenik.example.Address;
import com.shrenik.example.Passenger;

public class MainApp {

	public static void main(String[] args) {
		
		List <Passenger> passengersList = new ArrayList();
		
		passengersList.add(new Passenger("Yash",new Address("MG Road","Pune")));
		passengersList.add(new Passenger("Rahul",new Address("N P Road","California")));
		passengersList.add(new Passenger("Sneha",new Address("N S Road","London")));
		
		//1. comparable order by city
		//Collections.sort(passengersList);
		
		//passengersList.forEach((passenger)->System.out.println(passenger));
		
		
		//2. comparator order by passenger_name
		
		Collections.sort(passengersList, (p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		});
		
		System.out.println("\n Using Comparator");
		passengersList.forEach(passenger->System.out.println(passenger));
	}

}
