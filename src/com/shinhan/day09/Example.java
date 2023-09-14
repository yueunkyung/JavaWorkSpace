package com.shinhan.day09;

public class Example {
	public static void action(A a) {
		a.method1();
		if (a instanceof CC c) {
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new BB());
		action(new CC());
	}
}