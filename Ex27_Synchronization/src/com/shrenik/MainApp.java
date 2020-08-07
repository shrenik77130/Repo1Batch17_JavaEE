package com.shrenik;

import com.shrenik.example.Document;
import com.shrenik.example.Printer;

public class MainApp {

	public static void main(String[] args) {
		
		Printer hp = new Printer("Hp");
		
		Printer cannon = new Printer("Cannon");
		
		
		Document d1 = new Document("Biodata",hp);
		Document d2 = new Document("Time Table",hp);
		Document d3 = new Document("Notice",cannon);
		Document d4 = new Document("Quotation", hp);
		Document d5 = new Document("Invoice",cannon);
		
	}

}
