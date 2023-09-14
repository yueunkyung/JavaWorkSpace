package com.shinhan.day03;

import java.util.Scanner;

public class Studying {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		int totalResult= 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값을 정수로 입력하세요.");
		int strarVal = scanner.nextInt();
		System.out.println("마지막 값을 정수로 입력하세요.");
		int lastVal = scanner.nextInt();
		System.out.println("증가분을 정수로 입력하세요.");
		int increment = scanner.nextInt();
		
		for(int i=strarVal; i<=lastVal; i+=increment) {
			totalResult += i;
		}
		if(totalResult>1000) {
			totalResult += 2000;
		}
		System.out.println(totalResult);		
	}

	private static void f1() {

		int tom = -1;
		char marry = '9';
		boolean john = false; // 주의
		String sarah = "Sarah Jang";
		System.out.println("our friends..\n" + tom + ", " + marry + ", " + john + " and " + sarah);

	}

}
