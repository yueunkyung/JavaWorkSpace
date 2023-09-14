package com.shinhan.day12.thread;

public class TreadTest1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "thread(흐름) 프로그램 시작");

		//Thread 상속받은 경우
		UpperCaseThread t1 = new UpperCaseThread("대문자쓰레드");
		DigitThread t2 = new DigitThread("숫자쓰레드");
		
		
		//Runnable을 구현한 경우
		Thread t3 = new Thread(new LowerCaseThread());
		Thread t4 = new Thread(new DigitRunnableImpl("숫자쓰레드2"));
		
		//익명
		Thread t5 = new Thread() {
			public void run() {
				for (int i=1;i<=10;i++) {
					System.out.println("*");					
				}
			}
		};
		
		//Thread 시작
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		(new Thread() {
			public void run() {
				for (int i=1;i<=10;i++) {
					System.out.println("#");
				}
			}
		}).start();
		
		System.out.println(Thread.currentThread().getName() + "thread(흐름) 프로그램 종료");
	}
	
	public static void f1() {
		System.out.println(Thread.currentThread().getName() + "thread(흐름) 프로그램 시작");
		
		//MultiThread 사용하기 (흐름을 여러개로 만든다)
		UpperCaseThread t1 = new UpperCaseThread("대문자1");
		UpperCaseThread t3 = new UpperCaseThread("대문자2");
		LowerCaseThread aa = new LowerCaseThread();
	
		Thread t2 = new Thread(aa);
		
		t1.start(); //run() 메서드가 수행된다.
		t2.start();
		t3.start();
		
		System.out.println(Thread.currentThread().getName() + "thread(흐름) 프로그램 종료");
	}

}
