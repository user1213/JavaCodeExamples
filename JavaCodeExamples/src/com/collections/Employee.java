package com.collections;

public class Employee {
	private String name;
	private String company;
	private double salary;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String toString(){
		return "Name: " + this.name + "\nCompany: " + this.company + "\nSalary: " + this.salary + "\n";
	}
}
