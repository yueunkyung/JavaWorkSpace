package com.shinhan.day05;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account("078-3762-293", 1000000);
		acc.deposit(2000000);
		acc.withdraw(500000);

		String aa = acc.getAccNo();
		int bal = acc.getBalance();

	}

}

/*
 * [TestAccount 실행결과]		   
 * 078-3762-293 계좌가 개설되었습니다.
 * 078-3762-293 계좌의 잔고는 1000000원입니다.
 * 078-3762-293 계좌에 2000000원이 입금되었습니다.
 * 078-3762-293 계좌의 잔고는 3000000원입니다.
 * 078-3762-293 계좌에 500000원이 출금되었습니다.
 * 078-3762-293 계좌의 잔고는 3500000원입니다.
 */