package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.shrenik.example.Numbers;

public class MainApp {

	public static void main(String[] args) {
	
		List <Integer> list = Arrays.asList(19,43,13,51,41,31,44);
		
		//Using a anonymous Implementation
		Numbers.findNumbers(list, new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return Numbers.isLesserThan(t);
			}
		});
		
		//Using Lambda Expressions
		
		Numbers.findNumbers(list, (x)-> Numbers.isLesserThan(x));
		
		//Using static Reference
		List ans = Numbers.findNumbers(list, Numbers::isLesserThan);
		System.out.println(ans);
		
		

	}
}
