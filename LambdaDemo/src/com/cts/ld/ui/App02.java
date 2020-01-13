/* Java 8 - Lambda Expression, Lambda Block and Method Reference */

package com.cts.ld.ui;

public class App02 {

	private static void printNumbers() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// Lambda Expression
		
		Thread t3 = new Thread( ()-> System.out.println("Lambda expression"));
		t3.start();
		System.out.println("-------------------------------------------");
		
		// Lambda Block
		Thread t4 = new Thread(()-> {
			for(int i=1; i<=10; i++) {
				System.out.println(i);
			}
		});
		t4.start();
		System.out.println("-------------------------------------------");
		
		// Lambda Expression that call a Function
		Thread t5 = new Thread(()->printNumbers());
		t5.start();
		System.out.println("-------------------------------------------");
		
		// Better way - Method reference
		Thread t6 = new Thread(App02::printNumbers);
		t6.start();
		System.out.println("-------------------------------------------");

	}

}
