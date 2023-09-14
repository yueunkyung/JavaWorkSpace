package com.shinhan.day01;

/*
 *	주석 (컴파일러는 해석안함, 사람을 위한것임)
 *	ctrl + shift + f (줄을 맞춰줌-format)
 *	ctrl + alt + 발향키내림 (라인 복사)
 *	자바는 main 함수만 실행한다.
 */
public class FirstClass {
	public static void f1() {
		//함수정의 : 문장들의 묶음
		System.out.println("1.함수 : 문장들의 묶음");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out : 표준출력담당(모니터 console)
		System.out.println("1.안녕하세요"); // 문장 끝;
		System.out.println("2.안녕하세요");
		System.out.println("3.안녕하세요");
		System.out.println("4.안녕하세요");
		System.out.println("5.안녕하세요");
		f1();	//함수를 호출함 ...갔다가 돌아온다.
		System.out.println("main end.................");
	}

}
