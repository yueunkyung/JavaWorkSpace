package com.shinhan.day09;

interface MyInterfaceA {
	void print1();

	void print2();
}

interface MyInterfaceB {
	void print3();

	void print4();

}

// interface는 다중 상속 가능 (class는 다중상속불가)
interface MyInterfaceC extends MyInterfaceA, MyInterfaceB {
	void print5();
}

class MyClass implements MyInterfaceC {

	@Override
	public void print1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print5() {
		// TODO Auto-generated method stub

	}

}

public class InterfaceTest2 {

	public static void main(String[] args) {
		MyClass aa = new MyClass();
		aa.print1();
		aa.print2();
		aa.print3();
		aa.print4();
		aa.print5();
	}

}
