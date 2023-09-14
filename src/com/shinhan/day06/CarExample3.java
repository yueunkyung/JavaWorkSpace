package com.shinhan.day06;

public class CarExample3 {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		
		// static 변수는 객체 생성없이 접근 가능, 모든 객체가 공유
		System.out.println(Car.company);
		System.out.println("car의 개수:"+Car.carCount);
		//Car.company = "기아자동차";
		//System.out.println(Car.company);
		Car.company = "기아";
		Car c1 = new Car("A", "black");
		Car c2 = new Car("B", "black");
		//권장문법은 class이름.변수
		//객체이름.변수 도 가능하다.
		c1.company = "기아2";
		c2.company = "기아3";
		Car.company = "기아4";
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("car의 개수:"+c1.carCount);
		System.out.println("car의 개수:"+c2.carCount);
		System.out.println("car의 개수:"+Car.carCount);
	}

}
