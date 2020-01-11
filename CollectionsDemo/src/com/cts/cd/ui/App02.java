/* Need of Generics  */
package com.cts.cd.ui;

import java.time.LocalDate;
import java.util.ArrayList;

public class App02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Abc");
		al.add(10);
		al.add(LocalDate.now());
		
		//String s = al.get(0);		-- not valid
		String s = (String) al.get(0);
		System.out.println(s);
		String s1 = (String) al.get(1);			// no compile-time error, but raise ClassCastException
		// The code is frazile. 

	}

}
