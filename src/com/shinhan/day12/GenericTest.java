package com.shinhan.day12;

public class GenericTest {
	public static void main(String[] args) {
		f3();
		
	}

	private static void f3() {
		CellPhone phone = new CellPhone("SM1234");
		Box<CellPhone, String> box = new Box<>(phone, "Large");
		System.out.println(box.getContent().model);
		System.out.println(box.getSize() + "사이즈");
		
	}
	
	private static void f2() {
		Box<String, Integer> box = new Box<>("과자", 1000);
		System.out.println(box.getContent().length());
		System.out.println(box.getSize()*1.1);
		
	}

	private static void f1() {
		Box b1 = new Box("과자", 1000);		
		System.out.println(((String)b1.getContent()).length());		
		System.out.println(((Integer)b1.getSize())*1.1);
	}
}
