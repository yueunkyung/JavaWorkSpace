package com.shinhan.day07;

public class Printer {
	
	//instance 메서드(non-static)
	//class메서드(static)
	static void println(int data) {
		System.out.println(data);
	}

	static void println(boolean data) {
		System.out.println(data);
	}

	static void println(double data) {
		System.out.println(data);
	}

	static void println(String data) {
		//매개변수는 지역변수이다.
		int a = 10;
		System.out.println(data);
	}

	@Override
	public String toString() {
		return "프린터";
	}
	
}

//int, boolean, double, String
