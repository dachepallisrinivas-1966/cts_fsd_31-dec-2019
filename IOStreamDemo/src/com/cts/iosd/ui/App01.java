/* Reading Text File */

package com.cts.iosd.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			FileReader fr = new FileReader(fileName);
			int ch;
			while(true) {
				ch = fr.read();
				if (ch == -1)			// EOF
					break;
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch(IOException excep) {
			System.out.println("Could not read file.");
		} 

	}

}
