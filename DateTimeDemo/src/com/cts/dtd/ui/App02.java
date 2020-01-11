/* java.util.Calendar Class*/

package com.cts.dtd.ui;

import java.util.Calendar;

public class App02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();		/* get system date and time */
		System.out.printf("Year : %d Month : %d Day : %d", 
				cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
	}

}
