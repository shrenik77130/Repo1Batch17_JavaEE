package com.shrenik;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.shrenik.example.Counter;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
	
		ExecutorService exectorService = null;
		
		try
		{
				exectorService = Executors.newFixedThreadPool(3);
				
				final Counter counter = new Counter();
				
				Runnable task1 = ()->{
					System.out.println(Thread.currentThread().getName() + " Writing on Count Variable");
					for(int i=1;i<=50000;i++)
					{
						counter.increment();
					}
				};
				
				Runnable task2 = ()->{
					System.out.println(Thread.currentThread().getName() + " getting value of count variable");
					int finalCount = counter.getCount();
					System.out.println("Final Count = " + finalCount);
				};
				
				Runnable task3 = ()->{
					System.out.println(Thread.currentThread().getName() + " getting value of count variable");
					int finalCount = counter.getCount();
					System.out.println("Final Count = " + finalCount);
				};
					
				exectorService.submit(task1);
				exectorService.awaitTermination(3,TimeUnit.SECONDS);
				exectorService.submit(task2);
				exectorService.submit(task3);
				
		}
		finally
		{
			if(exectorService != null)
				exectorService.shutdown();
		}
		

	}
}
