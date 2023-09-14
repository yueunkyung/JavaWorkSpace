package com.shinhan.day07.inheritence;

public class Account {

	private String accNo;
	private String owner;
	private int balance;

	//default 생성자
	public Account() {}
	
	public Account(String accNo, String owner, int balance) {
		super(); // ==> Object
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	protected void deposit(int amount) {
		balance += amount;
	}
	//public:모든 패키지에서 접근가능
	//protected:같은패키지에서만 접근가능, 다른패키지에서는 상속받은 경우만 가능
	//생략:같은패키지에서만 접근가능
	//private:같은 class에서만 접근가능
	protected int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("잔액부족");
			return 0;
		}
		balance -= amount;
		return amount;
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
