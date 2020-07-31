package com.shrenik;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
	String threadname = "";
	
	public Task() {}
	
	public Task(String threadname)
	{
		this.threadname = threadname;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Started Execution. Thread Name =  " + this.threadname );
	}
	
}


public class MainApp {

	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of Cores = " + coreCount);
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for(int i=0;i<100;i++)
		{
			service.execute(new Task("T-" + i));
		}
	}

}
