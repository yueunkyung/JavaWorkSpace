package com.shinhan.day06;

import java.util.Calendar;
import java.util.Date;

public class StaticTest {

	// 상수
	static final String SUBJECT = "자바";
	final String subject2 = "자바";

	public static void main(String[] args) {
		//f1();
		//new StaticTest().f2();
		//f3();
		f4();
	}

	private static void f4() {
		//long aa = System.currentTimeMillis();
		long aa = System.nanoTime();
		for(int i=0; i<10000000L; i++) {
			
		}
		//long bb = System.currentTimeMillis();
		long bb = System.nanoTime();
		System.out.println("걸림시간 : "+ (bb-aa));
	}

	private static void f3() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.AM_PM)); // 0, 1
		System.out.println(cal.get(Calendar.AM));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.MONTH) + 1); // 0월부터있다.
		System.out.println(cal.get(Calendar.YEAR));

		Date d1 = new Date();
		System.out.println(""+d1);
		System.out.println(d1.getYear());

		long aa = d1.getTime();
		for(int i=0; i<10000000L; i++) {
			
		}
		Date d2 = new Date();
		long bb = d2.getTime();
		System.out.println(bb - aa + "걸림");
	}

	private void f2() {
		System.out.println(SUBJECT);
		System.out.println(subject2);
	}

	private static void f1() {
		// 상수는 값 변경 불가
		// Math.PI =3.14;
		// SUBJECT = "";
		System.out.println(Math.PI);
		System.out.println(SUBJECT); // 내부에서 사용
		System.out.println(StaticTest.SUBJECT); // 외부에서 사용

		// StaticTest aa = new StaticTest();
		System.out.println(new StaticTest().subject2);

	}

}
