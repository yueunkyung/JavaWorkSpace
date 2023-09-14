package com.shinhan.day08;

import com.shinhan.day07.inheritence.Account;

public class CheckingAccount extends Account {

	String cardNo; // 카드번호추가

	public CheckingAccount() {
		//default 생성자
	}

	public CheckingAccount(String accNo, String owner, int balance, String cardNo) {
		// super(); 부모의 생성자를 호출
		//명시적으로 부모의 생성자를 호출(부모가 field를 초기화)
		super(accNo, owner, balance); // ==> Account
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) {
		if(cardNo.equals(this.cardNo)) {
			return withdraw(amount);
		} else {
			System.out.println("카드번호 불일치. 출금불가");
			return 0;
		}
	}

}
