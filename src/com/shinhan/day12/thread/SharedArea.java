package com.shinhan.day12.thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SharedArea {
	Account lee; // 이몽룡의 계좌
	Account sung; // 성춘향의 계좌

	// Modifier의 활용방법 : synchronized
	// synchronized(공유영역){}
	public synchronized void transfer() {
		int amount = lee.withdraw(100);
		System.out.println(amount + "인출");
		sung.deposit(amount);
		System.out.println(amount + "입금");
		System.out.println("---------------------------------");
	}

	public synchronized void print() {
		synchronized (this) {
			int balance1 = lee.balance;
			int balance2 = sung.balance;
			System.out.println("잔고합" + (balance1 + balance2));
		}
	}

}
