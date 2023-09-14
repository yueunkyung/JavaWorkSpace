package com.shinhan.day03;

public class FunctionTest {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		String result1 = print(1, 2, "합계");
		System.out.println(result1);

	}

	private static String print(int i, int j, String k) {
		// null => 정의된 값이 없음 ""빈 문자는 아니다.
		return k + ":" + (i + j);
	}

	private static void f1() {
		add(10.5, 20.6); // int값 2개를 전달한다. (argument, parameter), return 없음
		// parameter는 자동 형변환 된다.
		add(1, 2);
		add(10, 20, 30); // 이름이 같고 매개변수사양이 다르다. (overloading)
		add("자바", "웹", "스프링"); // 이름이 같고 매개변수사양이 다르다. (overloading)
	}

	private static void add(String s1, String s2, String s3) {
		System.out.println("전달받은 문자열 s1=" + s1);
		System.out.println("전달받은 문자열 s2=" + s2);
		System.out.println("전달받은 문자열 s3=" + s3);

	}

	private static void add(int i, int j, int k) {
		System.out.println("전달받은 값 i=" + i);
		System.out.println("전달받은 값 j=" + j);
		System.out.println("전달받은 값 k=" + k);

	}

	private static void add(double i, double j) {
		System.out.println("전달받은 값 i=" + i);
		System.out.println("전달받은 값 j=" + j);

	}

	private static void add(int i, int j) {
		System.out.println("전달받은 값 i=" + i);
		System.out.println("전달받은 값 j=" + j);

	}

}
