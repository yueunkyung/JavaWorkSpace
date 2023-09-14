package com.shinhan.day09;

public class InterfaceTest {

	public static void main(String[] args) {
		/*
		Television t1 = new Television(12);
		Audio a1 = new Audio();
		f4(t1);
		f4(a1);
		RemoteController.show2();
		*/
		f5();

	}
	private static void f5() {
		Audio a1 = new Audio();
		System.out.println(a1 instanceof Audio);
		System.out.println(a1 instanceof RemoteController);
		System.out.println(a1 instanceof RemoteController2);
		System.out.println(a1 instanceof Object);
		a1.powerOn();
		a1.powerOff();
		a1.show();
		a1.print();
		a1.print2();
		
	}
	private static void f4(RemoteController t1) {
		t1.powerOn();
		t1.powerOff();
		t1.show();
		
		if(t1 instanceof Television tt) {
			((Television)t1).show2();
			tt.show2();
		}
	}
	private static void f3() {
		//자동형변환	부모타입 = 자식객체
		RemoteController t1 = new Television(0);
		t1.powerOn();
		t1.powerOff();
	}

	private static void f2() {
		Audio t1 = new Audio();
		t1.powerOn();
		t1.powerOff();
	}

	private static void f1() {
		Television t1 = new Television(12);
		t1.powerOn();
		t1.powerOff();
	}

}
