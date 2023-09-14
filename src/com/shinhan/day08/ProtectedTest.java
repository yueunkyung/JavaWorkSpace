package com.shinhan.day08;

import com.shinhan.day07.inheritence.Account;

public class ProtectedTest extends Account {
	void test(){
		deposit(1000);
		withdraw(100);
		
		CheckingAccount acc = new CheckingAccount("1123","둘리",1000,"333");
		// acc.deposit(100); //불가
		// acc.withdraw(10); //불가
	}
	
	public static void main(String[] args) {
		CheckingAccount acc = new CheckingAccount("1123","둘리",1000,"333");
		// acc.deposit(100);
		// acc.withdraw(10);
	}
}
