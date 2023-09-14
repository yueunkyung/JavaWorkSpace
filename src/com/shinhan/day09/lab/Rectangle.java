package com.shinhan.day09.lab;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;

	public Rectangle(int width, int height) {
		super(3); // 명시적으로 부모의 생성자를 호출
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}

	@Override
	public void resize(double s) {
		width = width * s; 
		height = height * s;
	}

}
