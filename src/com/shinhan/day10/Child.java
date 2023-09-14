package com.shinhan.day10;

import com.shinhan.day09.Parent;

class Child extends Parent {
	//부모의 private만 제외하고 자식은 부모의 모든 구성요소를 사용가능
	Child(){
		//super(100);
		System.out.println("Child default 생성자");
	}
	protected final void f1() {
		System.out.println("자식의 f1메서드");
	}
	void f2() {
		//System.out.println("부모의 field 접근"+a);//생략: 같은 패키지는 접근가능
		//System.out.println("부모의 field 접근"+s1); //private 접근불가
		System.out.println("부모의 field 접근"+s2); //protected 같은패키지는 접근가능
		System.out.println("부모의 field 접근"+s3); //public 같은패키지는 접근가능
		
		f1();
		//추상class는 객체생성 불가
		//Parent p = new Parent();
		//System.out.println(p.a);
		//System.out.println(p.s1);
		//System.out.println(p.s2);
		//System.out.println(p.s3);
		//p.f1();
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}