package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainApp {

	public static void main(String[] args) {
		List <Integer> listOfNumbers = Arrays.asList(3,5,2,0,4,1);
		
		listOfNumbers.forEach(lambdaWrapper(x->System.out.println(39/x)));
	}
	
	static Consumer<Integer> lambdaWrapper(Consumer <Integer>consumer)
	{
		return ref->{
			try
			{
				consumer.accept(ref);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Arithmetic Exception Handled in Custom Exception Handler = " + ex);
			}
		};
	}
}
