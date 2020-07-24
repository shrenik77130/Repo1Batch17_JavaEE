package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {

	public static void main(String[] args) {
		// sorted method used to sort stream
		
		List <String> cities = Arrays.asList("California","London","Delhi","Newyork");
		
		
		// Sorting Cities using stream api in java 8
		List <String> sortedCities = cities.stream().sorted().collect(Collectors.toList());
		sortedCities.forEach(System.out::println);
		
		
		// collect method used to get stream in the form of Collection
		List <Integer>numbers = Arrays.asList(18,34,13,4,0);
		Set squreOfNumbers = numbers.stream().map(t->t*t).collect(Collectors.toSet());
		
		squreOfNumbers.forEach(System.out::println);
}

}
