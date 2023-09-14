package com.shinhan.day13;

//공유영역(critical section)
//동기화처리가 필요
// 1)method의 선언부에 synchronized
// 2)synchronized block
public class BathRoom {
	boolean isFirst = true;

	public void use(String customer) {
		synchronized (this) {
			String s = "aaa";

			if(isFirst && customer.equals("지나")) {
				isFirst = false;
				try {
					wait(); //synchronized인 경우만 가능, 일시정지 상태로 간다.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(customer + " 입장");
			System.out.println(customer + " 사용");
			System.out.println(customer + " 퇴장");
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println();
			notifyAll(); //wait()에 의해 일시정지 상태를 해제해준다.(실행대기상태로 간다.)
		}
	}
	/*
	public synchronized void use(String customer) {
		System.out.println(customer + " 입장");
		System.out.println(customer + " 사용");
		System.out.println(customer + " 퇴장");
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
	}
	*/
}
