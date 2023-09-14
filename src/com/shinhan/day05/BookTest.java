package com.shinhan.day05;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("자바", 40000, "신용권");
		Book b2 = new Book();
		Book b3 = new Book("스프링 프레임워크1");
		Book b4 = new Book("스프링 프레임워크2", 50000);
		
		b2.kind = "역사교재";
		
		b1.print();
		b2.print();
		b3.print();
		b4.print();
	}

}
