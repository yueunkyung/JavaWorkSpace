package com.shinhan.day06;

public class Person {
	//static 변수(class변수) 객체들이 공유하는 변수(share)
	static int numberOfPersons; //전체 인구 수, Person 객체가 생성될 때마다 증가
	// (non-static), 멤버변수
	int age;
	String name;
	
	//final: 1회 초기화 후 불변....초기화는 선언시 또는 생성시에 한다.
	final String major="컴공";
	final String major2;	
	
	//상수(static final): 불변....선언시 초기화한다. static block에서도 가능하다.
	static final String MAJOR3="지리정보";
	static final String MAJOR4;
	
	//class : 변수+생성자+메서드+block+innerclass
	{
		System.out.println("객체마다 실행된다.");
		System.out.println("---------------");
	}
	static {
		System.out.println("class가 memory load시 1회 수행");
		System.out.println("############");
		MAJOR4="";
	}
	
	public Person() {
		this(12, "Anonymous");
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		//final은 값 수정 불가
		//major = "음악";
		major2="음악";
		numberOfPersons++;
	}

	void selfIntroduce() {
		//final은 값 수정 불가
		//major = "화학";
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살입니다.");
	}

	public static int getPopulation() {
		return numberOfPersons;
	}
}
