package com.shinhan.day08;

import com.shinhan.day07.inheritence.Account;

class Animal {
	String name;

	Animal() {
	}

	Animal(String name) {
		this.name = name;
	}
}

class Cat extends Animal {
	String color;
	//Cat(){}
	Cat(String name, String color){
		super(name);
		this.color = color;
	}
}

class Dog extends Animal {
	String color2;
	//Dog(){}
	Dog(String name, String color2){
		super(name);
		this.color2 = color2;
	}
}

public class CastingTest {

	public static void main(String[] args) {
		// f1();
		// f2();
		// f3();
		f4();
	}
	
	private static void f4() {
		//Animal ani = new Animal();
		Animal ani = f5();
		
		System.out.println(ani instanceof Animal);
		System.out.println(ani instanceof Dog);
		System.out.println(ani instanceof Cat);
		
		System.out.println(ani.name);
		if(ani instanceof Cat) {
			Cat cat = (Cat)ani;
			System.out.println(cat.color);			
		} 
		if(ani instanceof Dog) {
			Dog dog = (Dog)ani;
			System.out.println(dog.color2);			
		}
		
	}

	private static Cat f5() {
		return new Cat("야옹이", "흰색");
	}

	private static void show(Animal ani) {// 자동형변환
		System.out.println("animal 정보입니다.");
		System.out.println("name:" + ani.name);
		
		//강제형변환 : 실제 instance가 자신의 class로만 casting 가능하다.
		if(ani instanceof Cat) {
			Cat cat = (Cat)ani;
			System.out.println("color:" + cat.color);			
		}
		//instanceof연산자는 ani가 Dog의 instance 인가??
		System.out.println(ani instanceof Dog);
		if(ani instanceof Dog) {
			Dog dog = (Dog)ani;
			System.out.println("color:" + dog.color2);			
		}		
		
		System.out.println("--------------------");
	}

	private static void f3() {
		Animal ani = new Animal();
		Cat cat = new Cat("야옹이", "white");
		Dog dog = new Dog("멍멍이","yellow");

		show(ani);
		show(cat);
		show(dog);
	}

	private static void f2() {
		// 객체의 형변환
		// 1.자동형변환 : 부모타입의 변수 = 자식의 객체
		Account acc = new CheckingAccount();
		// 2.강제형변환 : 자식타입의 변수 = (자식타입) 부모의 객체
		CheckingAccount acc2 = (CheckingAccount) new Account();
	}

	private static void f1() {
		// 형변환
		// 1.자동형변환 : 큰타입의 변수 = 작은타입의 값
		int a; // 4byte
		byte b = 127; // 1byte
		a = b;

		// 2.강제형변환 : 작은 타입의 변수 = (작은타입)큰 타입의 값
		b = (byte) a;

	}

}
