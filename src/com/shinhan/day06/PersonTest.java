package com.shinhan.day06;

public class PersonTest {

	public static void main(String[] args) {

		// 객체 생성없이 static 변수 접근
		System.out.println(Person.numberOfPersons + "명");
		// static method 호출
		System.out.println(Person.getPopulation() + "명");
		Person[] ps = new Person[5];
		Person[] ps2 = { new Person(), new Person(), new Person(20, "김길동"), new Person(20, "박길동") };

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(20, "김길동");
		Person p4 = new Person(20, "박길동");

		p1.selfIntroduce();
		p2.selfIntroduce();
		p3.selfIntroduce();
		p4.selfIntroduce();

		System.out.println(Person.numberOfPersons + "명");
		System.out.println(Person.getPopulation() + "명");

		//static은 객체 생성없이 사용이 가능하다.		
		System.out.println(Math.PI);
		System.out.println(Math.random());
		System.out.println(Math.max(10, 20));
	}

}
