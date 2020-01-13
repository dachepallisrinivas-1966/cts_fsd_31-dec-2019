package com.cts.iosd.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App07 {

	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("names.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("name-per-line.txt")) {
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String[] names = line.split(",");
				for (String name : names) {
					fw.write(name + "\n");
				}
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
