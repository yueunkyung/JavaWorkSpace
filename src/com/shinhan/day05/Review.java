package com.shinhan.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//java.lang 패키지 이외에  있는 class들은 반드시 import한다.
import java.util.Scanner;

//method overloading
public class Review {
	// throws : 던진다. 나의 함수를 부른곳으로 떠넘긴다.(오류가 나면 나를 부른 곳에서 해결하겠다.)
	public static void f3() throws FileNotFoundException {
		// 사용자 표준입력(파일로 변경) : System.in
		System.setIn(new FileInputStream("src/com/shinhan/day05/test.txt"));
		Scanner sc = new Scanner(System.in);
//		String word;
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
//		while ((word = sc.next()) != null) {
//			System.out.println(word);
//		}
		sc.close();
	}

	public static void f2() {
		// 사용자 표준입력(키보드) : System.in
		// 단어, 라인읽기 지원 : Scanner

		Scanner sc = new Scanner(System.in);
		System.out.println("입력>>");
		System.out.println("1:" + sc.next());
		System.out.println("2:" + sc.nextLine());
		sc.close();
	}

	public static void f1() {
		System.out.println("f1메서드 프레임 시작");
		int a = 10, b = 99, c = 88;
		System.out.println(a + b + c);
		System.out.println("f1메서드 프레임 끝");
	}

	public static void f1(int a, int b, int c) {
		System.out.println("f1메서드 프레임 시작!!!");
		System.out.println(a + b + c);
		System.out.println("f1메서드 프레임 끝!!!");
	}

	public static void main(String[] args) throws FileNotFoundException {
		f3();
		/*
		 * System.out.println("-----main thread 시작-----------"); int a = 10, b, c; b =
		 * 20; if (a >= 10) c = 30; else c = 40; System.out.println(a + b + c); // 초기화하지
		 * 않은 지역변수 사용불가 f1();// 함수호출 f1(1,2,3);// 함수호출
		 * System.out.println("-----main끝-----------");
		 */

	}

}
