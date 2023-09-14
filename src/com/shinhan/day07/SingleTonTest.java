package com.shinhan.day07;

public class SingleTonTest {
	
	//overloading : 이름같고 매개변수 갯수와 타입이 다르다
	void f1() {
		
	}
	int f1(int a) {
		return 100;
	}
	int f1(String a) {
		return 100;
	}
	

	public static void main(String[] args) {
		MySingleTon a = MySingleTon.getInstance();
		MySingleTon b = MySingleTon.getInstance();

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));	
		}

}
