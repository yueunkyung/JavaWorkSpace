package com.shinhan.day09;

//interface : 구현 class들의 규격서
public interface RemoteController {
	// 1.상수(변수는 불가), public static final은 생략가능
	public static final String COLOR = "black";
	String COLOR2 = "blue";
	// 2.추상메서드(정의는 있고 구현은 없다), public abstract생략가능
	void powerOn();
	public abstract void powerOff();
	
	//3.default method : 구현 class들의 공통기능 추가시 사용, 재정의 가능
	public default void show() {
		System.out.println("==========default method : 구현 class들의 공통기능 추가시 사용================");
		System.out.println("상수접근"+COLOR);
		powerOn();
		powerOff();
		f1();
		f2();
	};
	
	//4.static method
	public static void show2() {
		System.out.println("!!!!static method는 interface의 것, 구현 class 재정의불가");
		// f1(); => static에서 미리 메모리에 올라가 있어서 static만 불러올 수 있다.
		f2();
	}
	
	//5.private method
	private void f1() {
		System.out.println("private method, default method에서 호출가능");;
	}

	//6.private static method
	private static void f2() {
		System.out.println("private static method:static method에서 호출가능, default method에서 호출가능");;
	}
}
