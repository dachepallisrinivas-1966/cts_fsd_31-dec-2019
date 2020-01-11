/* ArrayList -  accept names from the user till "end" is entered. add all these names in the array list. */
package com.cts.cd.ui;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App04 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		List<String> names = new LinkedList<>();
		String name = null;
		while (true) {
			System.out.print("Enter name : ");
			name = scan.nextLine();
			if (name.equals("end")) {
				break;
			}
			names.add(name);
		}
		
		for(String data : names) {
			System.out.println(data);
		}
		

	}

}
