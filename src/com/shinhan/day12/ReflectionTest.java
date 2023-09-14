package com.shinhan.day12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;
import java.net.URL;

public class ReflectionTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
		f4();
		
	}

	private static void f4() throws NoSuchMethodException, SecurityException {
		Service service = new Service();
		
		service.method2();
		
	}

	private static void f3() throws URISyntaxException {
		Class cls = CellPhone.class;
		
		URL url = cls.getResource("aa/photo1.jpg");
		System.out.println(url.getPath());
		System.out.println(url.toURI());
		
	}

	private static void f2() {
		Class cls = CellPhone.class;
		Constructor[] arr = cls.getDeclaredConstructors();
		for(Constructor cc:arr) {
			System.out.println(cc.getName() + "(생성자이름)");
			Class[] arr2= cc.getParameterTypes();
			for(Class cls2 :arr2) {
				System.out.println("파라메터 타입 이름: " + cls2.getName());
			}
			System.out.println("-------------------------------------");
		}
	}

	private static void f1() throws ClassNotFoundException {
		//class 메타정보를 알아보기(field, constructor, method....)
		CellPhone p1 = new CellPhone("AAA");
		Class<?> cls1 = p1.getClass();
		Class<?> cls2 = Class.forName("com.shinhan.day12.CellPhone");
		Class<?> cls3 = CellPhone.class;
		
		Field[] fields = cls1.getDeclaredFields();
		for(Field f:fields) {
			System.out.println("field 이름: " + f.getName());
		}
		Constructor[] cons = cls1.getDeclaredConstructors();
		for(Constructor cc:cons) {
			System.out.println("get constructor parameter count: " + cc.getParameterCount());
			System.out.println("접근지정자: " + cc.getModifiers());
			System.out.println("접근지정자: " + Modifier.toString(cc.getModifiers()));
			//1. public
			System.out.println("-----------------------------------------");
		}
		
		Method[] ms = cls3.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println("메서드 이름: " + m);
			System.out.println("접근지정자: " + m.getModifiers());
			System.out.println("접근지정자: " + Modifier.toString(m.getModifiers()));
			System.out.println("--------Method-----------------------------");
		}
		
	}
}
