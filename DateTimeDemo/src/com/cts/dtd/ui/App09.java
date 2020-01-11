package com.cts.dtd.ui;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class App09 {

	public static void calculateTime(long seconds) {
        int day = (int)TimeUnit.SECONDS.toDays(seconds);        
        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

        System.out.println("Day " + day + " Hour " + hours + " Minute " + minute + " Seconds " + second);

    }
	
	public static void main(String[] args) {
		LocalDate logInDate = LocalDate.of(2019, 12, 19);
		LocalTime logInTime = LocalTime.of(11, 7, 10);
		LocalDateTime logIn = LocalDateTime.of(logInDate, logInTime);
		
		LocalDate logOutDate = LocalDate.of(2019, 12, 20);
		LocalTime logOutTime = LocalTime.of(11, 8, 12);
		LocalDateTime logOut = LocalDateTime.of(logOutDate, logOutTime);
		
		Duration duration = Duration.between(logIn, logOut);
		long seconds = duration.getSeconds();
		calculateTime(seconds);
	}

}
