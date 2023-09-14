package com.shinhan.day08;

public class HankookTire extends Tire {
	String company = "한국";
	public HankookTire(String color) {
		super(color);		
	}
	
	//Override
	public void roll() {
		System.out.println(company+"!!성능최고!!");
		System.out.println("******************");
	}
	
}
