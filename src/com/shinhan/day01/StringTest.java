package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		method5();

	}

	private static void method5() {
		// byte < short < int < long < float < double
		// byte < char < int < long < float < double
		// 강제형변환 : 작은방 = (작은방타입)큰값, data손실가능성
		byte v1; //1byte
		int v2 = 128; //4byte
		v1 = (byte)v2;
		System.out.println(v1);
		
		float pi = 3.14f;
		v2 = (int)pi;
		System.out.println(v2);
	}

	private static void method4() {
		// 자동타입변환 : 큰방타입 = 작은값
		// byte < short < int < long < float < double
		// byte < char < int < long < float < double
		// 지역변수(함수내의 변수)는 초기화없이 사용불가
		int v1;
		byte v2 = 127;
		char v3 = 'A';
		double v4;
		v1 = v3;
		System.out.println(v1);
		v4= v1;
		System.out.println(v4);
	}

	private static void method3() {
		int a = 10;
		int b = 3;
		// 문자 + 숫자에서 +는 연결연산자.
		// 문자 - 숫자는 불가
		System.out.println("더하기는 " + (a+b));
		System.out.println("뺴기는 " + (a-b));
		System.out.println("곱하기는 " + a*b);
		System.out.println("나눈 몫은 " + a/b);
		System.out.println("나눈 나머지는 " + a%b);
		
	}

	private static void method2() {
		// String은 고정 문자열이다. 변경불가
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		String s4 = new String("자바");
		//변경이 아니고 신규주소가 생성된다.
		s1 = s1 + "good";
		s2 = s2 + "good";
		s3 = s3 + "good";
		s4 = s4 + "good";
		
		System.out.println(s1 == s2); //주소비교 true
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		System.out.println(s3 == s4); //주소비교 false
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		//문자열의 값을 비교
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		
	}

	private static void method1() {
		// 문자열 : "", "\"", "'", "\t" "\n"
		String str = "이것이\t\"자바\"다.....\n저자:신용권";
		System.out.println(str);
		String str2 = """				
				이것이	자바다............
				저자:신용권
				""";
		System.out.println(str2);
	}

}
