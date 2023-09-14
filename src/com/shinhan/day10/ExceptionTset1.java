package com.shinhan.day10;

//Runtime Exception : 컴파일러가 체크하지 않음, 실행시 예외발생
//->ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException
//예외를 처리하지 않으면 JVM이 자동으로 던지고 마지막에 처리한다. 즉 오류메세지 보이고 종료됨
//예외처리하면 프로그램 계속 진행가능

public class ExceptionTset1 {
	public static void main(String[] args) {
		System.out.println("main시작");
		// 업무 로직과 예외처리 로직이 섞이는 코드는 바람직하지 않다. (분리가 좋다)
		
		try { //예외가 발생할 가능성이 있는 문장을 기술한다.
			String s = null;
			System.out.println(s.length());
			//f1();
			//f2();
			//f3(); //오류 발생 시 예외 객체가 자동으로 생성됨, catch에 들어간다.
			System.out.println("try....예외발생 안함");
			//catch block는 하위를 먼저정의하고 상위는 나중에 정의한다.
		}
		catch(ArithmeticException ex){
			//예외처리는 catch block에서 한다. 처리하면 프로그램 계속 진행
			System.out.println("@.예외발생메세지"+ex.getMessage());
		}
		catch(NumberFormatException ex){
			//예외처리는 catch block에서 한다. 처리하면 프로그램 계속 진행
			System.out.println("$.예외발생메세지"+ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex){
			//예외처리는 catch block에서 한다. 처리하면 프로그램 계속 진행
			System.out.println("^.예외발생메세지"+ex.getMessage());
		}
		catch(Exception ex){
			//예외처리는 catch block에서 한다. 처리하면 프로그램 계속 진행
			System.out.println("#.기타예외"+ex.getMessage());
		}
		finally {
			System.out.println("예외발생 여부와 무관하게 반드시 수행하는 코드");
			//자원반납(자원해제) : DB연결해제, File close
		}
		System.out.println("main끝");
	}
	
	private static void f3() {
		System.out.println("f3시작");
		String s = "100점";
		// 실행오류
		System.out.println(Integer.parseInt(s)+200);
		System.out.println("f3끝");
	}

	private static void f2() {
		System.out.println("f2시작");
		int[] a = {1,2,3,4,5};
		// 실행오류
		System.out.println(a[5]);
		System.out.println("f2끝");
	}

	private static void f1() {
		System.out.println("f1시작");
		int a = 10;
		int b = 0;
		// 실행오류
		System.out.println(a/b);
		System.out.println("f1끝");
	}
}
