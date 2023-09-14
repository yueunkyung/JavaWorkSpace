package com.shinhan.day04;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		f9();
	}

	private static void sol11() {
		Scanner sc = new Scanner(System.in);// 사용자의 입력를 받고자한다.
		System.out.println("학생번호>");
		int studentNum = sc.nextInt();
		sc.nextLine(); // 엔터를 버린다.
		System.out.println("이름>");
		String name = sc.nextLine();
		System.out.println("전공>");
		String major = sc.next();
		System.out.println(studentNum + ":" + name + ":" + major);
	}

	private static void f10() {
		// 학생들의 점수를 분석하는 프로그램 만들기
		boolean flag = true;
		int studentNum;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);// 사용자의 입력를 받고자한다.
		while (flag) {
			menu();
			int job = sc.nextInt();
			switch (job) {
			case 5:
				flag = false;
				break;
			case 1:
				System.out.println("학생수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2: {
				boolean result = studentNumCheck(scores);
				if (!result)
					break;
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = sc.nextInt();
				}
				break;
			}
			case 3: {
				boolean result = studentNumCheck(scores);
				if (!result)
					break;
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>%d\n", i, scores[i]);
				}
				break;
			}
			case 4: {
				boolean result = studentNumCheck(scores);
				if (!result)
					break;
				int total = 0;
				int max = -1;
				for (int i = 0; i < scores.length; i++) {
					total += scores[i];
					if (scores[i] > max)
						max = scores[i];
				}
				System.out.println("평균 점수:" + (double) total / scores.length);
				System.out.println("최고 점수:" + max);

				break;
			}
			default:
				System.out.println("job선택 다시하세요");
				break;
			}

		}
		sc.close();

	}

	private static boolean studentNumCheck(int[] scores) {
		if (scores == null) {
			System.out.println("학생수가 결정되지않음");
			return false;
		}
		return true;
	}

	private static void menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------");
		System.out.print("선택>>");

	}

	private static void f9() {
		Scanner scanner = new Scanner(System.in);
		int[] studentArr = null;

		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			int selecNum = scanner.nextInt();
			int studentNum = 0;

			if (selecNum == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (selecNum == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				studentArr = new int[studentNum];

			} else if (selecNum == 2) {
				for (int i = 0; i < studentArr.length; i++) {
					System.out.printf("score[%d]>", i);
					studentArr[i] = scanner.nextInt();
				}
			} else if (selecNum == 3) {
				for (int i = 0; i < studentArr.length; i++) {
					System.out.printf("score[%d]%d\n",i,studentArr[i]);
				}
			}else if(selecNum == 4) {
				int max = 0;
				for(int i = 0; i < studentArr.length; i++) {
					
				}
			}
		}
		scanner.close();

	}

	private static void f8() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int total = 0;
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
				cnt += j;
			}

		}
		System.out.println("전체 합은:" + total);
		System.out.println("전체 평균:" + (float) total / cnt);
	}

	private static void f7() {

		int[] array = { 1, 5, 3, 8, 2 };
		int maxNum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
		}
		System.out.println(maxNum);
	}

}
