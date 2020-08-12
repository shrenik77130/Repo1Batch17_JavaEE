package com.shrenik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.shrenik.example.Car;

public class MainApp {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		
	
		List <Car>carList = Arrays.asList(
				new Car(101,"BMW","red",30.00f),
				new Car(102,"Auddii","White",24.00f),
				new Car(103,"Ferrai","black",25.00f)
				
				// total 500 records from database
				);
		
		//1. connect file
		File conn = new File("c:/demo/car_records.bin");
		
		if(!conn.exists())
			conn.createNewFile();
		
		
		//2. write Objects to file
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(conn));
		
		stream.writeObject(carList);
		
		
//		//write data to file using java8
		
//		carList.forEach(x->{
//			try {
//				writeFile(x);
//			}
//			catch(IOException ex)
//			{
//				System.out.println("Exception Occurred = "  + ex);
//			}
//		});
		
		//read objects from file using java8
		List <Car>myFileCars = (List<Car>)new ObjectInputStream(new FileInputStream("c:/demo/car_records.bin")).readObject();
		System.out.println("After Read Operation , Car = ");
		myFileCars.forEach(System.out::println);
		
		// print Cars only having fuel cap >25
		System.out.println("\n Cars having fuel Capacity >=25");
		myFileCars.parallelStream().filter(p->p.getFuelcap()>=25).forEach(System.out::println);
	}
	
	
	static void writeFile(Car car)throws IOException
	{
		new ObjectOutputStream(new FileOutputStream("c:/demo/car_records.bin")).writeObject(car);
	}
}
