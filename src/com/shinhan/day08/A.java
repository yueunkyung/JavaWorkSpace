package com.shinhan.day08;
public class A {
	private void f1() {
		System.out.println("f1");
	}

	void f2() {
		System.out.println("f2");

	}

	protected void f3() {
		System.out.println("f3");

	}

	public void f4() {
		System.out.println("f4");

	}
}

class B extends A {
	void work() {
		// f1();
		f2();
		f3();
		f4();
	}
}