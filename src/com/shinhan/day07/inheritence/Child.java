package com.shinhan.day07.inheritence;

public class Child extends Parent {
	String subject = "자바";
	String a = "신한";

	Child() {
		// super(); .... 생략가능
		super(100);
		System.out.println("자식의 default생성자");
	}

	void show() {
		//Math.PI = 123;
		//Parent.PI = 123;
		System.out.println("자식이 추가한 메서드");
	}
/*
	public void method1() {
		System.out.println("******자식이 메서드 method1 Override");

	}
*/
}
