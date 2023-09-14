package com.shinhan.day09;

// interface 구현 class : interface에서 정의한 추상메서드를 반드시 구현할 의무가 있다.
//interface 구현 class : 다중구현 가능
public class Audio implements RemoteController, RemoteController2 {
	int channel;
	public Audio(){}
	
	@Override
	public void powerOn() {
		System.out.println(COLOR+"----"+COLOR2);
		System.out.println(getClass().getSimpleName()+"전원켠다");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+"전원끈다");		
	}

	@Override
	public void print() {
		System.out.println("RemoteController2에 있는 추상을 구현한 print");
	}

	@Override
	public void print2() {
		System.out.println("RemoteController2에 있는 추상을 구현한 print2");
	}

}
