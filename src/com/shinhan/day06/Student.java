package com.shinhan.day06;

public class Student {
	private String name;
	private int age;
	private int id;

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println("이   름 : " + name + "    나 이 : " + age + "     학    번 : " + id);
	}

}
