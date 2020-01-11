/* ArrayList with Generic  */
package com.cts.cd.ui;

import java.util.ArrayList;

public class App03 {

	public static void main(String[] args) {
		ArrayList<String> creators = new ArrayList<>();
		creators.add("Alan Cooper");
		creators.add("Dennis Ritchie");
		creators.add("Bjarne Stroutstrup");
		
		for(String creator : creators) {
			System.out.println(creator);
		}
	}

}
