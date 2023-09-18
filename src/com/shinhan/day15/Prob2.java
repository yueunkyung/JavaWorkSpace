package com.shinhan.day15;

public class Prob2 {

	public static void main(String[] args) {

		System.out.println(leftPad("Samsung", 10, '#'));

		System.out.println(leftPad("SDS", 5, '*'));

		System.out.println(leftPad("Multicampus", 5, '@'));
	}

	public static String leftPad(String str, int size, char fillChar) {

		// 구현하시오.....return값 수정할것
		String result = "";
		int gap = size - str.length();

		if (str.length() > size) {
			//throw new IllegalSizeException;

			return "문자열의 길이보다 size가 큽니다.";
		} else {
			for (int i = 1; i <= gap; i++) {
				result += Character.toString(fillChar);
			}
			return result + str;
		}

	}
}
//구현하시오.
class IllegalSizeException  {
};