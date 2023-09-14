package com.shinhan.day05;

//class:object들의 틀(template)
public class Student extends Object {
	// 1.field(멤버변수)
	private String name;
	private int age;
	private String major;

	// 2.constructor
	// 생성시 자동호출, 정의 없으면 컴파일러가 default 생성자 추가한다.
	// field값이 자동 초기화된다.
	// 생성자의 목적은 초기화
	// default생성자: argument가 없다.
	// 생성자는 class이름과 같아야한다.
	// overloading : 이름같고 매개변수가 다르다.
	// return 값을 가질 수 없다.
	Student() {
		System.out.println("default생성자...학생추가됨");
	}

	// 변수는 의미있는 단어를 사용한다.
	// 매개변수 이름과 멤버변수(field) 이름이 충돌 : this 객체자신
	Student(String name, int age, String major) {
		System.out.println("파라메터값을 field에 초기화");
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	// 3.method : class를 이용해서 만든 객체들이 공유할 기능
	// return type을 반드시 정의한다.
	// 매개변수는 있거나 없거나 가능
	void display(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("전공: "+major);
	}
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}
	void setMajor(String major){
		this.major = major;
	}
		
}
