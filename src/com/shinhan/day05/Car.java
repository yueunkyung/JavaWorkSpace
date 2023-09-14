package com.shinhan.day05;


//class : object를 만드는 틀(설계도), template, 불어빵틀
//		  속성(변수,field) + 행위 (동작method)
//object : class를 이용해서 만든 독립된 실체(instance)

public class Car extends Object {
	// 1. field
	String model;
	int price;
	// 2. 생성자(Constructor)메서드..객체생성시 자동호출,
	//	  정의 안하면 컴파일시에 default 생성자가 만들어진다.
	//	  default 생성자 : argument없는 생성자
	//생성자의 이름은 반드시 class 이름과 반드시 같아야 한다.
	//생성자를 추가하면 default 생성자가 자동생성안됨.
	//이름은 같고 매개변수 다른 생성자가 여러개 가능(overloading)
	Car(){
		//super();
		this("", 0);
		System.out.println("car의 생성자!!!");
	}
	Car(String m, int p){
		super();
		System.out.println("car의 생성자!!!");
		System.out.println(m+"----"+p);
		model = m;
		price = p;
	}
	// 3. 일반매서드
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	
	// 4. block(행위문장들)
	// 5. inner class
}
