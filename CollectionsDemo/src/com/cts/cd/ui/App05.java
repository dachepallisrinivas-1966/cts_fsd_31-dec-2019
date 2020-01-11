/* TreeSet - display names given by user in sorted order */
package com.cts.cd.ui;

import java.util.Scanner;
import java.util.TreeSet;

public class App05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter names (end to stop) ...");
		String name = null;
		TreeSet<String> set = new TreeSet<>();
		while (true) {
			name = scan.nextLine();
			if (name.equals("end"))
				break;
			set.add(name);
		}
		System.out.println("Names in sorted order ...");
		for(String nam : set) {
			System.out.println(nam);
		}
		scan.close();
	}

}
