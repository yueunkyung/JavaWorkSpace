package com.shinhan.day08.inheritence;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // 자동형변환 : 부모 = 자식

		//메서드는 instance를 따른다.
		snowTire.run();
		tire.run();
		
		//field는 변수 타입을 따른다.
		System.out.println(snowTire.color);
		System.out.println(tire.color);
	}
}