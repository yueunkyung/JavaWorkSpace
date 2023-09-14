package com.shinhan.day05;

public class Account {
//	1.field...data저장목적
	public String accNo;
	public int balance;

//	2.생성자..data값 초기화 목적
//	매개변수 이름과 멤버변수 이름 충돌, this 사용해서 구분한다. this 현재객체를 의미
	public Account(String accNo, int balance) {
		this.accNo = accNo;
		this.balance = balance;
		System.out.println(accNo + "계좌가 개설되었습니다.");
		System.out.println(accNo + "계좌의 잔고는 " + balance + "원입니다.");
	}

	void deposit(int amount) {
		balance += amount;
		print("입금", amount);
	}

	void withdraw(int amount) {
		balance -= amount;
		print("출금", amount);
	}

	int getBalance() {
		return balance;
	}

	String getAccNo() {
		return accNo;
	}

	// 함수정의 필수조건 : returnType 함수이름()
	void display() {
		System.out.println("메서드만들기");
		System.out.println("메서드만들기");
		System.out.println("메서드만들기");
		return; //생략가능				
	}
	int display2(int a, int b) {
		System.out.println("메서드만들기");
		System.out.println("메서드만들기");
		System.out.println("메서드만들기");
		return a+b; //필수				
	}

	void print(String message, int amount) {
		System.out.println(accNo + " 계좌에" + amount + " 원이" + message + "되었습니다.");
		System.out.println(accNo + "계좌의 잔고는 " + balance + "원입니다.");

	}
}
