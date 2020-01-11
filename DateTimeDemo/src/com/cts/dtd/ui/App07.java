/* java.time.LocalTime - Java 8 only */
package com.cts.dtd.ui;

import java.time.LocalTime;
import java.time.ZoneId;

public class App07 {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalTime singaporeTime = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(singaporeTime);
	}

}
