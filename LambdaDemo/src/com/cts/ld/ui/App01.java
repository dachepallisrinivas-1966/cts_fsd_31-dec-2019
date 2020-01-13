/* Without Lambda */

package com.cts.ld.ui;

class MyCode implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

public class App01 {

	public static void main(String[] args) {
		// Traditional way ...
		MyCode obj = new MyCode();
		Thread t = new Thread(obj);
		t.start();

		// JDK 1.7 way (using anonymous inner class)
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Another Child Thread");
			}
		});
		
		t2.start();
		
	
	}

}
