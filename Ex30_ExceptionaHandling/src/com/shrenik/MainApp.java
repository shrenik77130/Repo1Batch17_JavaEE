package com.shrenik;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import com.shrenik.example.ThrowingConsumer;

public class MainApp {

	public static void main(String[] args) {
		
		List <Integer> listOfNumbers = Arrays.asList(3,5,2,0,4,1);
		
		
		listOfNumbers.forEach(consumerWrapper(x->writeDataToFile(x),IOException.class));
		
	}
	
	static Object writeDataToFile(Integer x)
	{
		//some code to write x to text file
		//System.out.println(x + " write successfull in text file");
		return null;
	}
	
	
	static <T,E extends Exception> Consumer<T> consumerWrapper(ThrowingConsumer<T,E> throwingConsumer,Class<E> exceptionClass)
	{
		return ref->{
			try
			{
				throwingConsumer.accept(ref);
			}
			catch(Exception e)
			{
				try
				{
					E exCast = exceptionClass.cast(e);
					System.err.println("Exception occured = " + exCast.getMessage());
				}
				catch(ClassCastException ccex)
				{
					throw new RuntimeException(ccex);
				}
			}
		};
	}
	
}
