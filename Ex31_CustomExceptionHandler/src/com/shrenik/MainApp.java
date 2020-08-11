package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.shrenik.example.CustomExceptionHandler;

public class MainApp {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		List <Object>testValues = Arrays.asList("one",false,90.2f,18,3,0);
		
		
		testValues.forEach(x->{
			try
			{
				int index;
				System.out.print("\n Enter Index number :");
				index = scan.nextInt();
				
				System.out.println("\n Value at Index " + index + " = "  + testValues.get(index));
				
				int number = (int)x;
				System.out.print("\n number = " + number);
				
			}
			catch(Exception ex)
			{
				CustomExceptionHandler customError =  new CustomExceptionHandler().handleException(ex);
				
				//io operator to create log of exception
				System.out.println(customError);
			}
		});
		
		
		

	}
}
