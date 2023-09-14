package com.shinhan.day02;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		f6();

	}

	private static void f6() {
		//1~45사이의 무작위 정수를
		int luck = (int)(Math.random()*45 + 1); // 0<=  <1			
		System.out.println(luck);
	}

	private static void f5() {
		// Math : 자바가 제공하는 class, 수학관련 기능이 포함되어있음
			//0보다 크거나 같고 1보자 작은 실수  0<=   <1
		
		int score = (int)(Math.random()*100 + 1);
		System.out.println(score);
		
		
	}

	private static void f4() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력>>");
		int score = sc.nextInt();
		String grade="F"; // A(90~), B(80~), C(70~), D(60~), F
		//변수이거나 수식
		switch (score/10) {
		case 10 : case 9 :
			grade="A"; break; //switch 빠지기
		case 8 :
			grade="B"; break; //switch 빠지기
		case 7 :
			grade="C"; break; //switch 빠지기
		case 6 :
			grade="D"; break; //switch 빠지기
		default:
			break;
		}
		
		System.out.println(grade + "학점");
		
	}

	private static void f3() {
		int score = 99;
		String grade; // A(90~), B(80~), C(70~), D(60~), F
		
		if (score>=90) {
			grade = "A";
		} else if(score>=80) {
			grade = "B";			
		} else if(score>=70) {
			grade = "C";			
		} else if(score>=60) {
			grade = "D";			
		} else {
			grade = "F";
		}
		
		System.out.println(grade);		
		
	}

	private static void f2() {
		int score = 19;
		if(score>=90) {
			System.out.println("합격1!");
		} else {
			System.out.println("불합격1!");
		}
		
		System.out.println("$$$$$$$$$$");
		
	}

	private static void f1() {
		int score = 99;
		System.out.println(score>=90);
		if(score>=90) {
			System.out.println("합격1!");
			System.out.println("$$$$$$$$$$");
		}
		
		// 조건문이 맞아서 수행할 문장이 한문장이면 brace{}는 생략가능
		if(score>=90)
			System.out.println("합격2!");
		
		// 3항연산자 --- if문이 간단할때
		System.out.print(score>=90?"합격3!\n":"");
		
		System.out.println("*******************");
	}

}
