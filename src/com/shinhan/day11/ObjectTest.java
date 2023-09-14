package com.shinhan.day11;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest {

	public static void main(String[] args) {
		Dice[] arr = new Dice[5];
		//개수를 모르면 배열은 불가....Collection: List, Set, Map
		//List : 순서가 있다. 중복이 된다.
		//Set : 순서가 없다. 중복이 불가하다.(key로 사용)  구현class : HashSet
		//Map : key와 value값의 쌍이다. -> python은 Dictionary라고 함.
	
		Set<String> datas = new HashSet<String>();
		datas.add("자바");
		datas.add("자바");
		datas.add("web");
		datas.add("자바");
		datas.add("Web");
		datas.add("spring");
		System.out.println(datas.size() + "개");
		

		Set<Dice> datas2 = new HashSet<Dice>();
		datas2.add(new Dice(1));
		datas2.add(new Dice(2));
		datas2.add(new Dice(1));
		datas2.add(new Dice(2));
		datas2.add(new Dice(3));
		datas2.add(new Dice(3));
		System.out.println(datas2.size()+ "개");
		
	}
	public static void f3() {
		Dice obj1 = new Dice(8);
		Dice obj2 = new Dice(8);
		
		System.out.println(obj1); //자동으로 toString() 호출된다.
		System.out.println(obj1.toString()); //값을 return으로 재정의
		System.out.println(obj2); //자동으로 toString() 호출된다.
		System.out.println(obj2.toString());
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));

		System.out.println(obj1 == obj2); //주소비교
		System.out.println(obj1.equals(obj2)); //주소비교 => 값 비교로 재정의		
		System.out.println(obj1.equals("자바")); //주소비교 => 값 비교로 재정의		
	}
	
	public static void f2() {
		String obj1 = new String("java");
		String obj2 = new String("java");
		
		System.out.println(obj1); //자동으로 toString() 호출된다.
		System.out.println(obj1.toString()); //값을 return으로 재정의
		System.out.println(obj2); //자동으로 toString() 호출된다.
		System.out.println(obj2.toString());
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		System.out.println(obj1 == obj2); //주소비교
		System.out.println(obj1.equals(obj2)); //주소비교 => 값 비교로 재정의		
	}

	//주소비교
	public static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1); //자동으로 toString() 호출된다.
		System.out.println(obj1.toString()); //주소return(HashCode의 Hex값)
		System.out.println(obj2); //자동으로 toString() 호출된다.
		System.out.println(obj2.toString()); //주소return(HashCode의 Hex값)

		System.out.println(obj1 == obj2); //주소비교
		System.out.println(obj1.equals(obj2)); //주소비교
	}

}
