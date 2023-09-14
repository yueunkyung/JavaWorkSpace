package com.shinhan.day07.inheritence;

//1.final class : 자식 class를 만들 수 없다.
public class Parent {
	int a = 10;
	//2.final field : 값 수정 불가
	static final double PI = 3.14;
	final int b=20;
	Parent(){
		//super();
		System.out.println("부모의 defulat생성자");
	}
	Parent(int a) {
		this.a = a;
		System.out.println("부모의 argument있는 생산자");
	}
	//3.final method : 자식이 메서드 재정의 불가
	final void method1() {
		System.out.println("*****부모메서드 method1");
	}
}
