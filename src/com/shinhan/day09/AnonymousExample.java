package com.shinhan.day09;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}

/*
 * 	자전거가 달립니다.
 *  승용차가 달립니다.
 *	트럭이 달립니다.
 */