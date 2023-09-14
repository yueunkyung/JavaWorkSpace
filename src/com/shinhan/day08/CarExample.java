package com.shinhan.day08;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Tire[] arr = new Tire[2];

		arr[0] = makeTire("han");
		arr[1] = makeTire("kum");

		print(arr);
		call(new HankookTire("blue"));
		call(new HankookTire("yellow"));
		
		System.out.println(arr[0] instanceof Tire);
		System.out.println(arr[0] instanceof HankookTire);
		System.out.println(arr[0] instanceof KumhoTire);
		
		//객체 == Object == instance
		String str = new String("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.println(str instanceof String);
		System.out.println(sc instanceof Scanner);
	}
	
	
	private static void call(Tire tire) {
		if (tire instanceof HankookTire han) { 
			System.out.println(((HankookTire) tire).company);
			System.out.println(han.company); //12version부터 가능
		}
		if (tire instanceof KumhoTire kum) {
			System.out.println(((KumhoTire) tire).company);
			System.out.println(kum.company); //12version부터 가능
		}

		tire.roll();
		// 객체지향프로그램 특징 : 캡슐화(정보은닉 private),
		//					 상속성(이미 있는 것을 재사용이 목적(extends),
		//					 다형성(다양한 형태)
		// 다형성:사용법은 같지만 결과는 다르다.
		// = 자동형변환 + Override
		
	}

	private static void print(Tire[] arr) {
		for (Tire tire : arr) {
			call(tire);
		}
	}

	// 자동형변환
	private static Tire makeTire(String com) {
		Tire tire;
		if (com.equals("han")) {
			tire = new HankookTire("black");
		} else {
			tire = new KumhoTire("blue");
		}
		return tire;
	}

}
