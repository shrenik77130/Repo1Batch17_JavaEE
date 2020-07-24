package com.shrenik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {

	public static void main(String[] args) {
		
		Stream.Builder<Employee> empStream = Stream.builder();
		
		empStream.accept(new Employee(101,"Smith",9000.00));
		empStream.accept(new Employee(102,"Peter",13000.00));
		empStream.accept(new Employee(103,"Mathew",4100.00));
		empStream.accept(new Employee(104,"Corner",13000.00));
		
		//Q1. print Employee Records 
	
		System.out.println(empStream);
		
		empStream.build().forEach(System.out::println);
		
		
		// Array Of Employees
		
		Employee []empArray = {
				new Employee(101,"Smith",9000.00),
				new Employee(102,"Peter",13000.00),
				new Employee(103,"Mathew",4100.00),
				new Employee(104,"Corner",13000.00)
		};
		
		//Q2. Convert Employee Array to Stream
		Stream.of(empArray);
		
		
		//Q3. Convert Stream to List
		List <Employee> newEmpList = Arrays.asList(empArray);
		newEmpList.stream();
		
		
		//Q4. Increment Salary of each employee by 1000 Rs.
		
		newEmpList.stream().forEach(e->e.setSalary(e.getSalary()+1000));
		
		System.out.println("\n After Increment Salary");
		newEmpList.forEach(System.out::println);
		
		
		//Q5. Extract Emp Ids and create its Integer Array
		
		List <Integer>empCodesList = newEmpList.stream().map(t->t.getEmpcode()).collect(Collectors.toList());
		
		//Stream.of(empCodesList).map(EmployeeRepository::findById).collect();
		
		
		
		
	}

}
