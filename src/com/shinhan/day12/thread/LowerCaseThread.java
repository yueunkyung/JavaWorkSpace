package com.shinhan.day12.thread;

//Multi Thread로 사용하기 위해서는 Thread를 상속받아야 한다.
//public class LowerCaseThread extends Thread {
//이미 부모 class를 상속받고 있다면 다중 상속이 안되므로 Thread를 상속 받을 수 없다.
//Runnable interface를 구현한다.
//run() 메서드 추상으로 정의되어 있으므로 구현한다.
public class LowerCaseThread extends Object implements Runnable {
	@Override
	public void run() {
		// a~z출력
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(Thread.currentThread().getName()+":"+ch);
		}
	}

}
