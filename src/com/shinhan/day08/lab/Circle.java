package com.shinhan.day08.lab;

public class Circle extends Shape {

	private int radius;
	double Perimeter;

	public Circle(String color, int radius) {
		super(color, "Circle");
		this.radius = radius;
		// this.getClass().getSimpleName() => Circle
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		Perimeter = 2 * radius * Math.PI;
		return Perimeter;
	}

}
