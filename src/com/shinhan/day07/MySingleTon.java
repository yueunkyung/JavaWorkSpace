package com.shinhan.day07;

// SingleTone객체 생성을 1회만 한다.
public class MySingleTon {
	
	private static MySingleTon my = new MySingleTon();

	//private 접근제한자는 자신의 class에서만 접근 가능
	private MySingleTon(){
		System.out.println("MySingleTone 생성");
	}
	
	public static MySingleTon getInstance() {
		if(my==null) my = new MySingleTon();
		return my;
	}
}
