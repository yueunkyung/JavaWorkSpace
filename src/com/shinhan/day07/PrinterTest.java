package com.shinhan.day07;

public class PrinterTest {

	public static void main(String[] args) {

		//static인 경우
		System.out.println("--------static인 경우---------");
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		//instance인 경우
		System.out.println("--------instance인 경우---------");
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

		System.out.println("--------System.out.println---------");
		System.out.println(100);
		System.out.println("자바");
		System.out.println(true);
		System.out.println(new char[] {'a','b','c'});
		
		System.out.println(printer); //주소출력
		System.out.println(printer.toString()); //주소출력
	}

}
