/* java.time.format.DateTimeFormatter */

package com.cts.dtd.ui;

import static java.time.format.DateTimeFormatter.ISO_DATE;
import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App05 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDateTime currentTime = LocalDateTime.now();
		
		
		System.out.println(today.format(ISO_DATE));
		System.out.println(currentTime.format(ISO_DATE_TIME));
		System.out.println(today.format(ISO_LOCAL_DATE));
		System.out.println(currentTime.format(ISO_LOCAL_DATE_TIME));

	}

}
