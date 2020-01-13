/* Exercise : Display only non-blank lines.  */
package com.cts.iosd.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class App04 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			FileReader fr = new FileReader(fileName);
			LineNumberReader br = new LineNumberReader(fr);
			String line;
			while(true) {
				line = br.readLine();
				if (line == null)
					break;
				if (line.trim().length() > 0)
					System.out.println(br.getLineNumber() + ":" + line);
				else
					br.setLineNumber(br.getLineNumber() - 1);
			}
		} catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch(IOException excep) {
			System.out.println("Could not read file.");
		} 

	}

}
