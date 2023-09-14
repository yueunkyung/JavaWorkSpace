package com.shinhan.day07.inheritence;

public class CreditLineAccount extends Account {
	int creditLine;

	public CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance); // 부모생성자호출..부모가 초기화
		this.creditLine = creditLine; // 내가 초기화
	}

	// 부모가 정의된 메서드를 자식이 재정의(덮어쓰기)
	@Override
	public int withdraw(int amount) {
		if (getBalance() + creditLine < amount) {
			System.out.println("잔액부족");
			return 0;
		}
		setBalance(getBalance() - amount);
		return amount;
	}

}
