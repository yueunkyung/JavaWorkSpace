package com.shinhan.day09.lab;

public abstract class Shape {
	//1.field
	private int numSides;
	//2.constructor
	//public Shape() {}
	public Shape(int numSides) {
		this.numSides = numSides;
	}
	//3.일반메서드
	public int getNumSides() {
		return numSides;
	}
	//4.추상메서드(정의있고 구현없음)
	public abstract double getArea();
	public abstract double getPerimeter();
}
/*
Shape(int numSides)
getNumSides()
abstract getArea() // 넓이
abstract getPerimeter() // 둘레 길이
 */