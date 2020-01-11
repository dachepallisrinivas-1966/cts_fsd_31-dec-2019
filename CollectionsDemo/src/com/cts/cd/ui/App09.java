/* Exercise - Character Frequency in a String (Map) */
package com.cts.cd.ui;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class App09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String name = scan.nextLine();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(ch);
			if (lhm.containsKey(ch))
				lhm.put(ch, lhm.get(ch)+1);
			else
				lhm.put(ch, 1);
		}
		for(Character key : lhm.keySet()) {
			System.out.printf("%c - %d\n", key, lhm.get(key));
		}
		scan.close();
	}

}
