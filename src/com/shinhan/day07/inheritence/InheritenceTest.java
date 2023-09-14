package com.shinhan.day07.inheritence;

public class InheritenceTest {

	public static void main(String[] args) {
		f5();

	}

	private static void f5() {
		BonusPointAccount acc2 = new BonusPointAccount("3434", "kim", 1000, 1);
		System.out.println("생성시 잔고:" + acc2.getBalance());
		acc2.deposit(2000);
		System.out.println("입금 후 잔고:" + acc2.getBalance());
		int amount = acc2.withdraw(3500);
		System.out.println("출금:" + amount);
		System.out.println("출금 후 잔고:" + acc2.getBalance());
		System.out.println("보너스 포인트:"+acc2.bonusPoint);

	}

	private static void f4() {
		Child child = new Child();
		System.out.println(child.a);
		child.method1();
		System.out.println(child.subject);
		child.show();
	}

	private static void f3() {
		CreditLineAccount acc2 = new CreditLineAccount("3434", "kim", 1000, 500);
		System.out.println("생성시 잔고:" + acc2.getBalance());
		acc2.deposit(2000);
		System.out.println("입금 후 잔고:" + acc2.getBalance());
		int amount = acc2.withdraw(3500);
		System.out.println("출금:" + amount);
		System.out.println("출금 후 잔고:" + acc2.getBalance());

	}

	private static void f2() {
		CheckingAccount acc2 = new CheckingAccount("3434", "kim", 1000, "333");
		System.out.println("생성시 잔고:" + acc2.getBalance());
		acc2.deposit(2000);
		System.out.println("입금 후 잔고:" + acc2.getBalance());
		int amount = acc2.withdraw(200);
		System.out.println("출금:" + amount);
		System.out.println("출금 후 잔고:" + acc2.getBalance());

		amount = acc2.pay("333", 300);
		System.out.println("카드출금 금액:" + amount);
		System.out.println("카드출금후 잔고:" + acc2.getBalance());

	}

	private static void f1() {
		Account acc = new Account();
		Account acc2 = new Account("112", "jin", 1000);
		System.out.println("생성시 잔고:" + acc2.getBalance());
		acc2.deposit(2000);
		System.out.println("입금 후 잔고:" + acc2.getBalance());
		int amount = acc2.withdraw(200);
		System.out.println("출금:" + amount);
		System.out.println("출금 후 잔고:" + acc2.getBalance());

	}

}
