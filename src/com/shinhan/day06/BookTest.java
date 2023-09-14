package com.shinhan.day06;

public class BookTest {
	public static void main(String[] args) {
		//배열..Book을 담을 수 있는 방이 5개 있다.
	    BookVO[] b = new BookVO[5];
	    //Book을 생성해서 배열이 참조한다. 
		b[0] = new BookVO("Java Program",30000);
		b[1] = new BookVO("JSP Program",25000);
		b[2] = new BookVO("SQL Fundamentals",20000);
		b[3] = new BookVO("JDBC Program",32000);
		b[4] = new BookVO("EJB Program",25000);
		
		BookService bm = new BookService(b);
		bm.printBookList();
		bm.printTotalPrice();
	}
}
