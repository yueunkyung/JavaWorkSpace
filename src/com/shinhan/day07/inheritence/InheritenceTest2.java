package com.shinhan.day07.inheritence;

class A {
	String name = "AAAA";
	A() {
		System.out.println("부모 A 생성");
	}
	void method1() {
		System.out.println("부모A의 method1");
	}
}

class B extends A {
	B() {
		System.out.println("부모, 자식 B 생성");
	}

}
class C extends B {
	int name = 100;
	C() {
		super();
		System.out.println("자식 C 생성");
	}
	
	@Override
	void method1() {
		super.method1();
		System.out.println("자식 C의 method1.......자식Override");
	}

}
public class InheritenceTest2 {
	public static void main(String[] args) {
		C var1 = new C();
		System.out.println(var1.name);
		var1.method1();
	}
}
