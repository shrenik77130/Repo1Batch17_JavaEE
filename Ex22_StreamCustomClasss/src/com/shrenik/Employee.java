package com.shrenik;

public class Employee {
	
	private int empcode;
	private String empname;
	private double salary;
	
	
	public Employee() {}
	
	public Employee(int empcode, String empname, double salary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
	}

	
	
	
	public int getEmpcode() {
		return empcode;
	}

	public String getEmpname() {
		return empname;
	}

	public double getSalary() {
		return salary;
	}
	
	
	

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
}
