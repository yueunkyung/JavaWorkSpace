package com.shinhan.day11;

public class BookTest {

	public static void main(String[] args) {
		Book b = makeBook();
		Book b2 = makeBook();
		
		print(b);
		System.out.println(b.equals(b2));
		System.out.println(b.title());
		System.out.println(b.price());
	}

	private static void print(Book b) {
		System.out.println("==book정보======");
		System.out.println(b);

	}

	private static Book makeBook() {
		Book book = new Book("이것이자바다", 36000);
		return book;
	}

}
