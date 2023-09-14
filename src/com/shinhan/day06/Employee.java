package com.shinhan.day06;

public class Employee {

	private String name;
	private int age;
	private String dept;

	//각 클래스에는 멤버변수 값을 인자(argument)로 전달받아 
	//객체를 생성할 수 있는 생성자(Constructor)를 정의하시오
	//인자(argument) == parameter(매개변수)
	public Employee(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.println("이   름 : " + name + "    나 이 : " + age + "     부    서 : " + dept);

	}

}
