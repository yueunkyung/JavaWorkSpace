package com.shinhan.day02;

public class Exercise03 {

	public static void main(String[] args) {
		test5();
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double result1 = (lengthTop+lengthBottom)*height/2; //정수/정수는 정수이다. 소수아래가 버려짐
		double result2 = (lengthTop+lengthBottom)*height*1.0/2; // 실수/정수의 결과는 실수이다.
		double result3 = (lengthTop+lengthBottom)*height/2.0; // 정수/실수의 결과는 실수이다.
		double result4 = (double) (lengthTop+lengthBottom)*height/2;
		double result5 = (double) ((lengthTop+lengthBottom)*height/2);
		// result5는 정수결과를 실수로 변경했기 때문에 소수아래가 이미 버려짐.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

	private static void test5() {
		// TODO Auto-generated method stub
		
	}

	private static void test4() {
		int value = 356;
		System.out.println(value/100*100);		
	}

	private static void test3() {
		int pecils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수 
		int pencilPerStudent = pecils/students;
		//남은 연필 수
		int pencilsLeft =  pecils%students;
		
		System.out.println("1명이 갖은 연필수: " + pencilPerStudent);
		System.out.println("남은 연필수: "+ pencilsLeft);
		
	}

	private static void test2() {
		int score = 85;
		String result = (!(score>90))? "가": "나";
		System.out.println(result);
		
	}

	private static void test1() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);		
	}

}
