package com.shinhan.day01;

public class VariableTest2 {

	public static void main(String[] args) {
		System.out.println("main시작");
		f3();
		System.out.println("main끝");

	}

	private static void f3() {
		// 비교연산자, 논리연산자
		int v1 = 100;
		int v2 = 200;
		int v3 = 300;
		// &&는 모두 참이면 참이다. (단축) 앞의 결과가 거짓이면 뒷 문장을 수행 안함.
		// &는 무조건 모두 수행한다.
		boolean result = v1 > v2 && ++v1 > v3;
		System.out.println(result);
		System.out.println(v1);
		
		// ||는 앞의 결과가 참이면 뒷 문장은 수행 안함. (단축)
		boolean result2 = v1 > v2 || ++v1 > v3;
		System.out.println(result2);
		System.out.println(v1);
	}

	private static void f2() {
		int v1 = 100;
		int v2 = 200;
		
		System.out.println(Integer.max(v1, v2));
		System.out.println(v1 > v2? v1 : v2);	// 3항 연산자
		
		String s = "300";
		int result = Integer.parseInt(s);
		System.out.println(result + 400);
		String result2 = Integer.toBinaryString(100);	//101
		System.out.println(result2);
	}

	private static void f1() {
		// 자바는 data의 성격을 미리 정한다. 다른 타입 저장 불가
		// data type 변수 이름
		// 1. 기본형타입 8가지
		byte v1 =127;
		short v2 = Short.MAX_VALUE;
		char v3 = 65;	//'A'
		int v4 = Integer.MAX_VALUE;
		long v5 = 10000000000000L;	// l, L
		float v6 = 3.14f;	// F, f
		double v7 = 3.14;
		boolean v8 =true;
		// String " + 숫자 => 문자
		System.out.println("v1=" + v1 + 99);
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);
		System.out.println("v7=" + v7);
		System.out.println("v8=" + v8);
		
	}

}
