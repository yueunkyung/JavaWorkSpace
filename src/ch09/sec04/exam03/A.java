package ch09.sec04.exam03;

public class A {
	//메소드
	public void method1(int arg) { 					//final int arg
		
		//Local class에서 매개변수 또는 지역변수는 사용하면 변수는 final이다.(수정불가)
		//Local class에서 매개변수 또는 지역변수는 사용하지 않으면 final이 아니다.(수정가능)
		
		//로컬 변수 
		int var = 1; 						 		//final int var = 1;
		
		//arg++;
		//var++;
		
		//로컬 클래스
		class B {
			//메소드
			void method2() {
				//로컬 변수 읽기
				System.out.println("arg: " + arg);		//(o)
				System.out.println("var: " + var);		//(o)
				
				//로컬 변수 수정
				//arg = 2;									      //(x)
				//var = 2;									      //(x)
			}
		}
		
		//로컬 객체 생성
		B b = new B();
		//로컬 객체 메소드 호출
		b.method2();
		
		//로컬 변수 수정
		//arg = 3;											      //(x)
		//var = 3;											      //(x)
	}
}