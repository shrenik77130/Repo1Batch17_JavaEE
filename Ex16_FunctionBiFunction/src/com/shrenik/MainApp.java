package com.shrenik;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainApp {

	public static void main(String[] args) {
		
		Function <Integer,Double>objTest = no-> (no/3.0);
		
		Double ans = objTest.apply(19);
		System.out.println("Using Function Interface ans = " + ans);
		
		BiFunction <Integer,Integer,Integer>objBiTest = (fnum,snum)-> (fnum + snum);
		
		int bians = objBiTest.apply(18, 3);
		System.out.println("Addition using BiFunction Object = " + bians);
	}
}
