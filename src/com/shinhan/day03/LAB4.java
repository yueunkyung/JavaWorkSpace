package com.shinhan.day03;

public class LAB4 {

	public static void main(String[] args) {

		System.out.println(gcd2(2, 5));
		System.out.println(gcd2(5, 15));
		System.out.println(gcd2(250, 30));

	}

	private static int gcd2(int num1, int num2) {
		// int min = num1>num2?num2:num1;
		int min = Math.min(num1, num2);
		int answer = 1;
		
		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				answer = i;
				break;
			}
		}
		
		return answer;		
		
	}
	
	private static void gcd(int num1, int num2) {
		// int min = num1>num2?num2:num1;
		int min = Math.min(num1, num2);
		int answer = 1;

		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);		
		
	}
}
