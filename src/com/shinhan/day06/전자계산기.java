package com.shinhan.day06;

public class 전자계산기 {
	String company;
	전자계산기(){
		company = "신한";
	}
	전자계산기(String company){
		this.company = company;
	}
	int add(int...arr){
		int result = 0;
		for(int data:arr ) {
			result+=data;
		}
		return result;		
	}
	int minus(int a, int b) {
		return a-b;
	}
}
