package com.cts.cd.service;

import java.util.Comparator;

import com.cts.cd.model.Employee;

public class EmployeeBirthDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee first, Employee other) {
		return first.getBirthDate().compareTo(other.getBirthDate());
	}

}
