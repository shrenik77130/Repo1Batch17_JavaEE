package com.shrenik;

import com.shrenik.example.Message;
import com.shrenik.example.User;

public class MainApp {

	public static void main(String[] args) {
//		
//		User.testMessage();
//		
//		User u1 = new User();
//		u1.testMessage();
//		
		Message m1 = User::testMessage;
		m1.saySomething();
		
	}
}
