package com.shinhan.day05;

public class StudentTest {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		Student s1 = new Student("박정우", 20, "컴공");
		s1.display();

		Student s2 = new Student("조선희", 25, "경영");
		s2.display();

	}

	private static void f1() {
		Student s1 = new Student();
		System.out.println(s1.toString()); // 주소return
		System.out.println(s1);
		s1.setName("박정우");
		s1.setAge(20);
		s1.setMajor("컴공");
		
		s1.display();
		
		// 객체사용하려면
		// 1.객체참조변수선언
		// 2.객체생성
		// 3.객체사용
	}

}
