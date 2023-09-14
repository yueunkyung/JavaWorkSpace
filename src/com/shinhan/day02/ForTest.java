package com.shinhan.day02;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		f14();

	}

	private static void f14() {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			menu();
			String selectNum = sc.nextLine();
			if(selectNum.equals("4")) break;
			
			switch(selectNum) {
			case "1" :{
				System.out.println("예금액>>");
				String amout = sc.nextLine();
				balance += Integer.parseInt(amout);
				break;
			}
			case "2" :{
				System.out.println("출금액>>");
				String amout = sc.nextLine();
				int iamount = Integer.parseInt(amout);
				if(balance < iamount) {
					System.out.println("잔고가 부족합니다. 출금불가");
				} else {
					balance -= iamount;
				}
						
				//break를 생략했으므로 아래문장으로 내려간다. 즉, 잔고가 출력된다.
			}
			case "3" :{System.out.println("잔고>>" + balance);}
			default:
				break;
			} //switch end
			
		} //while end
		
		sc.close();
		
	}

	private static void menu() {
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------");			
		System.out.println("선택>");
		
	}

	private static void f13() {
		for(int row = 1; row<=5; row++) {
			for(int col = 1; col<=6-row; col++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꾸기
		}
		
	}
	
	private static void f12() {
		for(int row = 1; row<=5; row++) {
			for(int col = 1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꾸기
		}
		
	}

	private static void f11() {
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
	}

	private static void f10() {
		//2개의 주사위 합이 5이면 중단, 아니면 계속
		while(true) {
			int dice1 = (int) (Math.random()*6 + 1);
			int dice2 = (int) (Math.random()*6 + 1);
			System.out.printf("[%d, %d]\n", dice1, dice2);
			if(dice1 + dice2 == 5 ) break;
		}
		
	}

	private static void f9() {
		//조건이 맞는동안 looping, 조건이 맞지 않으면 loop 벗어남.
		int result = 0;
		for(int su=1; su<=100; su++) {
			if(su%3 == 0) {
				result += su;
			}
		}
		System.out.println("result=" + result);
		
		result = 0;
		for(int su=0; su<=100; su+=3) {
			System.out.println(su);
			result += su;
		}
		System.out.println("result=" + result);
		
		result = (3+99) * (100/3)/2;
		System.out.println("result="+result);
		
	}

	private static void f8() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력>>");
		int score = sc.nextInt();
		String grade="F"; // A(90~), B(80~), C(70~), D(60~), F
		//변수이거나 수식
		switch (score/10) {
		case 9, 10 -> grade="A";
		case 8 -> grade="B"; 
		case 7 -> grade="C";
		case 6 -> grade="D";
		default-> System.out.println("-------");
		}
		
		System.out.println(grade + "학점");
		
	}

	private static void f7() {
		double a = 3;
		String week="monday";
		//switch의 표현식 : 정수, 문자열은 가능하나, 실수는 불가하다.
		switch (week) {
		case "monday":
			break;
		default:
			break;
		}
		
	}

	private static void f6() {
		int i = 0;
		while(true) {
			if(i>10) break; //loop빠지기, switch빠지기
			i++;
			if (i%2 == 0) continue; //아래문장을 무시하고 반복문은 계속한다.
				System.out.println(i+"반복합니다.");
				System.out.println("------------------");
			/*
			if (i%2 != 0) {
				System.out.println(i+"반복합니다.");
				System.out.println("------------------");
				
			}
			*/
		}
		System.out.println("마지막 i = " + i);
		System.out.println("f4 end");
	}
	
	
	// for문, while문, do~while문, if문
	private static void f5() {
		int i = 1;
		do {
			//if(i>10) break; //loop빠지기, switch빠지기
			System.out.println(i+"반복합니다.");
			i++;
		} while (i<=10);
		System.out.println("마지막 i = " + i);
		System.out.println("f5 end");
	}
	
	private static void f4() {
		int i = 1;
		while(i<=10) {
			//if(i>10) break; //loop빠지기, switch빠지기
			System.out.println(i+"반복합니다.");
			i++;
		}
		System.out.println("마지막 i = " + i);
		System.out.println("f4 end");
	}
	
	private static void f3() {
		int i = 1;
		for(;;) {
			if(i>10) break; //loop빠지기, switch빠지기
			System.out.println(i+"반복합니다.");
			i++;
		}
		System.out.println("마지막 i = " + i);
		System.out.println("f3 end");
	}
	
	private static void f2() {
		//for(초기값;조건문;증감치)
		//1.초기값
		//2.조건문
		//3.조건에 맞으면 {}내의 문장들 수행, 맞지 않으면 loop빠짐
		//4.증감치
		//5.2로간다.
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"반복합니다.");
		}
		System.out.println("f2 end");
	}
	
	private static void f1() {
		//for문 : 괄호안에 ;;(세미콜론)이 필수이다.
		//다음 문장은 무한 loop이다.
		for(;;) {
			System.out.println("반복합니다.");
		}
		
	}

}
