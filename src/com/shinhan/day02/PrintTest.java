package com.shinhan.day02;

public class PrintTest {

	public static void main(String[] args) {
		f3();
	}

	//d(정수), s(문자), f(실수), -는 왼쪽정렬
	static void f3() {
		System.out.printf("%-10d\n",1); //출력하고 줄바꿈없음
		System.out.printf("%10s\n","2"); //출력하고 줄바꿈없음
		System.out.printf("%-10.2f\n",3.14); //출력하고 줄바꿈없음
		int a = 10;
		double b = 123.456;
		String s = "이것이 자바다";
		System.out.printf("정수=%5d, 실수=%.2f, 문자=%-10s ",a,b,s);
	}
	static void f2() {
		System.out.println("1"); //출력 후 줄바꾸기
		System.out.print("2\n"); //출력하고 줄바꿈없음
		System.out.println("3");
	}
	static void f1() {
		System.out.println("1"); //출력 후 줄바꾸기
		System.out.print("2"); //출력하고 줄바꿈없음
		System.out.println("3");
	}

}
