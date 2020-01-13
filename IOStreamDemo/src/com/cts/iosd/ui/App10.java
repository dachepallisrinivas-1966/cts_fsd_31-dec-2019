package com.cts.iosd.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class App10 {

	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter A Folder Path: ");
			String path = buf.readLine();

			File f = new File(path);

			if (!f.exists() || f.isFile()) {
				System.out.println("It is not a folder");
				System.exit(0);
			}

			File[] filesList = f.listFiles();

			if (filesList == null || filesList.length == 0) {
				System.out.println("Folder Found Empty");
				System.exit(0);
			}

			System.out.println("Name\t\t\tSize" + "\n===================================" + "================");

			for (File x : filesList)
				System.out.print("\n" + x.getName() + "\t\t\t" + x.length() + " Bytes");

		} catch (IOException excep) {
			excep.printStackTrace();
		}
	}

}
