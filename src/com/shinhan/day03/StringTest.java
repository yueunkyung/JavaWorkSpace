package com.shinhan.day03;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		f6();

	}

	private static void f6() {
		// 28명의 시험점수를 저장하기...하나의 이름으로 같은 타입의 값 여러개를 저장한다.
		// 1.배열선언
		int[] score1;
		int score2[];
		String[] students;
		// 2.배열생성...갯수가 필수이다. 생성시 자동초기화된다. 정수->0 실수->0.0 boolean->false char->'', 기타->null
		score1 = new int[28];
		score2 = new int[10];
		students = new String[100];
		// 3.배열사용
		score1[0] = 100;
		score1[1] = 99;
		System.out.println(score1[0]);
		System.out.println(score1[1]);
		System.out.println(score1[2]);
		System.out.println(score2[9]);
		System.out.println(students[99]);
		
		
	}

	private static void f5() {
		String s1 = "자바,웹,스프링,리액트,HTML,CSS,JS";
		String[] arr = s1.split(",|@| ");
		System.out.println(Arrays.toString(arr));
		
		//향상된 for(란개 : 여러개)
		for(String word:arr) {
			System.out.println(word);
		}
	}

	private static void f4() {
		String s1 = "자바 프로그램";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		
	}

	private static void f3() {
		//String은 고정문자열이다. 값을 변경불가.
		String s1 = "자바 프로그램";
		System.out.println(s1.replace("자바", "JAVA"));
		System.out.println(s1);
		s1 = s1.replace("자바", "JAVA");
		System.out.println(s1);
	}

	private static void f2() {
		String s1 = "자바 프로그램";
//		System.out.println(s1.charAt(0));
		for(int index=0;index<s1.length();index++) {
			System.out.println(s1.charAt(index));
		}
		
	}

	private static void f1() {
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		String s4 = new String("자바");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		s1 += "프로그램";
		s2 += "프로그램";
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));
	}

}
