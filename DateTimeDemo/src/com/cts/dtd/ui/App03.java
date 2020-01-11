/* java.text.SimpleDateFormat class */

package com.cts.dtd.ui;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App03 {

	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yy");
		System.out.println(sdf.format(d));
		
		sdf = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(sdf.format(d));
	}

}
