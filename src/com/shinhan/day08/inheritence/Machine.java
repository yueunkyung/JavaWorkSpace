package com.shinhan.day08.inheritence;

//abstract class : 이 클래스 안에 추상메서드가 있다.
public abstract class Machine {
	public void powerOn() {
	}

	public void powerOff() {
	}
	//추상메서드 : 정의는 있고 구현{}은 없다. 반드시 자식이 구현한다.
	public abstract void work();
}