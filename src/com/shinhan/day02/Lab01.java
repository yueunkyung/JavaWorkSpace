package com.shinhan.day02;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
//		q1();
		q2();

	}

	private static void q2() {
		
		
	}

	private static void q1() {		
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요. :");
		int startNum = sc.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요. :");
		int endNum = sc.nextInt();
		System.out.print("증가분을 정수로 입력하세요. :");
		int increment = sc.nextInt();
		int total = 0;
		for(int su=startNum; su<=endNum; su+=increment) {
			total += su;
		}
		if(total>1000) total+=2000;
		System.out.println("총합은 "+total);
		
		sc.close();
		
	}

}
