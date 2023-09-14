package com.shinhan.day09;

public class 익명구현클래스연습 {

	public static void main(String[] args) {
		f1(new Cat());
		f1(new Dog());
		
		Soundable aa = new Soundable() {
			@Override
			public String sound() {
				return "익명구현class";
			}
		};
		f1(aa);
		
		f1( new Soundable() {
			@Override
			public String sound() {
				return "익명구현class2";
			}
		});
		
		//함수가 1개인 경우만 가능
		f1(()->"람다표현식!!!!!");
		f1(()->{
			return "람다표현식!!!!!";	
		});
		
	}

	private static void f1(Soundable s) {
		String message = s.sound();
		System.out.println(message);
	}

}
