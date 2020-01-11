package com.cts.cd.model;

/*
	hashCode() and equals():

	The contract between equals() and hashCode() is: 
	1) If two objects are equal, then they must have the same hash code. 
	2) If two objects have the same hash code, they may or may not be equal. 
*/


public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		/* default constructor */
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Name : ");
		output.append(name);
		output.append("\tAge : ");
		output.append(age);
		return output.toString();
	}

	@Override
	public int compareTo(Person other) {
		if (this.name.equals(other.name))
			return this.age - other.age;
		else
			return this.name.compareTo(other.name);
	}
}

