package com.shinhan.day02;

// class안에는 5가지만 가능 => 변수선언 + 함수, 문장불가
// 실행문 => 반드시 메서드안에 작성
public class Day1Review {

	// 함수정의
	public static void f1() {
		System.out.println("f1함수");
		//변수 : 하나의 data를 저장하기 위한 기억장소이름
		//=는 할당연산자, 저장한다.
		//변수는 반드시 선언 후 사용한다. (값을 할당, 읽기)
		//기본타입: byte, short, char, int, long, float, double, boolean
		//지역변수는 초기화하지 않으면 사용불가
		{//{}를 지역이라고 생각하자
			int var1;
			var1 = 10;
			System.out.println(var1 + 20);
		}
		int var1 = 99;
		System.out.println(var1 + 20);
	}
	// 함수정의
	public static void f2() {
		int var1 = 88;
		System.out.println("f2함수");
		System.out.println(var1 + 20);
	}
	public static void f3() {
		byte a = 127; //1byte
		int b; //4byte 2147483647
		System.out.println("f3함수");
		
		// 자동형변환(자동타입변환)
		b = a + 100000; //4byte방 = 1byte값
		System.out.println(b);
		
		// 강제형변환 casting data 손실가능성
		a = (byte)b; //1byte방 = 4byte값
		System.out.println(a);		
	}
	
	// JVM은 프로그램 시작점, 끝점이 main이다.
	public static void main(String[] args) {
		System.out.println("main함수");
		f1(); //함수호출
		f2();
		f3();
		System.out.println("-------------------");
	}

}
