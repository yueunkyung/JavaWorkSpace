// 이 class가 어느 패키지에 있는지를 나타냄
package com.shinhan.day01;

// class 이름과 .java 파일 이름이 같아야한다.
// > java com/shinhan/day01/연산식자동형변환
// 1. class load
// 2. 검증
// 3. main 시작
// 4. main 종료
public class 연산식자동형변환 {

	public static void f1() {
		System.out.println("f1메서드 시작");
		// 정수의 기본타입은 int이다. byte가 자동으로 형변환된다.
		byte a = 10;
		byte b = 20;
		int c = a + b;
		byte d = (byte)(a + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("f1메서드 끝");
	}
	
	public static void f2() {
		int a = 1;
		System.out.println(a);
		// 지역변수 : 함수내의 변수, 함수 외부에서 사용불가, 초기화없이 사용불가
		//			스택영역에 저장된다. 함수종료되면 제거된다.
		String str = "100";
		byte v1 = Byte.parseByte(str);
		short v2 = Short.parseShort(str);
		int v3 = Integer.parseInt(str);
		long v4 = Long.parseLong(str);
		float v5 = Float.parseFloat(str);
		double v6 = Double.parseDouble(str);
		boolean v7 = Boolean.parseBoolean(str);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
				
	}
	
	public static void main(String[] args) {
		System.out.println("연산식자동형변환..main 시작");
		f2();	//함수호출
		System.out.println("연산식자동형변환..main 끝");
	}
	
	// 1. 멤버변수선언 -- 생략가능
	// 2. 생성자 메서드 -- 생략가능
	// 3. 일반 메서드 -- 생략가능, 행위, 문장들의 묶음
	// 4. block : {} -- 생략가능
	// 5. inner class -- 생략가능
	// 문장 작성불가에 주의한다.

}
