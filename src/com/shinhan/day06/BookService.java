package com.shinhan.day06;

//업무로직구현:Service
//DB와 관련있는 업무로직구현 : DAO (Data Access Object), Repository
public class BookService {
	BookVO[] booklist;

	public BookService(BookVO[] booklist) {
		this.booklist = booklist;
	}
	void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(BookVO book:booklist) {
			System.out.println(book.getTitle());
		}
	}
	
	void printTotalPrice(){
		int total = 0;
		System.out.println("=== 책 가격의 총합 ===");
		for(BookVO book:booklist) {
			total += book.getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + total);
		
	}
	
}
