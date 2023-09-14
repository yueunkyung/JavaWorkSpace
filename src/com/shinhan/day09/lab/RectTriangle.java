package com.shinhan.day09.lab;

public class RectTriangle extends Shape {
	double width;
	double height;

	public RectTriangle(int width, int height) {
		super(3); // 명시적으로 부모의 생성자를 호출
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height/2.0;
	}

	@Override
	public double getPerimeter() {
		// 빗변 = Math.sqrt(width*width+height*height)
		return width+height+ Math.sqrt(width*width+height*height);
	}

}
