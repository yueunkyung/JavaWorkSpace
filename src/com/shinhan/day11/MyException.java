package com.shinhan.day11;

//업무에 맞는 예외를 사용자가 정의, 강제 발생하기 위함
public class MyException extends Exception {
	String title;
	MyException(String message, String title){
		super(message);
		this.title = title;
	}
	void print() {
		System.out.println(title+"!!!!!!!!!!!"+getMessage());
	}
}
