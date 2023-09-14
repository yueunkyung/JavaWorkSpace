package com.shinhan.day04;

import java.util.Arrays;

public class Converter {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("-------------Sample 1 --------------");
		String str1 = myReplace("hello world", 'l', '*');
		System.out.println(str1);

		System.out.println("-------------Sample 2 --------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);

		System.out.println("-------------Sample 3 --------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);

	}

	public static String myReplace(String str, char oldChar, char newChar) {
		// 이 부분을 구현하시오.
		// 문자열의 길이만큼 돌면서 oldChar를 찾아서 newChar로 변경한다.
		char[] arr = str.toCharArray();
		String result = "";		
		
		for(int index=0;index<arr.length;index++) {
//			System.out.println(arr[index]);
			if(arr[index]==oldChar) arr[index] = newChar;
			result +=arr[index];
		}
		//System.out.println(Arrays.toString(arr));
		
		return result;

	}
}
