package com.shinhan.day09;

public class OuterClass {
	// 1.field
	String myName = "OuterClass";
	// 2.constructor
	// 3.method
	void print() {
		//LocalClass : 메서드 내에서만 사용가능
		class LocalClass{
			String myname = "Local class입니다.";
		}
		
		LocalClass aa = new LocalClass();
		System.out.println(aa.myname);
	}
	// 4.block
	// 5.inner class

	// 1)instance member class
	// 2)static member class
	// 3)local class : method 내에 있는 class

	class InnerClassA {
		// 1.field
		String myname = "innerClassA이다.(instance member class)";
		// 2.constructor
		// 3.method
		// 4.block
		// 5.inner class
	}

	static class InnerClassB {
		String myname = "InnerClassB이다.(static member class)";
	}
	
}
