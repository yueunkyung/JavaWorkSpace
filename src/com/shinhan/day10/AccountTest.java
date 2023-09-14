package com.shinhan.day10;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account("12345", "김", 1000);
		System.out.println(acc);
		System.out.println(acc.getOwner());
		acc.setBalance(2000);
		System.out.println(acc);

	}

}
