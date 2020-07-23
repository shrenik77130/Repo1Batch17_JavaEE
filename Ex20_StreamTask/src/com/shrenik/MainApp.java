package com.shrenik;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.shrenik.example.Person;

public class MainApp {

	public static void main(String[] args) {
				
		List <Person> personList = new ArrayList();
	
		personList.add(new Person("Smith",41));
		personList.add(new Person("Yash",18));
		personList.add(new Person("Mathew",52));
		personList.add(new Person("Peter",12));
		personList.add(new Person("John",20));
		
		//Q1. filter and print records of person whose age is >20
		
				// using lambda Expression
		
					System.out.println("\n Using Lambda Expression Q1 is");
		
					personList.forEach(x->{
						if(x.age>20)
						{
							System.out.println(x);
						}
					});
		
				// using stream()
					
					System.out.println("\n Using stream() api Q1 is");
					
					
					personList.stream().filter(x->x.age>20).forEach(System.out::println);
		
		//Q2. double the age of person and print output
		
		
		//Q3. double the age of person only if >20
		
		
	}
}
