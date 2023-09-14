package com.shinhan.day09;

public class InnerClassTest {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		OuterClass v1 =new OuterClass();
		System.out.println(v1.myName);
		v1.print();
		
		//OuterClass.InnerClassA v2 = v1.new InnerClassA();
		OuterClass.InnerClassA v2 = new OuterClass().new InnerClassA();
		System.out.println(v2.myname);
		OuterClass.InnerClassB v3 = new OuterClass.InnerClassB();
		System.out.println(v3.myname);
	}
}
