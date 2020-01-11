package com.cts.cd.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private LocalDate birthDate;
	private double salary;
	
	public Employee() {
		/* default constructor */
	}
	
	public Employee(int id, String name, LocalDate birthDate, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee other) {
		
		Integer firstId = this.getId();
		Integer otherId = other.getId();
		return firstId.compareTo(otherId);
		
//		String firstName = this.getName();
//		String otherName = other.getName();
//		return firstName.compareTo(otherName);
		
//		LocalDate firstDate = this.getBirthDate();
//		LocalDate otherDate = other.getBirthDate();
//		return firstDate.compareTo(otherDate);
		
//		Double firstSalary = this.getSalary();
//		Double otherSalary = other.getSalary();
//		return firstSalary.compareTo(otherSalary);
	
	}
	
}
