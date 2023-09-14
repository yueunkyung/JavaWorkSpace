package com.shinhan.day11;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.StringTokenizer;

public class ObjectTest4 {

	public static void main(String[] args) {
		method14();
		System.out.println("------END----------------------------");
	}

	private static void method14() {
		long price = 1234567890000L;
		DecimalFormat df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(price));
		
	}

	private static void method13() {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth());
		System.out.println(d1.getMonthValue());
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getDayOfWeek());
		
		LocalDate d2 = LocalDate.of(2023, 9, 12);
		LocalDate d3 = LocalDate.of(2005, 8, 31);
		Period p = Period.between(d3, d1);
		System.out.println("기간: "+p.getYears());
	}

	private static void method12() {
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 7, 31); //날짜 setting 주의 월-1
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1); //0월부터 시작
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

	private static void method11() {
		Date d1 = new Date();
		System.out.println(d1);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		String s = sf.format(d1);
		System.out.println(s);
	}

	private static void method10() {
		double result1 = Math.ceil(3.1); //무조건 올림
		double result2 = Math.floor(3.9); //무조건 버림
		double result3 = Math.round(3.5); //반올림
		double result4 = Math.sqrt(3*3+4*4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

	private static void method9() {
		Integer a = 100;
		Integer b = 100;
		
		a++; b++;
		
		System.out.println(a == b);
		System.out.println(a.intValue() == b.intValue());
		System.out.println(a.equals(b));
	}

	private static void method8() {
		String s = "100";
		int b = Integer.parseInt(s);
		System.out.println(b);
		double c = Double.parseDouble(s);
		System.out.println(c);
	}

	private static void method7() {
		//기본형 : 값저장, 연산, 비교
		int a = 10;
		a++;
		System.out.println(a);
		System.out.println(a>10);
		//int + 포장 => Wrapper class(Integer)
		Integer i2 = new Integer(100); //Boxing
		//deprecate.....예전 버젼에서 사용하였으나 현재 버젼에서는 다른 방법 제곤, 권장하지 않음.
		
		Integer i3 = 9; // new Integer(200) AutoBoxing
		i3++;
		System.out.println(i3>100);// i3 = i3.intValue() ==> UnBoxing
		System.out.println(Integer.bitCount(i3));
		
		char ch1 = 'A';
		Character ch2 = 'A';
		// ch1 = (char)(ch1 + (97-65));
		ch1 = (char)(ch1 + ('a'-'A'));
		System.out.println(ch1);
		System.out.println(Character.toLowerCase(ch2));
	}

	private static void method6() {
		String s1 = "이것이/자바다/커피,맥주,소주 막걸리";
		StringTokenizer st = new StringTokenizer(s1, "/|,| ");
		System.out.println("countTokens : "+st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	private static void method5() {
		// *는 0이상, $ 끝
		String s1 = "이것이/자바다/커피,맥주,소주 막걸리";
		String[] arr = s1.split("/|,| ");
		for(String s:arr) {
			System.out.println(s);
		}
	}

	private static void method4() {
		String s1 = "자바";
		String s2 = new String("자바");
		int[] arr1 = {'자','바'};
		char[] arr2 = {'자','바'};
		String s3 = new String(arr1, 0, 2);
		String s4 = new String(arr2);
		//StringBuffer는 가변 문자열
		//String은 고장 문자열
		StringBuffer sb = new StringBuffer("자바");
		StringBuilder sb2 = new StringBuilder("자바");
		//sb = sb + "배우기"; //StringBuffer는 수정이 불가
		sb.append("배우기");
		sb2.append("배우기");
		String s5 = new String(sb);
		String s6 = new String(sb2);
		System.err.println(s5);
		System.err.println(s6);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		System.err.println(s6.equals(s5));
	}

	private static void method3() {
		
		String s = System.getenv("OS");
		System.out.println(s);
		
		//Map은 키와 값의 쌍이다.
		//key를 알면 값을 얻을 수 있다.
		Map<String, String> data = System.getenv();
		for(String key:data.keySet()) {
			System.out.println(key+"  ==>  "+data.get(key));
		}
		//System.exit(0); 프로그램 중단
	}

	private static void method2() {
		//1초 1,000ms
		long a = System.currentTimeMillis(); //1,000
		long b = System.nanoTime(); //1,000,000,000
		
		System.out.println(a);
		System.out.println(b);
		
	}

	private static void method1() {
		//System class
		//System.in : 표준입력(키보드)
		//System.out : 표준출력(모니터)
		//System.err : 
		//System.err.println("오류메세지 모니터에 출력");
	
		
	}

}
