package com.shinhan.day08;

//class 정의 시 extends가 없으면 extends Object가 생략되어 있다.
//final class는 상속불가
class Parent extends Object {
	int su = 100;

	Parent() {
		// super();......Object()
		System.out.println("부모의 기본 생성");
	}

	Parent(int a, String b) {
		// super();......Object()
		System.out.println("부모의 arg2개 생성");
	}

	void f1() {
		System.out.println("부모가 정의한 f1메서드");
	}
}

class Child extends Parent {
	boolean su = true;

	// 생성자...정의없으면 컴파일러가 default 생성자 제공
	Child() {
		super(100, "AA");// .....첫 줄 자동삽입된다. 부모생성자 호출, super(argument) 명시적으로 생성자 호출
		System.out.println("자식의 기본 생성자");
	}

	// Override : 이름같고 매개변수 개수와 타입일치, returnType 같아야, modifier는 같거나 넓어야한다.
	// Overloading : 이름같고, 매개변수 개수와 타입이 일치하지 않음
	public void f1() {
		System.out.println("자식이 정의한 f1메서드....Override");
	}

	void f1(String s) {
		System.out.println("자식이 정의한 f1메서드....Overloading");
	}
}

public class InheritenceTest {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.su);
		ch.f1();
	}

}
