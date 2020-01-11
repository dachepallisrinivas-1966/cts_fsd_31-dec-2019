package com.cts.cd.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cts.cd.model.Employee;
import com.cts.cd.service.EmployeeBirthDateComparator;
import com.cts.cd.service.EmployeeNameComparator;
//import com.cts.cd.service.EmployeeBirthDateComparator;
//import com.cts.cd.service.EmployeeNameComparator;

public class EmployeeClient {

	public static void main(String[] args) {
		// Set<Employee> employees = new TreeSet<>();
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(5, "srinivas", LocalDate.of(1966, 4, 1), 40000));
		employees.add(new Employee(2, "mythri", LocalDate.of(1996, 5, 2), 41000));
		employees.add(new Employee(1, "abhishek", LocalDate.of(1996, 7, 3), 34000));
		employees.add(new Employee(4, "ramya", LocalDate.of(1997, 6, 4), 42000));
		employees.add(new Employee(6, "harika", LocalDate.of(1995, 6, 5), 35000));
		employees.add(new Employee(6, "harika", LocalDate.of(1995, 6, 5), 35000));
		
		Collections.sort(employees);
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("---------------------------------------");
		
		Collections.sort(employees, new EmployeeNameComparator());
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("---------------------------------------");
		
		
		Collections.sort(employees, new EmployeeBirthDateComparator());
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("---------------------------------------");

		
		
	}

}
