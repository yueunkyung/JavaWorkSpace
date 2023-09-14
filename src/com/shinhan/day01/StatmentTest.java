package com.shinhan.day01;

/**
 *	이 부분이 javadoc으로 document 생성 시 삽입된다.
 */
/* 여러 줄 주석
 workspace : project들 묶음
 project : module들 또는 package들
 module :  package들 묶음
 package : class들 묶음
 class : 변수들 + method들
 하나의 .java에는 여러 class 가능
 하나의 .java에는 하나의 class 저장하는 것이 바람직함.
 public class는 하나, 파일이름은 public class 이름으로 저장
*/
// 한 줄 주석

class A {
	
}

class B {
	
}

public class StatmentTest {

	public static void main(String[] args) {
		System.out.println("****main시작******");
		input();
		output();
		f1();
		System.out.println("****main끝******");
	}

	private static void f1() {
		System.out.println("************f1 method************");
		
	}

	private static void output() {
		// TODO Auto-generated method stub
		System.out.println("1.output함수입니다.");
		System.out.println("****************");
	}

	private static void input() {
		// TODO Auto-generated method stub
		System.out.println("1.input함수입니다.");
		System.out.println("---------------");
	}

}
