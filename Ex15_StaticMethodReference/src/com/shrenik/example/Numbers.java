package com.shrenik.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Numbers {
	
	public static boolean isLesserThan(int no) {
		return no<50;
	}
	
	public static List <Integer> findNumbers(List <Integer> list, Predicate <Integer> p)
	{
		List <Integer>newList = new ArrayList();
		for(Integer x:list)
		{
			if(p.test(x))
			{
				newList.add(x);
			}
		}
		
		return newList;
	}
}
