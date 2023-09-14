package com.shinhan.day04;

import java.util.Arrays;

//명령행 매개변수
//>java ArrayTest2 A B 100 200

public class ArrayTest2 {

	public static void main(String[] args) {
//		System.out.println("명령형 매개변수 --파라미터갯수 : "+args.length);
		System.out.println("command parameter : "+args.length);
		
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.valueOf(args[1]); //auto unboxing
		//Integer -> int //unboxing
		//ing -> Integer //boxing new Integer(int)
		System.out.println(su1 + su2);
		
	}

	private static void f3() {
		//원본
		int[] arr = { 100, 90, 80, 99 };
		int[] arr2 = Arrays.copyOf(arr, arr.length); //값을 복사
		int[] arr3 = arr; //주소의 복사(할당)
		arr3[0] = -1;
		arr2[0] = -2;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
	}

	private static void f2() {
		int[] arr = { 100, 90, 80, 99 };
		int[] arr2 = new int[10];
		
		System.arraycopy(arr, 0, arr2, 2, arr.length); //(원본, 원본시작위치, 타겟, 타겟시작위치, 갯수)
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
	
	//직접복사, 원본을 읽어서 타겟에 저장하기
	private static void f1() {
		int[] arr = { 100, 90, 80, 99 };
		int[] arr2 = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
