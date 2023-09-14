package com.shinhan.day06;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		int result;
		result = com.sum(1, 2);
		System.out.println(result);
		result = com.sum(1, 2, 3);
		System.out.println(result);
		result=com.sum(1, 2, 3,4,5,6,7,8,9,10);
		System.out.println(result);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};		
		//String result2 = com.sum(arr, "합계");
		String result2 = com.sum(new int[] {1,2,3,4,5,6,7,8,9,10}, "합계");
		System.out.println(result2);
	}
}
