package com.shinhan.day09;

public class TV2 implements Remocon {

	public static void main(String[] args) {
		Remocon r = new TV2();
		r.powerOn();
	}

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");

	}
}