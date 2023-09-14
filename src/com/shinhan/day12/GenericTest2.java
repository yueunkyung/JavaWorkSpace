package com.shinhan.day12;

import java.util.ArrayList;
import java.util.HashSet;

public class GenericTest2 {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		Box2<String, String, Integer> a1 = new Box2<>("카인드","모델",100);
		Box2<String, String, Integer> a2 = a1.makeBox("문자","문자", 200);
		System.out.println(a1.getKind());
		System.out.println(a2.getKind());
		System.out.println(a1);
		System.out.println(a2);
		
		GenericExample aa = new GenericExample();
		Box2<String, String, Integer> a3 = aa.makeBox("AA", "BB", 100);
		System.out.println(a3);
		
	}

	private static void f1() {
		//Collection => List, Set, Map
		
		//	List => ArrayList, LinkedList, Vector
		//	List 순서가 있다. 중복을 허용함
		//	ArrayList<String> alist = new ArrayList<>(); //10개
		
		//	Set => HashSet, TreeSet 순서가 없다. 중복이 허용 안된다.
		HashSet<String> alist = new HashSet<>();
		
		alist.add("월");
		alist.add("화");
		alist.add("월");
		alist.add("목");
		alist.add("토");
		alist.add("토");
		alist.add("월");
		
		for(String s:alist) {
			System.out.println(s.length());
		}
		
	}

}
