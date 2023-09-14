package com.shinhan.day13;

//field + constructor + method
//DTO 또는 VO, Service, DAO
class Parent {

}

// 상수 + 추상메서드, 디폴트메서드, static메서드, private메서드, private static 메서드
interface MyInterface {

}

class A extends Parent implements MyInterface, Comparable<A> {
	@Override
	public int compareTo(A o) {
		return 0;
	}
}

class B implements MyInterface, Comparable<B> {
	@Override
	public int compareTo(B o) {
		return 0;
	}
}

// Thread : 프로그램의 흐름
// 동시에 여러개의 흐름을 만들고자 한다. (시간을 분할해서 왔다갔다 처리한다)
// extends Thread, run()구현, start()로 시작
class UpperCaseThread extends Thread {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(getName() + ": " + ch);
		}
	}

}

public class Review {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread 시작");

		Thread t1 = new UpperCaseThread();
		t1.setName("하나");
		Thread t2 = new UpperCaseThread();
		t2.setName("둘");

		t1.start(); // Runnable(실행대기) 상태로 같다. 자신의 순서가 되면 실행
		t2.start(); // Runnable(실행대기) 상태로 같다. 자신의 순서가 되면 실행

//		for(int i = 1; i<=20; i++){
//			System.out.println(i);
//		}
		
		System.out.println(Thread.currentThread().getName() + " thread 끝");
	}

}
