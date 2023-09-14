package com.shinhan.day07;

import java.sql.Date;

public class Account {
	
	private String accNo;
	private String owner;
	private int balance;
	
	public Account() {
	}
	
	public Account(String accNo, String owner, int balance) {
		super();
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE || balance>MAX_BALANCE){
			System.out.println("음수이거나 최대금액보다 커서 입금실패");
			 return;
		}
		this.balance = balance;
	}
	
	void print() {
		System.out.println("최소잔고:"+ MIN_BALANCE);
		System.out.println("최대잔고"+ MAX_BALANCE);
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	

}
