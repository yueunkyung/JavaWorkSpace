package com.shinhan.day11;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		super("ID가 존재하지 않음");
	}
	public NotExistIDException(String message) {
		super(message);
	}
	public void print() {
		System.out.println("------------------------------");
	}
	public void print(String symbol) {
		System.out.println(symbol);
	}
}
