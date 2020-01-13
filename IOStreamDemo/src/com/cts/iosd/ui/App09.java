package com.cts.iosd.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App09 {

	public static void main(String[] args) {

		try (FileInputStream fos = new FileInputStream("persons.dat");
				ObjectInputStream oos = new ObjectInputStream(fos);) {
			System.out.println(oos.readObject());
			
		} catch (ClassNotFoundException | IOException exception) {
			exception.printStackTrace();
		}

	}

}
