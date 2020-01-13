/* Comparator Interface */
package com.cts.ld.ui;

import java.util.Arrays;
import java.util.Comparator;

class AbsoluteCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		return Math.abs(n1) - Math.abs(n2);			// unboxing is done automatically
	}
	
}

public class App03 {
	
	public static void main(String[] args) {
		Integer a[] = {-10,20,5,6,-30,60};
		Arrays.sort(a);
		for(int n : a) {
			System.out.println(n);
		}
		System.out.println("-------------------------------------");
		
		// sorting based on absolute values ...
		Arrays.sort(a, new AbsoluteCompare());
		for(int n : a) {
			System.out.println(n);
		}
		System.out.println("-------------------------------------");
		
		// using lambda
		Arrays.sort(a, (n1,n2) -> Math.abs(n1) - Math.abs(n2) );
		
		for(int n : a) {
			System.out.println(n);
		}
	}
}

