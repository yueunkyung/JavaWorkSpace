package com.shinhan.day12.thread;

public class ThreadTest2 {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		Account acc1 = new Account("12345", "이몽룡", 2000);
		Account acc2 = new Account("45454", "성춘향", 1000);
		SharedArea share = new SharedArea(acc1, acc2);
		Thread t1 = new TransferThread(share);
		Thread t2 = new PrintThread(share);
		t1.start();
		t2.start();
		System.out.println("main end");
	}

}
