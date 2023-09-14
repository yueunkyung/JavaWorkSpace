package com.shinhan.day11;

import com.shinhan.day10.Car;

public class ObjectTest2 {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		Car c1 = new Car("A모델", 5000);
		Car c2 = new Car("A모델", 7000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		
		System.out.println(c1.getModel());
		System.out.println(c2.getModel());
	}

}
