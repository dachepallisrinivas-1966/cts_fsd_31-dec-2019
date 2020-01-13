package com.cts.sd.ui;

import java.util.Arrays;

public class App01 {

	public static void main(String[] args) {
		int [] nums = {33,44,55,66,34,56,7,8,91};
		double avg = Arrays.stream(nums)
					.average()					// return OptionalDouble
					.getAsDouble();				// if you are sure that average() return value
		System.out.println(avg);
		
		// average of all even values
		double evenAverage = Arrays.stream(nums)
							.filter(n -> n%2 == 0)		// filter takes IntPredicate interface. we are overriding "boolean test(int n)" method
							.average()
							.getAsDouble();				// check IntPredicate documentation
		System.out.println(evenAverage);
		
		// filter()			intermediate operation
		// average()		terminal operation
	}

}
