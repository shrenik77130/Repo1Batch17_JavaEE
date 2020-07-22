package com.shrenik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class MainApp {

	public static void main(String[] args) {
		List <String>citiesList = Arrays.asList("California","","Newyork","Delhi","London","Delhi","","Honkong");
		
		//Count Empty Strings
		int emptyCities = countEmptyStrings(citiesList);
		System.out.println("Total Empty String found = " + emptyCities);
		
		long count = citiesList.stream().filter(city->city.isEmpty()).count();
		System.out.println("Total Empty Cities = " + count);
		
		List <Integer>primeNumbers = Arrays.asList(91,13,17,5,7,47,19);
		
		int maxValue = getMaxValue(primeNumbers);
		System.out.println("Max Value from Prime Numbers = " + maxValue);
		
		OptionalInt max = primeNumbers.stream().mapToInt(v->v).max();
		System.out.println(max);
	
		//Count cities whose length is >7
		long cnt1 = citiesList.stream().filter(city-> city.length()>7).count();
		System.out.println("City Names whose Length is >7 : " + cnt1);
		
		
	}

	private static int getMaxValue(List<Integer> primeNumbers) {
		int max=primeNumbers.get(0);
		int pos=0;
		for(int i=0;i<primeNumbers.size();i++)
		{
			if(primeNumbers.get(i)>max)
			{
				max=primeNumbers.get(i);
				pos=i;
			}			
		}
		
		return max;
		
	}

	private static int countEmptyStrings(List<String> citiesList) {
		int cnt=0;
		for(String city : citiesList)
		{
			if(city.isEmpty())
					cnt++;
		}
		
		return cnt;		
	}
}
