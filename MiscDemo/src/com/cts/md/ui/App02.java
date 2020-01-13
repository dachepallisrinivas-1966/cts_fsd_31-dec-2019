/* Default methods in interface  - Java 8 */
package com.cts.md.ui;

interface Counter {
	void increment();
	void decrement();
	int getValue();
	
	default int getIncrement() {
		return 1;
	}
	
}

class OneCounter implements Counter {

	private int value;
	
	public OneCounter() {
		value = 0;
	}
	
	public OneCounter(int value) {
		this.value = value;
	}
	
	@Override
	public void increment() {
		value += getIncrement();
	}

	@Override
	public void decrement() {
		value -= getIncrement();
	}

	@Override
	public int getValue() {
		return value;
	}
	
}
public class App02 {

	public static void main(String[] args) {
		OneCounter c1 = new OneCounter();
		c1.increment();
		c1.increment();
		System.out.println(c1.getValue());
		c1.decrement();
		System.out.println(c1.getValue());
	}

}
