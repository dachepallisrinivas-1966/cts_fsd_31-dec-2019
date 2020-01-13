package com.cts.iosd.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cts.iosd.model.Person;

public class App08 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("persons.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Person p = new Person("srinivas", "dachepallisrinivas@gmail.com");
			oos.writeObject(p);
		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
