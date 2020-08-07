package com.shrenik.example;

public class Printer {
	
	public String printername;
	public Printer(String printername)
	{
		this.printername = printername;
	}
	
	public synchronized void printDocument(String docname)
	{
		System.out.print("\n" + printername + " => Document " + docname + " Started Printing [");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) { 	e.printStackTrace();	}
		
		System.out.print("\t Document " + docname + "Print Completed ]");
	}
}
