package com.shinhan.day02;

import java.util.Scanner;

//static에서 non-static 불가하다.
/*
 *>java Exercise04
 * 1. class load....method 영역에 static이 올라간다.
 * 2. 검증
 * 3. main 시작 
 */

// class =  변수 + 메서드들
public class Exercise04 {

	static Scanner sc = new Scanner(System.in);
	static int balance = 0;
	
	public static void main(String[] args) {
		while(true) {
			menu();
			int jobSelect = sc.nextInt();
			if(jobSelect == 4) break;
			switch(jobSelect) {
			case 1: deposit(); break;
			case 2: withdraw(); break;
			case 3: print(); break;
			}
		}
		sc.close();
	}


	private static void print() {
		System.out.println("잔고>>" + balance);
		
	}


	private static void withdraw() {
		System.out.println("출금액>>");
		balance -= sc.nextInt();
		
	}


	private static void deposit() {
		System.out.println("입금액>>");
		balance += sc.nextInt();
		
	}


	private static void menu() {
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------");			
		System.out.println("선택>");		
	}

}
