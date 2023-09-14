package com.shinhan.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//기지국 문제
public class BaseStation {

	public static void main(String[] args) throws FileNotFoundException {
		tset1();

	}

	private static void tset1() throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/shinhan/day05/input_기지국.txt"));
		Scanner scanner = new Scanner(System.in);
		int testcase;
		testcase = scanner.nextInt();

		for (int i = 1; i <= testcase; i++) {
			int loopCnt = scanner.nextInt();
			int homeCnt = 0;
			int row = loopCnt;
			int col = loopCnt;

			char[][] arr = new char[row][col];

			// file 읽기, 배열 저장
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					arr[j][k] = scanner.next().charAt(0);
					// System.out.print(arr[j][k]);
					if (arr[j][k] == 'H') {
						homeCnt++;
					}
				}
			}
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {

					switch (arr[j][k]) {
					case 'C':
						homeCnt = runCountTarget(3, arr, j, k, col, row, homeCnt);
					case 'B':
						homeCnt = runCountTarget(2, arr, j, k, col, row, homeCnt);
					case 'A':
						homeCnt = runCountTarget(1, arr, j, k, col, row, homeCnt);
						break;
					}

				}
			}
			System.out.printf("case %d => %d\n", i, homeCnt);
		}

		scanner.close();
	}

	private static int runCountTarget(int moveCnt, char[][] arr, int j, int k, int col, int row, int homeCnt) {
		// 동
		if (k + moveCnt < col && arr[j][k + moveCnt] == 'H') {
			arr[j][k + moveCnt] = 'X';
			homeCnt--;
		}
		// 서
		if (k - moveCnt >= 0 && arr[j][k - moveCnt] == 'H') {
			arr[j][k - moveCnt] = 'X';
			homeCnt--;
		}
		// 남
		if (j + moveCnt < row && arr[j + moveCnt][k] == 'H') {
			arr[j + moveCnt][k] = 'X';
			homeCnt--;
		}
		// 북
		if (j - moveCnt >= 0 && arr[j - moveCnt][k] == 'H') {
			arr[j - moveCnt][k] = 'X';
			homeCnt--;
		}
		return homeCnt;
	}
}