package com.shinhan.day08.exercise;

public class Example {
	//자동형변환	부모 = 자식
	public static void action(A a) {
		//메서드는 instance를 따른다. 재정의된 메서드가 수행된다.
		a.method1();
		
//		if (a instanceof C c) {
//			c.method2(); //java 15 버젼 이후
//		}
		if (a instanceof C c) {
			((C)a).method2();
		}
	}

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}