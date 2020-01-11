package com.cts.cd.ui;

class GenericClass<T> {
	T obj;
	public void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class GenericClient {
	public static void main(String [] args) {
		GenericClass<Integer> m = new GenericClass<Integer>();
		m.add(2);
		System.out.println(m.get());
		
		GenericClass<Integer> m1 = new GenericClass<>();		// type inference
		m.add(2);
		System.out.println(m.get());
		
		GenericClass<String> ms = new GenericClass<>();			// type inference
		ms.add("Srinivas");
		System.out.println(ms.get());
		
	}
}


