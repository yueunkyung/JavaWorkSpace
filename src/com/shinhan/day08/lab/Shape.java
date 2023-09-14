package com.shinhan.day08.lab;

public abstract class Shape {

	private String color;
	private String type;

	public Shape() {
	}

	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	//abstract
	public abstract double calculateArea();

	//abstract
	public abstract double calculatePerimeter();

	public String toString() {
		return color + " " + type;
	}

}