package com.shinhan.day08.inheritence;

public class Parent {
	public String nation;

	public Parent() {
		this("대한민국"); //super() 수행안함
		System.out.println("2...Parent() call");
	}

	public Parent(String nation) {
		//super() 수행
		this.nation = nation;
		System.out.println("1...Parent(String nation) call");
	}
}