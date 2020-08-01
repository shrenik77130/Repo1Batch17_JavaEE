package com.shrenik;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable
{

	private String threadname;
	
	public Task()
	{
		
	}
	
	public Task(String threadname)
	{
		this.threadname = threadname;
	}
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Validatation done through " + this.threadname);
	}
	
}


public class MainApp {

	public static void main(String[] args) {
			ExecutorService service = Executors.newCachedThreadPool();
		
			
			
			for(int i=0;i<100;i++)
			{
				service.execute(new Task("t-" + i));
			}
	}

}
