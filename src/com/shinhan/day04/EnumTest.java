package com.shinhan.day04;

import java.util.Scanner;

//enum(enumerated) 열거형, 한정적인 값들의 모임, 요일(월~일), 계절(봄,여름,가을,겨울)
//로그인결과 : 성공, 실패

public class EnumTest {

	// 상수
	static final int SUCCESS = 1;
	static final int FAIL = -1;

	static final int MONDAY = 1;

	public static void main(String[] args) {
		f3();

	}
	
 	
	private static void f3() {
		LoginResult login = f4();
		//enum을 사용하면 컴파일 시전부터 잘못된 값을 사용하기 어렵다.
		if(login == LoginResult.SUCCESS) {
			System.out.println("로그인성공");
		}else if(login == LoginResult.FAIL) {
			System.out.println("로그인실패");
		}
		
	}


	private static LoginResult f4() {
		return LoginResult.FAIL;
	}


	private static void f2() {
		Week myweek = Week.FRIDAY;
		
		Week[] arr = Week.values();
		for(Week w:arr) {
			System.out.println(w+":"+w.name()+":"+w.ordinal());
		}

		if(myweek == Week.MONDAY)  {
			System.out.println("월요일입니다.");
		}
		
		switch (myweek) {
		case MONDAY:
			System.out.println("월요일");			
			break;
		case TUESDAY:
			System.out.println("화요일");			
			break;
		case WEDNESDAY:
			System.out.println("수요일");			
			break;
		case THURSDAY:
			System.out.println("목요일");			
			break;
		case FRIDAY:
			System.out.println("금요일");
			break;
		case SATURDAY:
			System.out.println("토요일");			
			break;
		case SUNDAY:
			System.out.println("일요일");			
			break;			
		default:
			break;
		}
		
	}

	private static void f1() {
		Scanner sc = new Scanner(System.in); // 자동 import ctrl+shift+o
		System.out.print("id입력>>");
		int id = sc.nextInt();
		if (id == MONDAY) {
			System.out.println("로그인성공");
		}
		
		System.out.println();

	}

}
