package com.shinhan.day11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObjectTest3 {

	public static void main(String[] args) {
//		method1();
//		method2();
		method3();

	}

	private static void method3() {
		Set<Student> datas = new HashSet<>();
		//동등비교(hashcode()와 equals()를 체크)
		//hashcode()와 equals()가 true이면 동등함으로 add 안함.
		datas.add(new Student("100", "유은경", "computer", 2020));
		datas.add(new Student("100", "조선희", "성악", 2023));
		datas.add(new Student("500", "정주영", "전자전기", 2024));
		datas.add(new Student("400", "이길동", "산업공학", 2020));
		datas.add(new Student("100", "방은지", "computer", 2020));
		
		for(Student s : datas) {
			System.out.println(s);
		}
		
	}

	private static void method2() {
		Student[] arr = new Student[] {
			new Student("100", "유은경", "computer", 2020),
			new Student("300", "조선희", "성악", 2023),
			new Student("500", "정주영", "전자전기", 2024),
			new Student("400", "이길동", "산업공학", 2020),
			new Student("200", "방은지", "computer", 2020)
		};
		
		Arrays.sort(arr);
		for(Student s:arr) {
			System.out.println(s);
		}

	}

	private static void method1() {
		Student s1 = new Student();
		Student s2 = new Student("123", "김길동", "컴공");
		Student s3 = new Student("124", "박길동", "역사", 2022);
		Student s4 = new Student("124", "이길동", "computer", 2022);

		System.out.println(s1 + ", 학번=> " + s1.getStdId());
		System.out.println(s2 + ", 학번=> " + s2.getStdId());
		System.out.println(s3 + ", 학번=> " + s3.getStdId());

		System.out.println(s3.equals(s4) ? "같은학생" : "다른학생");
	}

}
