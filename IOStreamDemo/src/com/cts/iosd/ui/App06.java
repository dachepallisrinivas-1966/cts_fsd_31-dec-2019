package com.cts.iosd.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App06 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("names2.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("name-per-line.txt");

			while (true) {
				String line = br.readLine();
				if (line == null)		// EOF
					break;
				String[] names = line.split(",");
				for (String name : names) {
					fw.write(name + "\n");
				}
			}

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
		/*
		 * without finally block execute the program and observe the name-per-line.txt
		 * file
		 */
		finally {
			try {
				fr.close();
				br.close();
				fw.close();
			} catch(IOException excep) {
				excep.printStackTrace();
			}
			
		}

	}

}
