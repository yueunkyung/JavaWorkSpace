package com.shinhan.day14;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class _chap12_확인문제 {
	public static void main(String[] args) {
		// 문제1 - 4번
		// 문제2 - 3번
		// 문제3 - 4번
		// 문제4 - hashCode()리턴값, equals()리턴값
		문제5();
		문제6();
		// 문제7 - 3번
		문제8();
		문제9();
		문제10();
		문제11();
		문제12(); // - 값이 -128~127은 값을 비교하고, 그 외의 값은 번지를 비교.
		문제13(); // - 4번
		// 문제14 - 4번
		문제15();
		문제16();
		문제17();
		// 문제18 - 4번
		// 문제19 - 4번
	}

	private static void 문제17() {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]{1}\\w{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}

	private static void 문제16() {
		Date now = new Date();
		SimpleDateFormat dateGuide = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 kk시 mm분");
		System.out.println(dateGuide.format(now));
	}

	private static void 문제15() {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime targetDay = LocalDateTime.of(today.getYear(), 12, 31, 0, 0, 0);
		long remainDay = today.until(targetDay, ChronoUnit.DAYS);
		System.out.println("남은 일자: " + remainDay);
	}

	private static void 문제13() {
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(Math.max(5.3, 2.5));
		System.out.println(Math.round(5.7));
	}

	private static void 문제12() {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
	}

	private static void 문제11() {
		String str = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	private static void 문제10() {
		String str = "";
		StringBuilder strbuilder = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			strbuilder.append(i);
		}
		str = strbuilder.toString();
		System.out.println(str);
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
		System.out.println("걸린 시간: " + decFormat.format((nanoEnd - nanoStart)));
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