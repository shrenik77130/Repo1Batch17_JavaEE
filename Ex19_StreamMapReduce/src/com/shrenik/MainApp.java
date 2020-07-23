package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainApp {

	public static void main(String[] args) {
		List <Integer> numbersList = Arrays.asList(1,5,3,2,5);
		
		// Make Addition of all numbers in the list
		int addn=0;
		for(int i:numbersList)
		{
				addn = addn+i;
		}
		
		System.out.println("Addition of all List Items =" + addn);
		
		//Using stream() method of Collections
		
		//System.out.println(numbersList.stream().map(no->no*2).reduce(0,(c,e)->c+e));
		
		Function <Integer,Integer> f = new Function<Integer,Integer>()
			{
				@Override
				public Integer apply(Integer no) 
				{
					return no*2;
				}
			};
		
		Stream s1 = numbersList.stream();
		
		Stream anotherStream = s1.map(f); // 2 10 6 4 10
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
			
		};
		
		anotherStream.reduce(0,b);
		
		System.out.println(numbersList.stream().map(no->no*2).reduce(0,(c,e)->c+e));
		
	}

}
