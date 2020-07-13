package com.shrenik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.shrenik.example.Client;

public class MainApp {

	public static void main(String[] args) {
		List <Client> clientRecords = new ArrayList();
		
		
		clientRecords.add(new Client("Smith",33));
		clientRecords.add(new Client("Peter",41));
		clientRecords.add(new Client("John",36));
		

		//Q1.
		clientRecords.forEach((Client client)-> System.out.println(client));
		
		//Q2.
		
		Comparator mycomp = new Comparator<Client>() {

			@Override
			public int compare(Client o1, Client o2) {
				if(o1.getAge() > o2.getAge())
					return 1;
				else if(o1.getAge() < o2.getAge())
					return -1;
				else 
					return 0;
			}
		};
		
		Collections.sort(clientRecords,(o1,o2)->{
			if(o1.getAge() > o2.getAge())
				return 1;
			else if(o1.getAge() < o2.getAge())
				return -1;
			else 
				return 0;			
		});  
		
		System.out.println(clientRecords);
		
		//Q3.
		clientRecords.forEach(System.out::println);
	}

}
