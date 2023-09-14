package com.shinhan.day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {

	public static void main(String[] args) {
		method4();
	}

	private static void method4() {
		//학번 : 892221234
		//주민번호 : 년도2월2일-[1234]지역
		String regExp3 = "\\d{2}\\d{3}\\d{4}";
		String data = "892221234";
		
		boolean result = Pattern.matches(regExp3, data);
		System.out.println(result);
		
		String regExp4 = "\\d{6}-\\d{7}";
		String data2 = "910211-1234567";
		
		boolean result2 = Pattern.matches(regExp4, data2);
		System.out.println(result2);
				
	}

	private static void method3() {
		// .+ : 임의의 문자가 1개 이상
		// .* : 임의의 문자가 0개 이상
		// \\w : [0-9A-Za-z]
		String regExp2 = "([0-9A-Za-z]+)@(\\w+\\.\\w*[0-9])";
		String email = "eunkyung211@naver.com3 ............. zzdlkjsf@naver.com4 .................. skditn@gmail.com6";
		
		Pattern p1 = Pattern.compile(regExp2);
		Matcher m1 = p1.matcher(email);
		
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println(m1.group(1));
			System.out.println(m1.group(2));
		}
		
	}

	private static void method2() {
		String regExp = "([01]{3})-([0-9]{3,4})-(\\d{4})";
		String phoneNumber = "친구1 : 010-1234-5678 ㅁㅁㅁㅁㅁㅁ 친구2 : 011-777-5678 ㅁㅁㅁㅁㅁㅁ 친구3 : 01-7777-5678 ㅁㅁㅁㅁㅁㅁ 친구4 : 016-999-5678 ㅁㅁㅁㅁㅁㅁ 친구5 : 010-4434-5678";

		Pattern p1 = Pattern.compile(regExp);
		Matcher m1 = p1.matcher(phoneNumber);
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println(m1.group(1));
			System.out.println(m1.group(2));
			System.out.println(m1.group(3));
		}

	}

	private static void method1() {
		// 정규표현식 : 해당하는 data가 특정 패턴(regular expression)에 맞는지 체크
		// [] : 선택
		// {3} : 3자리만 가능
		// {3,4} : 3이상 4이하
		// - : 범위(어디서부터 어디까지)
		// [0-9] == \\d
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0, 1(없거나 있거나)
		// . : 임의의 문자
		// \\w : [0-9A-Za-z]
		// $ : 끝
		String regExp = "[01]{3}-[0-9]{3,4}-\\d{4}";
		String regExp2 = "[0-9A-Za-z]+@.+\\.\\w*[0-9]$";
		String phoneNumber = "010-1234-5678";
		String email = "eunkyung211@naver.com3";

		boolean result = Pattern.matches(regExp, phoneNumber);
		System.out.println(result ? "OK" : "잘못된 패턴");

		result = Pattern.matches(regExp2, email);
		System.out.println(result ? "OK" : "잘못된 패턴");
	}

}
