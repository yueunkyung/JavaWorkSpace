package com.shinhan.day10;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {

	public static void main(String[] args) {
		Person[] arr= {
				new Person("A", 10, "010-2222-2222"),
				new Person("C", 50, "010-2334-4444"),
				new Person("B", 40, "010-4555-7777"),
				new Person("E", 20, "010-3333-6666"),
				new Person("D", 10, "010-7777-8888")
		};
		Arrays.sort(arr);
		for (Person p:arr) {
			System.out.println(p.getAge()+":"+p.getName());
		}
		System.out.println("======이름순으로 Ascending======");
		//이름순으로 Ascending
		Comparator<Person> comp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Arrays.sort(arr,comp);
		for (Person p:arr) {
			System.out.println(p.getAge()+":"+p.getName());
		}
	}
	

}
