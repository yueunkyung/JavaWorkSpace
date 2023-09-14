package com.shinhan.day08.lab;

class C extends B {
	int meth() {
		return 100;
	}

	static int sMeth() {
		return 100;
	}
}

class B extends A {
	int meth() {
		return 10;
	}

	static int sMeth() {
		return 10;
	}
}

class A {
	int meth() {
		return 1;
	}

	static int sMeth() {
		return 1;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		C c = new C();
//        B b = (B) c; 
//        A a = (B) c;
		B b = c;
		A a = c;

		if (a instanceof A) { //A
			System.out.println("a는 A의 인스턴스 이다.");
		}
		if (a instanceof B) { //A>B
			System.out.println("a는 B의 인스턴스 이다.");
		}
		if (a instanceof C) {//A>C
			System.out.println("a는 C의 인스턴스 이다.");
		}
		
		// A => 1
		// B => 10
		// C => 100
		//100  100   1001  10   100 
		//C, C, C+A, B, C

		System.out.println(a.meth() + " " + b.meth() + " " + c.meth() + a.sMeth() + " " + b.sMeth() + " " + c.sMeth());
	}
}
