package com.shinhan.day09;

// interface 구현 class : interface에서 정의한 추상메서드를 반드시 구현할 의무가 있다.
public class Television extends Object implements RemoteController {
	int channel;

	public Television(int channel) {
		this.channel = channel;
	}

	@Override
	public void powerOn() {
		System.out.println(COLOR + "----" + COLOR2);
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원끈다");
	}

	@Override
	public void show() {
		RemoteController.super.show(); // 부모꺼를 실행
		System.out.println("Television이 default 메서드를 재정의함");
	}

	public void show2() {
		System.out.println("television class가 구현한 일반 메서드");
	}

}
