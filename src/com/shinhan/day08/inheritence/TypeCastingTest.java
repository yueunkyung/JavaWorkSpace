package com.shinhan.day08.inheritence;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}

public class TypeCastingTest {

	public static void main(String[] args) {
		A v1 = new D();
		B v2 = new D();
		// E v3 = new D(); //형제의 instance를 담을 수 없다.
		
		D v3 = (D)v1;
		D v4 = (D)v2;
		// C v5 = (C)v1; //컴파일시 오류없음, 실행 시 우류발생 ClassCastException
		
		
		//B b = (B)new A(); //컴파일시 오류없음, 실행 시 우류발생 ClassCastException
		
		//강제형변환, 본래의 instance타입으로 돌아간다는 의미이다.
		A a = new B();
		B b = (B)a;
		
	}

}
