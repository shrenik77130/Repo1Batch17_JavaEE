/* Create three interfaces to demonstrate how to pass parameters to interface methods using lambda expressions */



package com.shrenik.example;

public class MainApp {

	public static void main(String[] args) {
		SingleParameterInterface sp = (int number) -> {
				System.out.println("Number is " + number);
		};
		
		System.out.println("Single Parameter Interface Method implementation using Lambda Expression");
		sp.showNumber(100);
		
		
		TwoParameterInterface tp = (String unm, String pwd) -> {
			System.out.println("Username = " + unm);
			System.out.println("Password = " + pwd);
		};
		
		System.out.println("Two Parameter Interface Method implementation using Lambda Expression");
		tp.showUser("admin", "123456");
		
		
		CustomArgumentInterface ca = (User user) -> {
			System.out.println("User Object Details = " + user);
		};
		
		ca.showUser(new User("Smith","Kapoor","Male",31));
	}

}
