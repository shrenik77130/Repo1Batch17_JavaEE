package com.shrenik.example;

public class Document implements Runnable{
	
	Thread t;
	Printer target;
	
	public Document(String threadname,Printer target)
	{
		this.target = target;
		t = new Thread(this,threadname);
		t.start();
	}
	
	@Override
	public void run() {
			try
			{
				this.target.printDocument(t.currentThread().getName());
			}
			catch(Exception ex)
			{
				System.out.println("Exception occured during thread Execution " + ex);
			}
	}
}
