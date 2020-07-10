package com.shrenik.example;

import java.util.List;
import java.util.Map;

public interface EmployeeList {
	public List<Employee> findEmployeeWithMinSalary(Map <Integer,Employee>empRecords, double minSalary);
}
