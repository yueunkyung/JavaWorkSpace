package ch09.sec03.exam01;

public class AExample {
	public static void main(String[] args) {
		//B 객체 생성
		A.B b = new A.B();
		System.out.println(b.aa);
		
		A a = new A();
		System.out.println(a.field1);
		
		a.method1();
		A.method2();
	}
}