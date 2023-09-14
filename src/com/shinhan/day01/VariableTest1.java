package com.shinhan.day01;

public class VariableTest1 {

	public static void main(String[] args) {
		f8();
	}
	
	private static void f8() {
		char v1 = 97;	// 0~32767 + 32767
		System.out.println(v1);
		
		// 선언하면서 할당가능, 여러개 구분은 콤마(,)이다.
		int a = 1, b = 2;
		int c = 10, d = 10;
		a++; b++;
		System.out.println(a+b+c+d);
		System.out.println(c == d);
		System.out.println(c != d);
		// 비교연산자와 논리연산자가 섞여있음... 연산자 우선순위가 있다.
		// 산술연산자 > 비교연산자 > 논리연산자
		System.out.println(c == d && a != b); //&& => AND
		System.out.println(c != d || a != b); //&& => OR
		
	}

	private static void f7() {
		boolean v1;
		int a = 10;	//a에 10을 저장한다.
		v1 = 1 > 2;
		System.out.println(v1);
		System.out.println(10 == a);
		a++; //a에 저장된 값을 읽어서 1 증가
		System.out.println(a); //a에 저장된 값을 읽어서 출력
		
	}

	private static void f6() {
		//실수는 기본이 double(8byte)
		float v1;
		v1 = 3.14F;
		System.out.println(v1);
		
		double v2;
		v2 = 3.14;
		System.out.println(v2);
		
	}

	private static void f5() {
		long v1;
		v1 = 100000000000000000L;
		System.out.println(v1);
	}

	private static void f4() {
		// char : 단일문자이다. '' 사용, 2byte, 부호가 없음
		char v1;
		v1 = 'A';
		v1++;
		System.out.println(v1);

	}

	private static void f3() {
		// 1. 변수선언은 변수타입과 변수이름을 쓴다.
		int v1;	// int : 4byte	-2147483648~2147483647
		v1 = Integer.MAX_VALUE;
		//v1++;	// 범위를 벗어나면 원하는 값이 아니다.
		System.out.println(v1);
		
	}

	private static void f2() {
		// 1. 변수선언은 변수타입과 변수이름을 쓴다.
		short v1;	// short : 2byte	-32768~32767
		v1 = 32767;
		v1++;	// 범위를 벗어나면 원하는 값이 아니다.
		System.out.println(v1);
		
	}

	private static void f1() {
		// 변수 : data를 저장하기 위한 기억 장소 이름
		// 타입 : data의 성격
		// 1. 기본형 type : 
		//	 정수~ byte(1byte), short(2byte), char(2byte), int(4byte), long(8byte)
		//	 실수~ float(4byte), double(8byte)
		//	 논리~ boolean(1byte)
		// 2. 참조형 : class, enum 등 기본형 type 이외
		
		// 1. 변수선업
		byte v1;	// byte : 2byte	-128~127
		// 2.값을 할당
		v1 = 127;
		v1++; v1++; v1++; //1증가
		System.out.println(v1);
	}

}
