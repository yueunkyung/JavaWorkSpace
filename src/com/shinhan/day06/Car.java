package com.shinhan.day06;

//class : object들을 만들기 위한 틀(template), object들의 공통사항 설계
//object : class를 이용해서 만든 독립된 객체, class를 이용해서 만든 실체(instance)
public class Car {
	// 1.field(특징, 변수, data를 저장하기 위함)
	// 	1)static : object들의 공유변수, 객체 생성없이 바로 사용가능
	//	2)non-static(멤버변수)..멤버(객체)마다 다른값을 가진다.
	static String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//변수 타입 앞에 Modifier(접근제한자와 활용방법)
	//
	static int carCount;

	// 2.constructor(생성자 메서드) : 정의 없으면 컴파일시에 class에 자동 default 생성자가 추가됨
	// default 생성자 : Car(){}
	// 생성자 추가가능, 추가하면 default 생성자 자동생성 안됨
	// overloading : 이름은 같고 매개변수 사양이 다르다.
	// this : 객체 자신을 의미, 매개변수와 멤버변수가 충돌 발생하여 구분을 위함
	public Car(String model, String color, int maxSpeed, int speed) {
		// super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		carCount++;
	}

	public Car(String model, String color) {
		// 하나의 생성자가 같은 이름의 다른 모양의 생성자를 호출, 반드시 첫번째 줄에 작성해야 한다.
		// super()를 수행하지 않는다.
		this(model, color, 200, 100);
	}

	public Car(String mode2l, String color, int maxSpeed) {
		this(mode2l, color, maxSpeed, 0);
	}

	// 3.일반메서드..기능, 메서드, 반드시 return 타입 정의되어야 한다.
	void method() {
		System.out.println("return값이 벗음을 의미한다.");
	}

	int method2() {
		return maxSpeed;
	}

	// setter, getter......get함수이름 함수이름은 field의 대문자 시작
	// JavaBeans 기술을 사용하는 곳에서 함수이름의 규칙이 중요
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		
		//this.setSpeed(10);
		//setSpeed(10);
		return "Car정보 [company=" + company
				+ ", model=" + model 
				+ ", color=" + color
				+ ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}

	//overloading : 추가
	//override : 덮어쓰기, 상속에서 부모의 메서드를 재정의
	
	//모든 class는 Object class를 상속받는다.
	//상속은 부모의 기능을 그대로 무렬받음, 변경 가능(Override, 덮어쓰기)
	//Override : 이름, 매개변수사양(개수, 타입, 리턴타입이 같아야한다.)
	//접근지정자(modifier)는 같거나 더 넓어져야한다.
	

	

}
