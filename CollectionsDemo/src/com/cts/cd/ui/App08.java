package com.cts.cd.ui;

import java.util.Iterator;
import java.util.Vector;

public class App08 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("srinivas");
		v.add("meghana");
		v.add("suman");
		
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		for(String data : v) {
			System.out.println(data);
		}
		
	}

}
