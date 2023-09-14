package com.shinhan.day08.inheritence;

public class Child extends Parent {
	public String name;

	public Child() {
		this("홍길동"); //super() 수행안함
		System.out.println("4...Child() call");
	}

	public Child(String name) {
		// super() 수행한다.
		this.name = name;
		System.out.println("3...Child(String name) call");
	}
}
