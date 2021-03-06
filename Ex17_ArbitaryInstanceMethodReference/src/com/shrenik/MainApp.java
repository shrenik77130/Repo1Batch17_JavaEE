package com.shrenik;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.shrenik.example.Person;

public class MainApp {

	public static void main(String[] args) {
		
			List<Person> personRecords = new ArrayList();
			
			personRecords.add(new Person("Mathew",36));
			personRecords.add(new Person("Robart",14));
			personRecords.add(new Person("Eliz",14));
			personRecords.add(new Person("Nayan",41));
			
			List ageList = listAgeOfPerson(personRecords,Person::getAge);
			List personList = OtherlistAgeOfPerson(personRecords,Person::new);
			
			System.out.println("Ages = " + ageList);
			System.out.println("Persons = " + personList);
	}
	
	public static List listAgeOfPerson(List <Person>records, Function <Person,Integer>objTest)
	{
		List newList = new ArrayList();
		
		records.forEach(x->newList.add(objTest.apply(x)));
		
		return newList;
	}
	
	public static List OtherlistAgeOfPerson(List <Person>records, BiFunction <String,Integer,Person>objTest)
	{
		List newList = new ArrayList();
		
		records.forEach(x->newList.add(objTest.apply(x.getPersonname(), x.getAge())));
		
		return newList;
	}	
}
