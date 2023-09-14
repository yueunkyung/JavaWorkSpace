package com.shinhan.day03;

import java.util.Scanner;

public class ReferenceTest {

	public static void main(String[] args) {
//		f1();
		f2();

	}

	private static void f2() {
		String s1 = null;
		System.out.println("내용: "+s1);
		System.out.println("길이: "+s1.length()); //NullPointerException
		
	}

	private static void f1() {
		int a = 10;
		String s1 = "자바";
		String s2 = new String("자바");
		System.out.println("s1 = " + s1); //내용 출력
		System.out.println("s1 = " + s1.toString()); //내용 출력
		System.out.println("s2 = " + s2); //내용 출력
		System.out.println("s2 = " + s2.toString()); //내용 출력
		
		LAB5 aa = new LAB5();
		System.out.println(aa);
		System.out.println(aa.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		System.out.println(sc.toString());
	}

}
