package com.shinhan.day06;

//VO(Value Object) : data를 담는 그릇
//DTO(Data Transfer Object) : data전송 목적
//JavaBeans : 자바객체
//업무로직은 포함되지 않음
//class는 변수+함수의 묶음
public class BookVO {
	// 책 제목(title)과 가격(price) 정보를 저장하는 멤버변수가 있어야 한다.
	private String title;
	private int price;
	
	//멤버변수를 모두 초기화하는 생성자 메서드
	public BookVO(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
