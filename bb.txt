package com.shinhan.day14;

//규격서 : 규현class들이 반드시 이런 기능을 구현해야한다.
@FunctionalInterface // 컴파일시에 구현 class가 람다표현식이 가능한가? 체크
interface MyRunnable {
	// public abstract
	String run(int a, int b);
}

class MyRunImpl implements MyRunnable {
	@Override
	public String run(int a, int b) {
		return "1.구현class" + (a + b);
	}
}

//TreeSet, TreeMap: 비교 가능해야 한다. Comparable, Comparator
public class Review {
	public static void main(String[] args) {
		work(new MyRunImpl());
		work(new MyRunnable() {
			@Override
			public String run(int a, int b) {
				return "2.익명구현 class: " + (a + b);
			}
		});
		work((x, y) -> "3.람다표현식: " + (x + y));

		Computer com = new Computer();
		work((x, y) -> com.f1(x, y));
		work(com::f1);
		work((x, y) -> Computer.f2(x, y));
		work(Computer::f2);

		TV tv = new TV();
		String result = tv.f1(10, 20);
		System.out.println(result);
		System.out.println(TV.f2(30, 40));
		
		work((aa,bb)->tv.f3(aa, bb));
		work(tv::f3);
		work((aa,bb)->TV.f4(aa, bb));
		work(TV::f4);
	}

	private static void work(MyRunnable my) {
		String result = my.run(10, 20);
		System.out.println("result: "+result);
	}
}

class TV {
	static String f4(int a, int b) {
		System.out.println("###########");
		System.out.println("###########");
		System.out.println("###########");
		System.out.println("###########");
		System.out.println("###########");
		return a + b + "";
	}

	String f3(int a, int b) {
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");
		return a + b + "";
	}

	String f1(int a, int b) {
		System.out.println("======TV instance 메서드=========");
		return "instance 메서드 " + (a + b);
	}

	static String f2(int a, int b) {
		System.out.println("======TV static 메서드=========");
		return "static 메서드 " + (a + b);
	}
}

class Computer {
	String f1(int a, int b) {
		System.out.println("======computer instance 메서드=========");
		return "instance 메서드 " + (a + b);
	}

	static String f2(int a, int b) {
		System.out.println("======computer static 메서드=========");
		return "static 메서드 " + (a + b);
	}
}
