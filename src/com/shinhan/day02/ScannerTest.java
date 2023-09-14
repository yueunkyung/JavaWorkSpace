package com.shinhan.day02;

import java.io.File;
import java.io.FileNotFoundException;

//java.lang패키지에 들어있는 class들은 import없이 사용한다.
//나머지는 반드시 import하고 사용한다.

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		f6();
	}

	private static void f6() throws FileNotFoundException {
		//표준입력, 키보드입력, System.in
		File myfile = new File("src/com/shinhan/day02/PrintTest.java");
		Scanner sc = new Scanner(myfile);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();		
	}

	private static void f5() {
		//변수는 기본형이 아닌 경우 반드시 new로 생성한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자입력>>");
		String v1;

		v1 = sc.nextLine();
		System.out.println("당신이 입력한 문자는=> " + v1);

		
		sc.close();
		
	}
	
	private static void f4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");

		while(sc.hasNextInt()) {
			int su = sc.nextInt();
			System.out.println(su + 100);
		}
		
		sc.close();
	}

	private static void f3() {
		//변수는 기본형이 아닌 경우 반드시 new로 생성한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력>>");
		String v1;
		
		// while : 반복, true이면 수행하고 false이면 빠지기
		while(sc.hasNext()) {
			v1 = sc.next();
			System.out.println("당신이 입력한 문자는=> " + v1);
		}
		
		sc.close();
		
	}
	
	private static void f2() {
		//변수는 기본형이 아닌 경우 반드시 new로 생성한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력>>");
		String v1 = sc.next(); //" " 공백 구분 단어만 읽는다.
		System.out.println("당신이 입력한 문자는=> " + v1);
		
		sc.close();
		
	}

	private static void f1() throws IOException {
		// 표준입력(키보드)
		InputStream is = System.in;
		int i;
		
		while((i = is.read()) != -1) {
			System.out.println((char)i);
		}
	}


}
