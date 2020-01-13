package com.cts.sd.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App03 {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("marks.txt");
		Files.lines(p)
			.forEach(System.out::println);
		// lines() takes the path, read one line at a time. It returns a Stream<String> object
		System.out.println("------------------------------------------");
		double avg = Files.lines(p)
						// .mapToInt(s -> Integer.parseInt(s))
						.mapToInt(Integer::parseInt)
						.average()
						.getAsDouble();
		System.out.println(avg);
		// to convert each value to int, is called mapping
		System.out.println("------------------------------------------");
		
		Files.lines(p)
			.mapToInt(Integer::parseInt)
			.filter(n -> n > avg)
			.sorted()
			.forEach(System.out::println);
		// (to print all marks more than avg in sorted order)
	}

}
