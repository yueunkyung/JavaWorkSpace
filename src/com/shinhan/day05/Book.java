package com.shinhan.day05;

public class Book {
	// 1.field(멤버변수:non-static, 공유변수 static)
	String kind = "IT교재";
	private String title;
	private int price;
	private String author;

	// 2.constructor
	// 생성자는 다른 모양의 생성자를 호출 가능하다.
	// 같은 코드를 반복하지 않기 위해서 필요

	public Book() {
		//생성자가 다른 생성자를 호출하는 것은 반드시 1줄에 1번만 가능.
		this(null, 0, null);
	}

	public Book(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
		System.out.println("Book이 생성됩니다.");
	}

	public Book(String title) {

		// this.title = title;
		this(title, 0, null);
		System.out.println("-----------------");
	}

	public Book(String title, int price) {
		// this.title = title;
		// this.price = price;
		this(title, price, null);

	}
	/*
	 * overloading :매개변수의 타입과 갯수가 달라야한다. Book(String author, int price, String
	 * title) { }
	 */

	// 3.method
	void print() {
		System.out.println("IT교재 : " + kind);
		System.out.println("책의 제목 : " + title);
		System.out.println("책의 가격 : " + price);
		System.out.println("책의 저자 : " + author);
		System.out.println("--------------------------");
	}
}// end Book
