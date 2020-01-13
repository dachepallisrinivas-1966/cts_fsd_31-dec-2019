package com.cts.iosd.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App05 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = scan.nextLine();
			System.out.println("Enter string to search : ");
			String searchString = scan.nextLine();
			
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String ch;
			while(true) {
				ch = br.readLine();
				if (ch == null)
					break;
				if (ch.contains(searchString))
					System.out.println(ch);
			}
		} catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} catch(IOException excep) {
			System.out.println("Could not read file.");
		} 


	}

}
