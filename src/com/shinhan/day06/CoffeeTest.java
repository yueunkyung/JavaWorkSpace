package com.shinhan.day06;

public class CoffeeTest {

	void method() {
		System.out.println("인스턴스메서드");
		//가능
		method2();
	}
	static void method2() {
		System.out.println("class메서드");
		//static이 non-static 사용불가
		//method();
		
		//객체 생성 후 사용가능
		CoffeeTest aa = new CoffeeTest();
		aa.method();
	}
	public void f1(){
		System.out.println("f1!!!!!!!!!");
	}
	public static void main(String[] args) {
		CoffeeTest aa = new CoffeeTest();
		aa.f1();
		
		System.out.println(Coffee.brand);
		Coffee.staticMethod();
		Coffee a = new Coffee("라뗴1",5000);
		Coffee b = new Coffee("라뗴2",5000);
		
		a.memberMethod();
		b.memberMethod();
	
	}

}
