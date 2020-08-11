package com.shrenik;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MainApp  {

	public static void main(String[] args) throws IOException {
		File f = new File("c:/demo/");
		
	
		System.out.println("File Path = " + f.getPath());
		System.out.println("Is Directory = " + f.isDirectory());
		
		if(f.isDirectory())
		{
			System.out.println("\n All Directoties");
			
			Files.list(f.toPath()).forEach(x-> System.out.println(x.getFileName()));
			
			System.out.println("\n Directoties which begins with S");
			Files.list(f.toPath()).filter(p-> p.getFileName().toString().startsWith("S"))
																		.forEach(System.out::println);
			
			System.out.println("\n Files which are empty");
			Files.list(f.toPath()).filter(p-> p.toFile().length()==0).forEach(System.out::println);;
		}
	}
}
