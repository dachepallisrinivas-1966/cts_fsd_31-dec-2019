/* java.time.LocalDate - Java 8 only */
package com.cts.dtd.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App06 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(1966, Month.APRIL, 9);
		System.out.println(date2);
		
		LocalDate date3 = date2.plusYears(60);
		System.out.println(date3);
		
		LocalDate dob = LocalDate.parse("09-04-1966", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(dob);
		
	}

}
