package com.shinhan.day03;

import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {

//		f2();
//		lastday2(2023, 2);
		System.out.println(numDays(2000,4));
		System.out.println(numDays(2000,2));
		System.out.println(numDays(2000,1));
		int result =numDays(2000,13);
		System.out.println(result==-1?"":result);
	}

	private static int numDays(int year,int month) {
		
		int day = 28;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
			break;
		case 4, 6, 9, 11:
			day = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				day = 29;
			break;
		default: {
			System.out.println("잘못된 월입니다.");
			return -1;
		}
		}
		return day;
		/*
		if(month<1 || month>12) {
			System.out.println(month+"월은 존재하지 않습니다. 다시 입력하세요.");
			return;
		}
		switch (month) {
		case 4,6,9,11:
			System.out.println("30");
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31");	
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("29");
				break;
			}
			System.out.println("28");
			break;

		default:
			break;
		}
		*/
	}

	private static void lastday2(int year, int month) {
		// 주어진 년도의 말일 출력하기 ..윤년의 2월 말일은 29, 평년은 28일이다.
		// 1) 4의 배수인 해는 윤년.
		// 2) 4의 배수이면서 100의 배수인 해는 윤년이 아님.
		// 3) 100의 배수이면서 400의 배수인 해는 윤년.
		int day = 28;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
			break;
		case 4, 6, 9, 11:
			day = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				day = 29;
			break;
		default: {
			System.out.println("잘못된 월입니다.");
			return;
		}
		}

		System.out.printf("%d년 %d월의 말일은 %d입니다.", year, month, day);

	}

	private static void lastday(int year, int month) {
		// 주어진 년도의 말일 출력하기 ..윤년의 2월 말일은 29, 평년은 28일이다.
		// 1) 4의 배수인 해는 윤년.
		// 2) 4의 배수이면서 100의 배수인 해는 윤년이 아님.
		// 3) 100의 배수이면서 400의 배수인 해는 윤년.
		int day = 28;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
		case 4, 6, 9, 11 -> day = 30;
		case 2 -> {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				day = 29;
		}
		default -> {
			System.out.println("잘못된 월입니다.");
			return;
		}
		}

		System.out.printf("%d년 %d월의 말일은 %d입니다.", year, month, day);

	}

	private static void test06() {
		int number = 1, total = 1, count = 1;
		while (true) {
			if (count == 15)
				break;
			number += count;
			count++;
			total += number;
		}
		System.out.printf("%d번째까지의 합 : %d\n", count, total);
	}

	public static void test05() {
		int plus = 0;
		int sum = 1;
		int total = 0;
		for (int i = 1; i <= 15; i++) {
			sum += plus;
			total += sum;
			plus++;
		}
		System.out.printf("15번째까지의 합 : %d", total);
	}

	private static void f7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.close();

		int cnt = 1000 / num;
		int sum = ((num * cnt) * (cnt + 1)) / 2;
//		int sum = 0;
//		for(int i = num; i <= 1000; i+=num) {
//			sum += i;
//		}
		System.out.printf("7의 배수 개수 = %d\n", cnt);
		System.out.printf("7의 배수 합 = %d\n", sum);
	}

	private static void f6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int total = 0, count = 0;
		for (int i = num; i <= 1000; i += num) {
			total += i;
			count += 1;
		}
		System.out.printf("%d의 배수 개수 = %d\n", num, count);
		System.out.printf("%d의 배수 합 = %d\n", num, total);

	}

	private static void f5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % a == 0) {
				cnt++;
				sum += i;
			}
		}
		System.out.println("7의 배수 개수 : " + cnt);
		System.out.println("7의 배수 합 : " + sum);

	}

	private static void f4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int su = sc.nextInt();
		if (su < 2 || su > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			sc.close();
			System.exit(0);
		}
		for (int i = 1; i <= su; i++) {
			int ans = 1;
			for (int j = 1; j <= i; j++) {
				ans *= j;
				System.out.printf(i == j ? "" : "%d * ", j);
			}
			System.out.printf("%d ! = %d\n", i, ans);
		}

		sc.close();

	}

	private static void f3() {
		for (int su = 2; su <= 100; su++) {
			boolean isPrime = true;
			for (int i = 2; i < su; i++) {
				if (su % i == 0) {
					isPrime = false;
					break;
				}
			}
			System.out.println(isPrime ? su + "는(은) 소수입니다." : su + "는(은) 소수가 아닙니다.");
		}

	}

	private static void f2() {
		/*
		 * 문제2. 소수란 자신과 1외의 다른 수로는 나누어 떨어지지 않는 정수입니다. 아래와 같이 2~100 사이의 숫자를 입력하면 소수인지 여부를
		 * 판별하는 프로그램을 작성하십시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("2~100 사이의 숫자를 입력하세요. : ");
		int su = sc.nextInt();
		if (su < 2 || su > 100) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			sc.close();
			System.exit(0); // 프로그램이 즉시 종료.... main으로 돌아가지 않음
		}

		boolean isPrime = true;
		for (int i = 2; i < su; i++) {
			if (su % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? su + "는(은) 소수입니다." : su + "는(은) 소수가 아닙니다.");
		// 47을 입력했다면 2~46 나누어 떨어진다면 소수가 아닌것으로 판단.
	}

	private static void f1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int dan = sc.nextInt();
		if (dan < 2 || dan > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			sc.close();
			return; // 호출한 곳으로 돌아간다.
		}

		for (int gop = 1; gop <= 9; gop++) {
			System.out.printf("%d*%d=%d\n", dan, gop, dan * gop);
		}
		sc.close();
	}

}
