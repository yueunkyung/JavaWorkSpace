package com.shinhan.day08;

// abstract class : 이 class안에 추상메서드가 0개 이상있다.
// abstract class는 new Tire()와 같이 instance생성은 불가하다.
public abstract class Tire {
	String color;

	public Tire(String color) {
		this.color = color;
	}

	// 자식에서 반드시 재정의할 예정이다.
	// 구현할 필요가 없다.
	// 정의는 있고 구현은 없다.
	// class안에 추상 메서드가 존재하면 class는 반드시 추상 class이어야 한다.
	public abstract void roll();
	
	public void show() {
		System.out.println("구현된 일반메서드");
	}
	
}
