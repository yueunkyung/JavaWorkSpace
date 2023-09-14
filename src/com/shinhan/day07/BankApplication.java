package com.shinhan.day07;

import java.util.Scanner;

import ch06.sec13.exam02.package1.A;

public class BankApplication {
	static Account[] accArr = new Account[100];
	static int accIndex = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRun = true;

		while (isRun) {
			menu();
			String job = sc.nextLine();
			switch (job) {
			case "1":
				makeAccount();
				break;
			case "2":
				accountList();
				break;
			case "3":
				accountDeposit();
				break;
			case "4":
				accountWithdraw();
				break;
			case "5":
				isRun = false;
				break;
			default:
				AccountView.display("작업선택 오류.... 다시입력");
				break;
			} // switch end
		} // while end

		sc.close();
		AccountView.display("==================프로그램종료==================");
	}

	private static void accountWithdraw() {
		AccountView.display("출금할 계좌번호>>");
		String accNo = sc.nextLine();
		for (int i = 0; i < accArr.length; i++) {
			if (accArr[i] == null) {
				AccountView.display("해당 계좌가 존재하지 않습니다.");
				break;
			}
			if (accArr[i].getAccNo().equals(accNo)) {
				AccountView.display("출금금액>>");
				int amount = Integer.parseInt(sc.nextLine());
				int originalBalance = accArr[i].getBalance();
				accArr[i].setBalance(originalBalance - amount);
				break;
			}
		}

	}

	private static void accountDeposit() {
		System.out.print("입금할 계좌번호>>");
		String accNo = sc.nextLine();
		for (int i = 0; i < accArr.length; i++) {
			if (accArr[i] == null) {
				AccountView.display("해당 계좌가 존재하지 않습니다.");
				break;
			}
			if (accArr[i].getAccNo().equals(accNo)) {
				AccountView.display("입금금액>>");
				int amount = Integer.parseInt(sc.nextLine());
				int originalBalance = accArr[i].getBalance();
				accArr[i].setBalance(originalBalance + amount);
				break;
			}
		}

	}

	private static void accountList() {
		AccountView.display("=============계좌목록============");
		for (Account acc : accArr) {
			if (acc == null)
				break;
			System.out.printf("%s\t%s\td\n", acc.getAccNo(), acc.getOwner(), acc.getBalance());
		}

	}

	private static void makeAccount() {
		// TODO Auto-generated method stub
		AccountView.display("계좌번호>>");
		String accNo = sc.nextLine();
		AccountView.display("예금주>>");
		String owner = sc.nextLine();
		AccountView.display("초기입금액>>");
		int balance = Integer.parseInt(sc.nextLine());

		accArr[accIndex++] = new Account(accNo, owner, balance);
		AccountView.display("[결과] 계좌가 생성되었습니다");

	}

	private static void menu() {
		System.out.print("1.계좌생성");
		System.out.print("2.계좌목록");
		System.out.print("3.입금");
		System.out.print("4.출금");
		System.out.print("5.종료");
		System.out.println();
		System.out.print("작업선택>>");
	}

}
