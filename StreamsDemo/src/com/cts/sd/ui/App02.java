package com.cts.sd.ui;

import java.util.Arrays;

public class App02 {

	public static void main(String[] args) {
		int [] nums = {33,44,55,66,34,56,7,8,91};
		Arrays.stream(nums)
			.filter(n -> n%2 == 1)
			.sorted()
			//.forEach(n -> System.out.println(n));
			.forEach(System.out::println);
		// forEach takes IntConsumer interface documentation. we are overriding "void accept(int n)"
	}

}
