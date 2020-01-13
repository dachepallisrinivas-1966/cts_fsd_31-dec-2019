/* Static methods in interface - Java 8*/
package com.cts.md.ui;

interface Counter2 {
	void increment();
	void decrement();
	int getValue();
	
	default int getIncrement() {
		return 1;
	}
	
	static void print() {
		System.out.println("static method is invoked");
	}
	
}

class OneCounter2 implements Counter {

	private int value;
	
	public OneCounter2() {
		value = 0;
	}
	
	public OneCounter2(int value) {
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
public class App03 {

	public static void main(String[] args) {
		OneCounter2 c1 = new OneCounter2();
		c1.increment();
		c1.increment();
		System.out.println(c1.getValue());
		c1.decrement();
		System.out.println(c1.getValue());
		Counter2.print();
	}

}
