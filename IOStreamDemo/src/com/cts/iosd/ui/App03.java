/* Exercise : number of characters, words and lines in a text file  */
package com.cts.iosd.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App03 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			FileReader fr = new FileReader(fileName);
			int charCount = 0, wordCount = 0, lineCount = 0, ch;
			while (true) {
				charCount++;
				ch = fr.read();
				if (ch == -1)
					break;
				if (ch == 32)
					wordCount++;
				if (ch == '\n') {
					wordCount++;
					lineCount++;
				}
				System.out.print((char) ch);
			}
			System.out.printf("Total Number of Characters = %d\t\tWords : %d\tLines = %d\n", charCount, wordCount,
					lineCount);
			
		} catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch (IOException excep) {
			System.out.println("Could not read file.");
		}

	}

}
