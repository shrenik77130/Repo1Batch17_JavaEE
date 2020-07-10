package com.shrenik;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.shrenik.example.Employee;
import com.shrenik.example.EmployeeSearchInterface;

public class MainApp {

	public static void main(String[] args) {
		
		Map <Integer,Employee>empRecords = new LinkedHashMap();
		
		empRecords.put(1991,new Employee("Raj",9000.00));
		empRecords.put(1992,new Employee("Aditya",13000.00));
		empRecords.put(1993,new Employee("Pruthvi",17000.00));
		
		System.out.println("Using keySet() method,");
		Set allkeys = empRecords.keySet();
		for(Object key:allkeys)
		{
			System.out.println(key + " ===> " + empRecords.get(key));
		}
		
		System.out.println("Using EntrySet(),");
		Set <Entry<Integer,Employee>>empSet = empRecords.entrySet();
		
		for(Entry <Integer,Employee>rec:empSet)
		{
			System.out.println(rec.getKey() + " => " + rec.getValue());
		}
		
		
		EmployeeSearchInterface es = (Map <Integer,Employee> erecords,String user_empname) -> {
			
			Set <Entry<Integer,Employee>>entries = erecords.entrySet();
			
			for(Entry <Integer,Employee>rec:entries)
			{
				if(user_empname.equalsIgnoreCase(rec.getValue().getName()))
					return rec.getValue();
			}
			
			return null;
		};
		
		Employee foundEmp = es.searchByName(empRecords, "Shrenik");
		
		if(foundEmp == null)
		{
			System.out.println("Employee not Exist");
		}
		else
		{
			System.out.println("Record found." + foundEmp);
		}
		
		// Here Implement EmployeeList Interface using Lambda Expression to pring Employees List matching Min Salary of Rs.14000
	}

}
