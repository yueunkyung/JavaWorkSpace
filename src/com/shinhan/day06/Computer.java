package com.shinhan.day06;

public class Computer {
	// 함수를 정의한다, 구현한다.
	// 이름같고 매개변수 사양이 다르다(Overloading)
	public int sum(int a, int b) {
		System.out.println("arg2");
		return a + b;
	}

	public int sum(int a, int b, int c) {
		System.out.println("arg3");
		return a + b + c;
	}

	// 가변길이 매개변수
	public int sum(int... arr) {
		int total = 0;
		for (int data : arr) {
			total += data;
		}
		return total;
	}

	// 배열
	public String sum(int[] arr, String s) {
		int total = 0;
		for (int data : arr) {
			total += data;
		}
		return s + ":" + total;
	}
	
	void method() {
		System.out.println("void는 return값이 없음을 의미");
	}
	int method2() {
		System.out.println("int return");
		return 100;
	}
	String method3() {
		System.out.println("String return");
		int a = 100;
		//return a+"";
		return String.valueOf(a);
	}
	boolean method4(int a) {
		System.out.println("boolean return");
		//return true;
		return a%2==0;
	}
	int[] method5(int a) {
		System.out.println("Array return");
		int[] arr = {100,200};
		return arr;
	}
}
