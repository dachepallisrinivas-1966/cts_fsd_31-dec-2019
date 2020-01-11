package com.cts.dtd.ui;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App08 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
     	 System.out.print("Enter first date [dd-mm-yyyy] :");
	     String fds = s.nextLine();

	     LocalDate fd = LocalDate.parse(fds, 
	    		         DateTimeFormatter.ofPattern("d-M-y"));

	     System.out.print("Enter second date [dd-mm-yyyy]:");
	     String sds = s.nextLine();

	     LocalDate sd = LocalDate.parse(sds, 
		         DateTimeFormatter.ofPattern("d-M-y"));

	     System.out.println( ChronoUnit.DAYS.between(fd, sd) + " Days (or) " 
	    		 	+ ChronoUnit.MONTHS.between(fd, sd) + " Months (or) "
	    		 	+ ChronoUnit.YEARS.between(fd, sd) + " Years");
	     s.close();
	}

}
