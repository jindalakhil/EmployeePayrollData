package com.capg.employee;

public class EmployeePayrollData {
	private int id;
	private String name;
	private double salary;
	public EmployeePayrollData(int id, String name, Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return ("id is: "+getId()+" name is: "+getName()+" salary is: "+getSalary());
	}
}