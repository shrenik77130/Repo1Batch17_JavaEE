package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import com.shrenik.example.Numbers;

public class MainApp {

	public static void main(String[] args) {
	
			List <Integer> list = Arrays.asList(19,43,13,51,41,31,44);
			
			// Using an anonymous class
			List ans;
			ans = Numbers.findNumbers(list, new BiPredicate<Integer, Integer>() {
				
				@Override
				public boolean test(Integer fnum, Integer snum) {
					return Numbers.isMoreThanFifty(fnum, snum);
				}
			});
			
			System.out.println("More than Fifty = " + ans);
			
			// Using Lambda Expressions
			Numbers.findNumbers(list, (fnum, snum) ->  { return Numbers.isMoreThanFifty(fnum, snum); });		
			

			//using a method Reference
			Numbers.findNumbers(list, Numbers::isMoreThanFifty);
	}

}
