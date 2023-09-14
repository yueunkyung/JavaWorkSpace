package com.shinhan.day09;


//final class: 상속불가
//final field: 선언시 또는 생성시 반드시 초기화, 수정불가
//final method: override 불가

//abstract class: abstract 메서드가 0개 이상 있다.
//                instance화 할 수 없다.(객체생성불가)
//abstract method: 정의는 있고 구현은 없다. 구현은 반드시 자식한다.
public abstract class Parent{
	//1.field
	int a = 10;
	private String s1 = "자바";
	protected String s2 = "자바";
	public String s3 = "자바";
	//2.constructor
	public Parent(){
		System.out.println("Parent default 생성자");
	}
//	Parent(int b){
//		System.out.println("Parent default 생성자");
//	}
	//3.method
	protected void f1(){
		System.out.println("부모의 f1메서드");
	}
	public abstract void show();
}