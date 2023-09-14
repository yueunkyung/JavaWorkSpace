package com.shinhan.day05;

import java.util.Scanner;

public class 주차장 {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		//기본형 datatype은 초기화후 사용가능
		int a;
		//1.객체참조변수선언
		Scanner sc;
		String str1;
		Car c1, c2;		
		//2.객체생성...field는 자동초기화
		//sc = new Scanner(System.in);
		str1 = new String("Hello"); //String은 new 없이 사용가능
		c1 = new Car();
		c2 = new Car();
		//3.객체사용
		c1.model = "A모델";
		c1.price = 2000;
		c2.model = "B모델";
		c2.price = 3000;
		System.out.println("c1모델:"+c1.model);
		System.out.println("c1모델:"+c1.price);
		System.out.println("c2모델:"+c2.model);
		System.out.println("c2모델:"+c2.price);
		

		//1.객체참조변수선언 + 2.객체생성 + 초기화
		Car c3 = new Car("c모델", 5000);
		System.out.println("c3모델:"+c3.model);
		System.out.println("c3모델:"+c3.price);
	}

}
