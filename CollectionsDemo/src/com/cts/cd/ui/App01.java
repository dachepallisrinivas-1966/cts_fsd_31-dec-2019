/* Collections - ArrayList (raw) */
package com.cts.cd.ui;

import java.util.ArrayList;

public class App01 {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		names.add("M.S.Rama Rao");
		names.add(1921);
		names.add("Ghanta Sala");
		names.add(1922);
		names.add("A.M.Raja");
		names.add(1929);
		names.add("P.B.Srinivas");
		names.add(1930);
		names.add("Pitapuram Nageswara Rao");
		names.add(1930);
		names.add("Bala Subrahmanyam");
		names.add(1946);
		names.add("Yesu das");
		names.add(1940);
		for(Object name : names) {
			System.out.println(name);
		}
		System.out.println("-----------------------------");
		
		names.add(1, "Nagayya");
		for(Object name : names) {
			System.out.println(name);
		}
		System.out.println("-----------------------------");
		
		names.remove("Pitapuram Nageswara Rao");
		for(Object name : names) {
			System.out.println(name);
		}
		System.out.println("-----------------------------");
		System.out.println(names.indexOf("Ghanta Sala"));
	}

}
