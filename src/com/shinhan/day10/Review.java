package com.shinhan.day10;

//1.class : Object를 만드는 툴
class MyClass {
	
}

class MyChild extends MyClass {
	
}
//abstract class는 instance 생성불가 new MyAbstract()
abstract class MyAbstract {
	int a = 10;
	MyAbstract(){
		System.out.println("MyAbstract 생성");
	}
	void method1() {
		System.out.println("MyAbstract mehtod1()");
	}
	abstract void method2(); //정의 있고 구현이 없는 method
}

//interface => 상수가능, 변수불가, 생성자불가
interface MyInterface {
	public static final int A=10;
	public abstract void method4(); //정의 있고 구현이 없는 method
	default void method3(){
		System.out.println("MyAbstract default mehtod3()");		
	}
	public static void method5() {
		System.out.println("MyAbstract static method5()");
	}
}

class MyTest extends MyAbstract implements MyInterface {
	MyTest(){
		System.out.println("MyTest 생성자");
	}
	@Override
	public void method4() {
		System.out.println("MyTest method4()");
		
	}

	@Override
	void method2() {
		System.out.println("MyTest method2()");
		
	}
	
}


public class Review {

	public static void main(String[] args) {
		MyTest a = new MyTest();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		MyInterface.method5();
	}

}
