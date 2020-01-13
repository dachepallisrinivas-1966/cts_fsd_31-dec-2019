/* Exercise - Sort names based on their length */

package com.cts.ld.ui;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}

public class App04 {

	public static void main(String[] args) {
		String[] names = { "Bill", "Joe", "Steve", "John" };
		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");

		// Traditional way ...
		Arrays.sort(names, new LengthCompare());
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");

		// Lambda
		Arrays.sort(names, (String s1, String s2) -> s1.length() - s2.length());
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");

		// further simplification (need not specify parameter data types) ...
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");
	}

}
