/* method-local inner class (local class) 
 * 
 * a class defined inside a methid is called as "local class".
 * only the method in which the class is defined, can create an instance of this class.
 * 
 */

package com.cts.md.ui;

public class App06 {

	private int v = 10;

	public void someMethod() {
		
		class LocalClass {
			public void print() {
				System.out.printf("Local class. Outer class value %d\n", v);
			}
		}
		
		LocalClass obj = new LocalClass();
		obj.print();
	}
	
	public static void main(String[] args) {
		App06  obj = new App06();
		obj.someMethod();
	}

}
