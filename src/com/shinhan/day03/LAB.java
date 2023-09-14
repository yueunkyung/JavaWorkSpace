package com.shinhan.day03;

import java.util.Scanner;

public class LAB {


	
	public static void main(String[] args) {
//		f5("이것이", "자바다");
//		f5("100","200");
//		 hokeyGraphics2( '$', 4, false); 
//		 hokeyGraphics2( '*', 5, true);
		f6();
	}
	
	private static void f6() {
		//직각 역삼각형을 출력할 줄 수: 10
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수 : ");
		int su = sc.nextInt();
		
		for(int row=1;row<=su;row++) {
			for(int col=1;col<=su+1-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

	public static void hokeyGraphics2(char cell, int size, boolean isRect) {

		// 특정 도형을 출력하는 메소드 구현 - isRect 값이 true 이면 사각형 모양을 출력하고, false 이면 삼각형을 출력한다.
		for (int row = 1; row <= size; row++) {
			int shape=row;
			if (isRect) shape =size;
			
			for (int col = 1; col <= shape; col++) {
				System.out.print(cell);
			}
			System.out.println();// 줄바꾸기
		}
	}
	
	public static void hokeyGraphics(char cell, int size, boolean isRect) {

		// 특정 도형을 출력하는 메소드 구현 - isRect 값이 true 이면 사각형 모양을 출력하고, false 이면 삼각형을 출력한다.
		if(isRect){
			for(int row=1;row<=size;row++) {
				for(int col=1;col<=size;col++) {
					System.out.print(cell);
				}
				System.out.println();//줄바꾸기
			}
		} else {
			for(int row=1;row<=size;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(cell);
				}
				System.out.println();//줄바꾸기
			}
		}
	}

	private static void f5(String s1, String s2) {
		System.out.println(s1 + s2 + ":" + (s1 + s2).length());

	}

	// 함수의 목적은 재사용, 모듈화
	// 함수 호출 : 함수 이름(값)
	// 함수 정의 : 함수 이름(변수 타입, 변수 이름)
	private static void f4(int i, int j) {
		System.out.println(i + j);

	}
	// 함수, 메서드, 기능, 행위, argument를 가질 수 있다.

	private static void f3() {
		/*
		 * 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 SumTest 클래스의 main 메쏘드를 완성하십시오. a. 입력 받은 숫자가 홀수인
		 * 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다. - 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 )
		 * b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다. - 예제 : 입력이 10 이면 30을 출력 ( 2
		 * + 4 + 6 + 8 + 10 = 30 )
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		int su = sc.nextInt();
		// 홀수인지 짝수인지 판별----조건문(if, switch)
		int sum = 0;
		int start = 1;
		if (su % 2 == 0)
			start = 2;
		for (int i = start; i <= su; i += 2) {
			System.out.print(i);
			System.out.print(i == su ? "=" : "+");
			sum += i;
		}

		System.out.println("결과 값 : " + sum);
		sc.close();

	}

	private static void f2() {
		// 문자열을 입력 받아서 아래와 같은 실행결과가 나타나도록 ForTest클래스의 main 메쏘드를 완성하십시오. 입력 받은 문자열을 한 글자씩
		// 증가시키며 출력하는 프로그램입니다. (단, 대문자로 출력해야 합니다.)

		// 변수는 반드시 선언 후 사용한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");

		String statement = sc.nextLine();
		System.out.println("문자열의 길이: " + statement.length());

		for (int i = 1; i <= statement.length(); i++) {
			System.out.println(statement.substring(0, i).toUpperCase());
		}
		sc.close();
	}

	private static void f1() {
		int tom = -1;
		char marry = '9';
		boolean john = false; // 주의 : 지역변수는 초기화 없이 사용불가
		String sarah = "Sarah Jang";
		System.out.println("our friends..\n" + tom + ", " + marry + ", " + john + " and " + sarah);
		/*
		 * [클래스 실행결과] our friends.. -1, 9, false and Sarah Jang
		 */
	}

}
