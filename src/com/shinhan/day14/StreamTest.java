package com.shinhan.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		List<Student> alist = Arrays.asList(
					new Student("김3", 100),
					new Student("김1", 90),
					new Student("김2", 100),
					new Student("김5", 70),
					new Student("김4", 80)
				);

		alist.stream().forEach(std->{
			System.out.println(std);
		});
		
		alist.stream().mapToInt(std->std.getScore()).forEach(score->{
			System.out.println(score);
		});

		double avg = alist.stream().mapToInt(std->std.getScore()).average().getAsDouble();
		System.out.println(avg);
	}

	private static void f5() {
		// List<String> alist = new ArrayList<String>();
		// -- List.of로 생성된 list는 변경불가
		// List<String> alist = List.of("자바","SQL","HTML","Spring");
		String[] arr = { "자바", "SQL", "HTML", "Spring" };
		List<String> alist = Arrays.asList(arr);

		alist.stream().forEach(s -> {
			System.out.println(s);
		});

	}

	private static void f4() {
		String[] arr = { "자바", "SQL", "HTML", "Spring" };
		Arrays.stream(arr).forEach(s -> {
			System.out.println(s);
		});
	}

	private static void f3() {
		String[] aar = { "자바", "SQL", "HTML", "Spring" };

		for (String s : aar) {
			System.out.println(s);
		}

	}

	private static void f2() {
		// 스트림: 내부반복자
		int total = IntStream.rangeClosed(1, 10).sum();
		System.out.println(total);

		IntStream.rangeClosed(1, 10).forEach(i -> {
			System.out.println(i);
		});
	}

	private static void f1() {
		// 1~10까지 looping, 외부반복자
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.println(i);
		}
	}
}
