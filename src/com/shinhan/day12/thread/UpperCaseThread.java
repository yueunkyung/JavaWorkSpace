package com.shinhan.day12.thread;

//Multi Thread로 사용하기 위해서는 Thread를 상속받아야 한다.

public class UpperCaseThread extends Thread {
	UpperCaseThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		// A~Z출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(getName()+":"+ch);
		}
	}

}
