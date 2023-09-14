package com.shinhan.day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 기지국 {
	//for => if
	public static void main(String[] args) throws FileNotFoundException {
		f1();
	}

	private static void f1() throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/shinhan/day07/input_기지국.txt"));
		Scanner sc = new Scanner(System.in);
		int aaa = sc.nextInt();
		for (int aaaa = 0; aaaa < aaa; aaaa++) {
			int arr_n = sc.nextInt();
			char arr[][] = new char[arr_n][arr_n];

			for (int i = 0; i < arr_n; i++) {
				for (int j = 0; j < arr_n; j++) {
					char data = sc.next().charAt(0);
					arr[i][j] = data;
				}
			}

			for (int i = 0; i < arr_n; i++) {
				for (int j = 0; j < arr_n; j++) {
					switch (arr[i][j]) {
					case 'C':
						if_def(3, arr, i, j, arr_n);
					case 'B':
						if_def(2, arr, i, j, arr_n);
					case 'A':
						if_def(1, arr, i, j, arr_n);
						break;
					}
				}
			}
			int cover = 0;
			for (char arr_a[] : arr) {
				for (char data : arr_a) {
					if (data == 'H') {
						cover += 1;
					}
				}
			}
			System.out.printf("#%d %d\n", aaaa + 1, cover);
		}
	}

	private static void if_def(int n, char arr[][], int i, int j, int arr_n) {
		if (j + n < arr_n && arr[i][j + n] == 'H') {
			arr[i][j + n] = 'X';
		}
		if (j - n >= 0 && arr[i][j - n] == 'H') {
			arr[i][j - n] = 'X';
		}
		if (i + n < arr_n && arr[i + n][j] == 'H') {
			arr[i + n][j] = 'X';
		}
		if (i - n >= 0 && arr[i - n][j] == 'H') {
			arr[i - n][j] = 'X';
		}
	}

}