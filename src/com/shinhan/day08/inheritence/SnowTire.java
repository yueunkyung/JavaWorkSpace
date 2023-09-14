package com.shinhan.day08.inheritence;

public class SnowTire extends Tire {
	int color=255;
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}