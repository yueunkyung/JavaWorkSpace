package com.shinhan.day06;

public class Coffee {
	//1.field : static(객체들의 공유변수, 객체 생성과 무관), non-static(객체마다 갖는 변수)
	static String brand="noBrand";
	String name;
	int price;
	//2.constructor	
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("new수행시마사 실행2$$$$$");
	}
	
	//3.method
	void memberMethod(){
		System.out.println(name+"객체 메서드");
		//non-static이 static 접근가능
		staticMethod();
		brand = "ㅊㅊ";
	}
	static void staticMethod(){
		System.out.println("class메서드");
		
		// static에서 non-static 사용불가
		// name= "아메리카노"
		// memberMethod();
		// 객체 생성 후 사용 가능
		//new Coffee("", 1000).memberMethod();
	}
	//4.block
	{
		System.out.println("new수행시마사 실행1!!!!!");
	}
	static {
		brand = "스타벅스";
		System.out.println(brand + "----------");
	}
	//5.inner class
}
