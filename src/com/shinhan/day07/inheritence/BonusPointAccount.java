package com.shinhan.day07.inheritence;

public class BonusPointAccount extends Account {
	int bonusPoint;

	public BonusPointAccount(String accNo, String owner, int balance, int bonusPoint) {
		super(accNo, owner, balance);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void deposit(int amount) {
		super.deposit(amount); //부모의 메서드 호출
		bonusPoint += amount*0.001;
	}

}
