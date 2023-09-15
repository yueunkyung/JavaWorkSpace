package com.shinhan.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest2 {
	static List<Product> alist = new ArrayList<Product>();
	static {
		alist.add(new Product(1, "tv T100 ABC", "삼성", 1000));
		alist.add(new Product(3, "computer com100 ABC", "lg", 200));
		alist.add(new Product(2, "phone phone2 phone3", "apple", 100));
		alist.add(new Product(3, "tv2 tt vv", "삼성", 3000));
		alist.add(new Product(1, "tv3 sam sung", "삼성", 2000));
		alist.add(new Product(1, "tv3 DD", "삼성", 2000));
	}

	public static void main(String[] args) {
		f11();
	}

	private static void f11() {
		List<String> blist = Arrays.asList("월","화","수","목");
		blist.stream().sorted().forEach(a-> System.out.println(a));//ascending sort
		blist.stream().sorted((x, y)->y.compareTo(x)).forEach(a-> System.out.println(a));//descending sort
		
		
	}

	private static void f10() {
		List<String> blist = Arrays.asList("월","화","수","목");
		blist.sort(null); //ascending
		
		//descending
		/*
		blist.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}			
		});
		*/
		blist.sort((x, y)->y.compareTo(x)); //람다식
		blist.stream().forEach(a->System.out.println(a));
	}

	private static void f9() {
		/*
		String name = alist.get(0).getName();
		String[] arr = name.split(" ");
		Arrays.stream(arr).forEach(aa->System.out.println(aa));
		Arrays.stream(name.split(" ")).forEach(aa->System.out.println(aa));
		*/
		
		alist.stream().distinct()
		.map(p->p.getName())
		.flatMap(n -> Arrays.stream(n.split(" ")))
		.forEach(p2->System.out.println(p2));		
	}

	private static void f8() {
		alist.stream().distinct().mapToInt(p -> p.getPrice()).asDoubleStream().forEach(p2 -> System.out.println(p2));		
	}

	private static void f7() {
		alist.stream().distinct().mapToInt(p -> p.getPrice()).forEach(p2 -> System.out.println(p2));
		alist.stream().distinct().mapToInt(p -> p.getPno()).forEach(p2 -> System.out.println(p2));
		alist.stream().distinct().map(p -> p.getName()).forEach(p2 -> System.out.println(p2));
	}

	private static void f6() {
		alist.stream().distinct().filter(p -> p.getName().startsWith("t")).forEach(p2 -> System.out.println(p2));
	}

	private static void f5() {
		alist.stream().distinct().filter(p -> p.getPrice() > 1000).forEach(p -> System.out.println(p));
	}

	private static void f4() {
		alist.stream().distinct().filter(p -> p.getCompany().equals("삼성")).forEach(p -> System.out.println(p));

		System.out.println("------------------------------------------------------");

		for (Product p : alist) {
			if (p.getCompany().equals("삼성")) {
				System.out.println(p);
			}
		}
	}

	private static void f3() {
		alist.stream().distinct().forEach(p -> System.out.println(p));
	}

	private static void f2() {
		int total = alist.stream().mapToInt(product -> product.getPrice()).sum();
		System.out.println(total);
	}

	private static void f1() {
		alist.stream().forEachOrdered(p -> System.out.println(p));
	}

}
