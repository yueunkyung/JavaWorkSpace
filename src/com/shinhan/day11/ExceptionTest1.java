package com.shinhan.day11;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//예외처리를 내가 한다 : try~catch
		try {
			f6();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.print();			
			e.printStackTrace();
		}
		System.out.println("=====END=================");
	}
	
	//throws: 예외 발생하면 이 함수를 부른 곳으로 던진다.
	public static void f6() throws MyException {
		String subject = "자바";
		if(!subject.equals("자바")) {
			//throw: 강제로 예외 발생시킨다.
			throw new MyException("자바만 가능~~~", subject);
		}
	}
	
//479page 사용자 정의 예외 설명
/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수입력>>");
		int su = sc.nextInt();
		
		//예외: 자동발생, 강제발생
		//강제로 Exception 발생시키기, 처리하지 않으면 프로그램 중단
		try {
			if(su%2!=0)	throw new RuntimeException("짝수만 가능");
		} catch(RuntimeException aa) {
			System.out.println(aa.getMessage());
		}
		System.out.println("======END======");		
	}
*/

//Chapter 확인문제 6번
/*
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println("반드시수행: "+value);
			}
		}
	}
*/
	
//Chapter 확인문제 5번
/*
	public static void main(String[] args) {
		try {
			new ExceptionTest1().method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("=============프로그램종료===============");
	}

	public void method1() throws ClassNotFoundException {// throws NumberFormatException, ClassNotFoundException {
		// Exception(예외) : 프로그래머의 노력으로 복구가능한 오류
		// 예외 발생하면 프로그램중단, 중단없이 계속 진행하도록 한다. -> 예외처리
		// 1.실행시(unchecked exception) : Runtime Exception
		// 2.컴파일시(checked exception) : 반드시 해결해야 한다.
		// 	1)내가한다.(try~catch~finally)
		// 	2)떠넘긴다.(throws~) ...프로그램이 중단된다.

		// String score = "100점";
		String score = "100";
		int iscore = Integer.parseInt(score);
		System.out.println(iscore + 200);

		Class.forName("com.shinhan.day10.Person");
	}
*/
}
