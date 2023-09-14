package com.shinhan.day06;

public class CarExample {
	public static void main(String[] args) {
		// 1.객체참조변수선언
		// 2.객체생성
		Car c1 = new Car("A", "red");
		Car c2 = new Car("B", "black", 300);
		Car c3 = new Car("C", "gray", 200, 120);
		c1.setMaxSpeed(555);
		System.out.println(c1.getColor());
		System.out.println(c1.getModel());
		System.out.println(c1.getMaxSpeed());
		System.out.println(c1.getSpeed());
		
		System.out.println(c1);
		System.out.println(c1.toString());
	
		System.out.println(c2);
		System.out.println(c3);
	}
}
