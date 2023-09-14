package ch09.sec02.exam01;

public class A {
	//인스턴스 멤버 클래스
	class B {
		B(){
			System.out.println("B가생성됨");
		}
		
	}
	
	//인스턴스 필드 값으로 B 객체 대입
	B field = new B(); 
	
	//생성자
	A() {
		System.out.println("A의 생성자에서 내부 class B를 생성");
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		System.out.println("A의 instance메서드에서 B를 생성");
		B b = new B();
	}
}