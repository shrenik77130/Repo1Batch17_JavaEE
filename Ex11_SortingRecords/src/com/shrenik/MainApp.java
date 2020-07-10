package com.shrenik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.shrenik.example.Client;

public class MainApp {

	public static void main(String[] args) {
		List <Client>clientRecords = new ArrayList();

		clientRecords.add(new Client("Yash",34));
		clientRecords.add(new Client("Ayush",19));
		clientRecords.add(new Client("Mihit",29));
		
		System.out.println("Client Records before Sorting");
		
		System.out.println("\n Method 1");
		// method-1 forEach Iteration
		clientRecords.forEach(rec-> {
			System.out.println(rec);		
		});
		
		
		System.out.println("\n Method 2");
		// method-2 
		clientRecords.forEach(System.out::println);
		
		//Sorting Client Records
		Collections.sort(clientRecords, new Comparator<Client>() {

			@Override
			public int compare(Client o1, Client o2) {
				if(o1.getAge()>o2.getAge())
					return 1;
				else if(o1.getAge() < o2.getAge())
					return -1;
				else
					return 0;
			}});
		
		System.out.println("\n After Sorting Clients are");
		
		clientRecords.forEach(System.out::println);
		
		
		// New Implementation to Sort Client Records
		Collections.sort(clientRecords, (e1, e2) -> e1.getClientname().compareTo(e2.getClientname()));
		
		
		
		
		
		
		}
}





//
//Collections.sort(clientRecords, new Comparator<Client>() {
//
//	@Override
//	public int compare(Client o1, Client o2) {
//		return o1.getClientname().compareTo(o2.getClientname());
//	}});
