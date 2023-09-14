package com.shinhan.day04;

import java.util.Arrays;

public class LAB1 {

	public static void main(String[] args) {
		int[][] arr1 = {{30, 30, 30, 30},{40, 40, 40, 40},{50, 50, 50, 50}};
		int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr3= new int[3][4];
		
		int[][] result = sub(arr1,arr3,arr3);
		System.out.println("-result-------------------");
		prn(result);	
		System.out.println("-arr1-------------------");
		prn(arr1);		
		System.out.println("-arr2-------------------");
		prn(arr2);		
		System.out.println("-arr3-------------------");
		prn(arr3);

	}
	
	public static int[][] sub(int[][] a, int[][] b, int[][] c){		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				c[row][col] = a[row][col] - b[row][col];
			}
		}
		
		return c;
	}
	
	public static void prn(int[][] twoArray) {
		for (int[] oneArray:twoArray) {
			for(int data:oneArray) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
	}
	
	private static void f2() {
		int[] arr = { 3, 24, 1, 55, 17, 43, 5 };
		System.out.println("before :" + Arrays.toString(arr));
		Arrays.sort(arr);
		
		
		System.out.println("after :"+ Arrays.toString(arr));
		
	}

	private static void f1() {
		int[] arr = { 3, 24, 1, 55, 17, 43, 5 };
		int temp;
		System.out.println("before" + Arrays.toString(arr));

		print(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 이동: 더 작은 것을 앞으로 이동하기 위해
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
		System.out.println("after" + Arrays.toString(arr));
		print(arr);
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));		
	}

	private static void print(int[] arr) {
		for (int su : arr) {
			System.out.print(su + ",");

		}
		System.out.println("----------------");

	}

}
/*
 * [배열의 내용] 3, 24, 1, 55, 17, 43, 5 [클래스 실행결과] 1, 3, 5, 17, 24, 43, 55
 * 
 */