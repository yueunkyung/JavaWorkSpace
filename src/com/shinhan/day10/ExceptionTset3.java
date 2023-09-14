package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTset3 {

	public static void main(String[] args){
		//예외 발생시 내가 처리한다.
		try {
			f6();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------프로그램 종료-------");
	}

	//떠넘기기 : 함수 선언부에 작성, 예외 발생시 함수를 불렀던 곳으로 간다.
	private static void f6() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day10/Person.java");
		int a;

		while((a = fr.read())!=-1) {
			System.out.print((char)a);
		}
		
	}

	private static void f5() {
		try (FileReader fr = new FileReader("src/com/shinhan/day10/Person.java")) {
			int a;
			while((a = fr.read())!=-1) {
				System.out.print((char)a);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		} catch (IOException e1) {
			System.out.println("IO error");
		}
	}

	private static void f4() {
		//컴파일러가 Check 함, Check Exception
		try {
			//Class를 메모리에 load 가능하다
			Class a = Class.forName("com.shinhan.day10.Person");
			System.out.println(a.getModifiers());
			System.out.println(a.getPackageName());
			System.out.println(a.getSimpleName());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"존재하지 않음");
		}
	}

	private static void f3() {
		//컴파일러가 Check 함, Check Exception
		//자원반납 자동
		try(FileInputStream fi = new FileInputStream("")) {
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		} catch (IOException e) {
			System.out.println("IO오류");
		}
		
		
	}

	private static void f2() {
		//컴파일러가 Check 함, Check Exception
		FileInputStream fi=null;
		try {
			fi = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void f1() {
		//컴파일러가 Check 안함, non-check Exception
		//RuntimeException
		//Exception 처리 안하면 JVM 오류메세지 보여주고 비정상종료
		//처리는 try~catch~finally
		try {
			int a = 10/0;
		} catch(RuntimeException aa) {
			System.out.println("실행오류");
		} finally {
			System.out.println("자원반납 후 계속 진행");
		}
	}

}
