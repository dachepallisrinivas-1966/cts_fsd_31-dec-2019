package com.cts.cd.ui;

import java.util.Set;
import java.util.TreeSet;

import com.cts.cd.model.Person;

public class App06 {
	public static void main(String [] args) {
		Set<Person> persons = new TreeSet<>();
		persons.add(new Person("srinivas", 53));
		persons.add(new Person("asish", 23));
		persons.add(new Person("meghana", 23));
		persons.add(new Person("meghana", 23));
		persons.add(new Person("vinutha", 22));
		persons.add(new Person("sri lekha", 21));
		persons.add(new Person("divya", 25));
		persons.add(new Person("divya", 21));
		
		for(Person person : persons) {
			System.out.println(person);
		}
		System.out.println("---------------------");
	}
}
