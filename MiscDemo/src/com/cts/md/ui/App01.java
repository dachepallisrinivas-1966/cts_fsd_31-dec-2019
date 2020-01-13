/* Functional interface - java 8*/
package com.cts.md.ui;

import java.util.Random;

@FunctionalInterface
interface Stack {
	public void push(int value);
}

class StackImpl implements Stack {
	private int [] a;
	private int top;
	
	public StackImpl() {
		a = new int[10];
		top = -1;
	}
	
	@Override
	public void push(int value) {
		a[++top] = value;
	}
	
	public void print() {
		for(int v : a) {
			System.out.println(v);
		}
	}
	
}
public class App01 {

	public static void main(String[] args) {
		
		StackImpl obj = new StackImpl();
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			obj.push(random.nextInt(1000));
		}
		obj.print();
	}

}
