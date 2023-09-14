package com.shinhan.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LAB {

	public static void main(String[] args) throws FileNotFoundException {
		// f1();
		f2();
	}

	private static void f2() throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/shinhan/day05/input4_총.txt"));
		Scanner sc = new Scanner(System.in);
		/*
		 * String word;
		 * 
		 * while(sc.hasNext()) { word = sc.next(); System.out.println(word); }
		 */

		int testcase;
		testcase = sc.nextInt();

		for (int i = 1; i <= testcase; i++) {
			int row, col;
			row = sc.nextInt();
			col = sc.nextInt();
			
			char[][] arr = new char[row][col];

			// file 읽기, 배열 저장
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					arr[j][k] = sc.next().charAt(0);
					System.out.print(arr[j][k]);
				}
				// System.out.println(Arrays.toString(arr[j]));
				System.out.println();
			}

			// gun을 만나면 타켓을 찾기
			int answerN = 0;

			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					// 건을 만났을때만 동, 서, 남, 북을 search한다.
					if (arr[j][k] != 'G')
						continue; // 진행
					// 동
					for (int search = k + 1; search < col; search++) {
						if (arr[j][search] == 'W' || arr[j][search] == 'G')
							break;// 진행멈춤
						if (arr[j][search] == 'T') {
							answerN++;
							arr[j][search] = 'X';
							break;
						}
					}
					// 서
					for (int search = k - 1; search >= 0; search--) {
						if (arr[j][search] == 'W' || arr[j][search] == 'G')
							break; // 진행멈춤
						if (arr[j][search] == 'T') {
							answerN++;
							arr[j][search] = 'X';
							break;
						}
					}
					// 남
					for (int search = j + 1; search < row; search++) {
						if (arr[search][k] == 'W' || arr[search][k] == 'G')
							break; // 진행멈춤
						if (arr[search][k] == 'T') {
							answerN++;
							arr[search][k] = 'X';
							break;
						}
					}
					// 북
					for (int search = j - 1; search >= 0; search--) {
						if (arr[search][k] == 'W' || arr[search][k] == 'G')
							break; // 진행멈춤
						if (arr[search][k] == 'T') {
							answerN++;
							arr[search][k] = 'X';
							break;
						}
					}
				}
			}
			System.out.println("타겟갯수:" + answerN);
		}

		sc.close();
	}

	private static void f1() throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/shinhan/day05/input4_총.txt"));

		Scanner sc = new Scanner(System.in);

		String word;

		try { // 프로그램 실행시 Exception이 발생해도 계속 진행한다.
			while ((word = sc.next()) != null) {
				System.out.println(word);
			}
		} catch (NoSuchElementException aa) {
			// System.out.println(aa.getMessage());
		}

		sc.close();
	}

}
