package com.shinhan.day14;

import java.text.DecimalFormat;
import java.util.HashSet;

public class _chap14_확인문제 {

	public static void main(String[] args) {
		// 문제1 - 4번
		// 문제2 - 3번
		// 문제3 - 4번
		// 문제4 - hashCode()리턴값, equals()리턴값
//		문제5();
//		문제6();
		// 문제7 - 3번
		// 문제8();
		문제9();

	}

	private static void 문제9() {
		byte[] bytes = { -20, -107, -120, -21, -123, -107 };
		String str = new String(bytes);
		System.out.println("str: " + str);

	}

	private static void 문제8() {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		long nanoStart = System.nanoTime();
		int[] scores = new int[1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		double avg = sum / scores.length;
		System.out.println(avg);

		long nanoEnd = System.nanoTime();
		System.out.println("걸린 시간: " + (nanoEnd - nanoStart));
		System.out.println("걸린 시간: " + decFormat.format((nanoEnd - nanoStart)) + "나노초");
	}

	private static void 문제6() {
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}

	private static void 문제5() {
		// Student를 저장하는 HashSet 생성
		HashSet<Student1> hashSet = new HashSet<Student1>();

		// Student 저장
		hashSet.add(new Student1("1"));
		hashSet.add(new Student1("1")); // 같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student1("2"));

		// 저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
	}
}

class Student1 {
	private String studentNum;

	public Student1(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

//여기에 코드를 작성하세요.
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}

class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

//여기에 코드를 작성하세요.
	@Override
	public String toString() {
		return id + ": " + name;
	}

}
