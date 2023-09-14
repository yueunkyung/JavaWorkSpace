package com.shinhan.day10;

import java.util.Arrays;
import java.util.Comparator;

public class Review2 {
	
	//익명구현class
	//1.field
	static Comparator<String> comp1 = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2) * -1;
		}
		
	};
	
	
	public static void main(String[] args) {
		String[] arr = { "java", "sql", "spring", "html", "css" };
		System.out.println("before:" + Arrays.toString(arr));
		Arrays.sort(arr, comp1);
		System.out.println("after:" + Arrays.toString(arr));
		
		//익명구현class
		//1.field
		//2.지역변수
		Comparator<String> comp2 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		};
		Arrays.sort(arr, comp2);
		System.out.println("after:" + Arrays.toString(arr));

		//3.매개변수
		mySort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
	}
	public static void mySort(String arr[], Comparator<String> comp3) {
		Arrays.sort(arr, comp3);
		System.out.println("after:" + Arrays.toString(arr));
	}
	public static void f4() {
		String[] arr = { "java", "sql", "spring", "html", "css" };

		System.out.println("before:" + Arrays.toString(arr));
		//Arrays.sort(arr); //String이 comparable을 implements 했기 때문에 가능
		Arrays.sort(arr, new MyStringDescending());		
		System.out.println("after:" + Arrays.toString(arr));
		
		
	}

	public static void f3() {
		Integer[] arr = { 10, 7, 3, 9, 20 };

		System.out.println("before:" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after:" + Arrays.toString(arr));

		Arrays.sort(arr, new MyIntegerDescending());
		System.out.println("descending after:" + Arrays.toString(arr));

	}

	public static void f2() {
		int a = 10;
		int b = 20;
		String c = "B";
		String d = "V";
		System.out.println(a - b > 0 ? "a가크다" : "b가크다");
		System.out.println(c.compareTo(d) > 0 ? "c가크다" : "d가크다");
		System.out.println(c.compareTo(d));

		Car c1 = new Car("BMW520", 1234);
		Car c2 = new Car("BMW720", 2000);
		System.out.println(c1.compareTo(c2));
	}

	public static void f1() {
		int[] arr = { 10, 7, 3, 9, 20 };
		// 배열의 유용한 기능들은 java.util.Arrays에 있다.
		System.out.println("before:" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after(default ascending):" + Arrays.toString(arr));
	}

}
