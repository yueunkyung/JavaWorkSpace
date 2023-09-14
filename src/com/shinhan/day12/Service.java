package com.shinhan.day12;

import java.lang.reflect.Method;

public class Service {
	@PrintAnnotation
	public void method1() throws NoSuchMethodException, SecurityException {
		System.out.println("실행 내용1");
		
		Method m = Service.class.getMethod("method1");
		PrintAnnotation p = m.getAnnotation(PrintAnnotation.class);
		System.out.println(p.number());
		System.out.println(p.value());
		System.out.println(p.myname());
		
		for(int i=1; i<=p.number(); i++) {
			System.out.println(p.value());
		}
	}

	@PrintAnnotation("*") //속성 이름 없이 값만 있는 경우는 value 이다.
	public void method2() throws NoSuchMethodException, SecurityException {
		System.out.println("실행 내용2");
		
		Method m = Service.class.getMethod("method2");
		PrintAnnotation p = m.getAnnotation(PrintAnnotation.class);
		System.out.println(p.number());
		System.out.println(p.value());
		System.out.println(p.myname());
		
		for(int i=1; i<=p.number(); i++) {
			System.out.println(p.value());
		}
		
	}

	@PrintAnnotation(value = "#", number = 20, myname = "kyung")
	public void method3() throws NoSuchMethodException, SecurityException {
		System.out.println("실행 내용3");
		
		Method m = Service.class.getMethod("method3");
		PrintAnnotation p = m.getAnnotation(PrintAnnotation.class);
		System.out.println(p.number());
		System.out.println(p.value());
		System.out.println(p.myname());
		
		for(int i=1; i<=p.number(); i++) {
			System.out.println(p.value());
		}
	}
}
