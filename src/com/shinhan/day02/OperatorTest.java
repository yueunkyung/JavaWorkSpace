package com.shinhan.day02;

public class OperatorTest {

	public static void main(String[] args) {
		f7();
	}

	private static void f7() {
		int a = 10;
		int result = a << 3;
		System.out.println(result);
		
	}

	private static void f6() {
		int a =  101;
		
		System.out.println(a%2 == 0 ? "짝수" : "홀수");
		// 짝수인지?
		if( a%2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");			
		}
		
	}

	private static void f5() {
		int a = 10;
		int b = 10;
		String s1 = "자바";		
		String s2 = "자바";
		a++; b++;
		s1 += "정복7";
		s2 += "정복6";
	
		System.out.println(a==b); //기본형은 값을 비교
		System.out.println(s1 == s2); // 참조형은 주소비교
		System.out.println(s1.equals(s2)); //내용을 비교
		System.out.println(a>b);
		System.out.println(s1.compareTo(s2)); //비교
		//3항연산자 비교? 참 : 거짓
		System.out.println(s1.compareTo(s2)>0 ? "s1이크다" : "s2가크다");
		
		System.out.println(a>10 && b>10);
		System.out.println(a>10 || b>10);
		System.out.println(!(a>10));
	}

	private static void f4() {
		double a = 10;
		double b = 0;

		// 실수는 0으로 나누면 Infinity
		// 실수는 0으로 나누면 나머지는 NaN
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(Double.isInfinite(a/b));
		System.out.println(Double.isNaN(a%b));
		
		if(Double.isInfinite(a/b)) {
			System.out.println("무한대이므로 나누기 불가");
		} else {
			System.out.println(a/b);
		}
		if(Double.isNaN(a%b)) {
			System.out.println("NaN이므로 나눈 나머지 알 수 없음");
		} else {
			System.out.println(a%b);
		}
	}

	private static void f3() {
		int a = 10;
		int b = 0;
		
		// 컴파일 오류는 없지만 실행시 오류(RuntimeException) ..JVM이 처리한다.
		// ArithmeticException: /by zero
		System.out.println(a/b);
		
	}

	private static void f2() {
		int a = 10;
		double b = 3.5;
		
		double c = a + b;
		System.out.println(c);
		System.out.println((int)c);
		
	}

	private static void f1() {
		//증감연산자
		int a =10;
		++a;
		a++;
		a = a + 1;
		a += 1; //복합대입연산자
		System.out.println(++a); //증가하고 사용한다. (출력)
		System.out.println(a++); //(출력) 사용 후 증가한다.
		System.out.println("마지막=" + a);
		
		byte b = -128;
		b--; //언더플로우
		System.out.println(b);
		
	}

}
