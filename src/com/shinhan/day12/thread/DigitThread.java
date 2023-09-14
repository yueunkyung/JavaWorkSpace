package com.shinhan.day12.thread;

public class DigitThread extends Thread {
	DigitThread(String name){
		super(name);
		
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() +"==>"+i );
		}
	}

}

class Parent {

}

class DigitRunnableImpl extends Parent implements Runnable {
	String name;

	DigitRunnableImpl(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name +"==>"+i + ":" + Thread.currentThread().getName());
		}
	}

}
