/* Collections class */
package com.cts.cd.ui;

import java.util.ArrayList;
import java.util.Collections;

public class App11 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("James Gosling");
		names.add("Jason Hunter");
		names.add("Alan Cooper");
		names.add("Anders Hejlsberg");
		names.add("Grace Murray Hopper");
		
		Collections.sort(names);
		printList(names);
		System.out.println("----------------------------------------");
		
		int pos = Collections.binarySearch(names, "Alan Cooper");
		System.out.printf("Alan Cooper found at : %d\n", pos);
		System.out.printf("Maximum is : %s\n", Collections.max(names));
		System.out.println("----------------------------------------");
		
		Collections.reverse(names);
		printList(names);
		System.out.println("----------------------------------------");
		
		

	}

	private static void printList(ArrayList<String> names) {
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
