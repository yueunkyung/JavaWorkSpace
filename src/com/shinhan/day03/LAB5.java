package com.shinhan.day03;

public class LAB5 {

	public static void main(String[] args) {
//		String result = "";
//		result= printSeason2(8);
//		System.out.println(result);
//		result= printSeason2(10);
//		System.out.println(result);
//		result= printSeason2(13);
//		System.out.println(result);
		int result = abs(10,3);
		System.out.println(result);
	}

	private static int abs(int num1, int num2) {		
		int compute = num1 -num2;
		return compute<0?compute*-1:compute;
	}
	
	private static String printSeason2(int month) {		
		if(month<1 || month>12) {
			return "1~12 사이의 숫자만 입력하셔야 합니다.";
		}
		
		String message;
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			message = "봄"; break;
		case 6 :
		case 7 :
		case 8 :
			message = "여름"; break;
		case 9 :
		case 10 :
		case 11 :
			message = "가을"; break;
		default:
			message = "겨울";
			break;
		}
		return message+"에 태어나셨네요.!!!";
		
	}

	private static void printSeason(int month) {
		//if, switch 사용가능
		//(month == 3 || month ==4 || month 5)
		
		if(month<1 || month>12) {
			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
			return;
		}
		
		String message;
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			message = "봄"; break;
		case 6 :
		case 7 :
		case 8 :
			message = "여름"; break;
		case 9 :
		case 10 :
		case 11 :
			message = "가을"; break;
		default:
			message = "겨울";
			break;
		}
		System.out.println(message+"에 태어나셨네요.");
		
		/*
		String season="";
		if(month<1 || month>12) {
			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
			return;
		}
		switch (month) {
		case 3,4,5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";			
			break;
		case 9, 10, 11:
			season = "가을";
			break;
		case 12, 1, 2:
			season = "겨울";
			break;

		}
		System.out.println(season+"에 태어나셨네요.");
		*/
	}

}
