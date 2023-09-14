package com.shinhan.day08;

public class Child2 extends Parent2 {
	public int studentNo;

	public Child2(String name, int studentNo) {
		// 자동으로 default 생성자를 부르고 있다.
		// super();
		// 방법2. 명시적으로 부모의 생성자를 호출
		super(name);
		//this.name = name;
		this.studentNo = studentNo;
	}
}