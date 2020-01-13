/* Nested Classes - Types 
 * 1. Static member class
 * 2. Non-Static member class
 * 3. Method-local inner class
 * 4. Anonymous inner class
 */

/* Static member class */

package com.cts.md.ui;

public class App04 {

	static public class Test4 {
		public void print() {
			System.out.println("static member class");
		}
	}
	
	public void print() {
		System.out.println("outer class");
	}
	public static void main(String[] args) {
		App04.Test4 obj = new App04.Test4();
		obj.print();
		
		App04 obj2 = new App04();
		obj2.print();
	}

}
