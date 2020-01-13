package com.cts.iosd.model;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	
	private transient String email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Name = ");
		output.append(name);
		if (email != null) {
			output.append("Email = ");
			output.append(email);
		}
		return output.toString();
	}
}
