package com.shinhan.day11;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (NotExistIDException e) {
			e.print();
			e.print("****NotExistIDException********************");
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----분리선------------------------------------------------------------------");

		try {
			login("blue", "54321");
		} catch (NotExistIDException e) {
			e.print();
			e.print("****NotExistIDException********************");
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	// 강제로 Exception 발생시킨다. Exception 처리를 하지 않고 나를 부른 메서드로 떠넘기기
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		// id가 blue가 아니라면 NotExistIDException을 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIDException();
		}
		// password가 12345가 아니라면 WrongPasswordException을 발생시킴
		if (!password.equals("12345")) {
			throw new WrongPasswordException("password 오류");
		}
	}
}