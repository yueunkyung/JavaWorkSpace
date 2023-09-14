package com.shinhan.day04;

public class Review {

	public static void main(String[] args) {
//		variableTest(100.5);
//		ifTest(100);
//		forTest(100);
		String author = "신용권";
		stringTest("이것이 자바다", author);
	}

	private static void stringTest(String book, String auth) {
		System.out.println(book+"---"+auth);
		System.out.println(book.length());
		System.out.println(book.substring(4,6));
		System.out.println(book.replace("자바", "JAVA"));
	}

	private static void forTest(int su) {
		//(초기값;조건문;증감)
		int j = 100;
		int sum=0;
		for(int i=1;i<=su;i++,j++) {
			System.out.println(i+"=="+j);
			sum = sum + i;	//1+2+3+...+100
		}
		System.out.println(sum);
	}

	private static void ifTest(int su) {
		//중괄호,brace{} / 대괄호 [] / 괄호()
		//'',"" quotation
		//; semicolon
		//~ tilde
		if(su%2==0) {
			System.out.println("짝수이다");
		}else {			
			System.out.println("홀수이다");
		}
		System.out.println(su%2==0?"짝수이다":"홀수이다");
	}

	private static void variableTest(double su) {
		//literal이 정수이면 기본이 int
		//literal이 실수이면 기본이 double
		//기본형 dataType:byte(1)<short,char<(2)<int(4)<long(8)<float(4)<double(8)
		//정수보다 실수가 좀 더 커서 이렇게 표현을 한다. long<float<double
		
		
	}

}
