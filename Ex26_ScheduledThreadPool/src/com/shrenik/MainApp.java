package com.shrenik;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		
		// for scheduling task
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		// task to run after 10 seconds Deay
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
		
		//task to run repeatadly 10 seconds after previous task completes
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);


	}
}
