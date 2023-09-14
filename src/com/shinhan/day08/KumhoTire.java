package com.shinhan.day08;

public class KumhoTire extends Tire {
	String company = "금호";
	public KumhoTire(String color) {
		super(color);		
	}

	//Override
	public void roll() {
		System.out.println(company+"성능최고!");
		System.out.println("-----------------");
	}
	
}
