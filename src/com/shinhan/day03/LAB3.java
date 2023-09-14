package com.shinhan.day03;

public class LAB3 {

	public static void main(String[] args) {
		int result = sum(1,2);	//반환값이 있는 경우
		System.out.println(result);
		
		String result2 = add(10,20,30);
		System.out.println(result2);
		
		double result3 = divide(10,3);
		System.out.println(result3);
	}

	private static double divide(int i, int j) {
		return i/j;
	}

	private static String add(int i, int j, int k) {
		return i+j+k+"";
	}

	private static int sum(int i, int j) {
		return i+j;
	}

}
