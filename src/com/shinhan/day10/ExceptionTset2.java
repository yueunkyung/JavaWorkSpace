package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTset2 {

	public static void main(String[] args) {
		f3();
		
	}

	private static void f3() {
		//자동으로 자원 반납 try(변수)....try가 끝나면 자동으로 닫힘
		try(FileInputStream fi = new FileInputStream("src/com/shinhan/day10/Car.java")) {
			//read()는 1byte씩 읽는다....EOF(End Of File)은 -1
			int s;
			while((s = fi.read()) != -1) {
				System.out.print((char)s);
			}
		} catch(IOException e) {
			//IOException 상위이고 FileNotFoundException가 하위임
			//IOException 에 FileNotFoundException가 포함됨
			System.out.println("파일이 존재하지 않음 IO오류");
		} finally {
			System.out.println("try~with~resource는 자원반납 코드가 불필요하다.");
		}
		
	}

	private static void f2() {
		//컴파일 시점에 check하는 Exception
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("src/com/shinhan/day10/Car.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	//컴파일 시점에 check 안하는 Exception, 실행오류
	private static void f1() {
		//int a = 10/0;
		int [] arr = {1,2,3};
		//System.out.println(arr[100]);
		String s = "100점";
		System.out.println(s.length());
		//System.out.println(Integer.parseInt(s));
	}

}
