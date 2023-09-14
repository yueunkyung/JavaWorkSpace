package com.shinhan.day13;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest2 {
	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		TreeMap<Fruit, String> map = new TreeMap<>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		map.put(new Fruit("사과1", 2000), "A상사");
		map.put(new Fruit("사과2", 4000), "C상사");
		map.put(new Fruit("사과4", 3000), "A상사");
		map.put(new Fruit("사과3", 1000), "B상사");
		map.put(new Fruit("사과5", 1000), "A상사");
		
		System.out.println(map.firstKey());
		Entry<Fruit, String> entry = map.firstEntry();
		System.out.println("key: "+entry.getKey());
		System.out.println("value: "+entry.getValue());
		System.out.println("-----------------------------");

		//type - Fruit
		for(Fruit fruit :map.keySet()) {
			System.out.println("key: "+ fruit);
			System.out.println("value: "+map.get(fruit));
		}
		
		//type - Entry
		for(Entry<Fruit, String> en :map.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
	}

	private static void f2() {
		//HashSet : 중복없음, 순서없음(index가 없음)
		//TreeSet : 중복없음, 순서없음(index가 없음)
		//			add시 값을 비교하여 정렬한다. 추출시 Ascending 순으로 나온다.
		TreeSet<Car> data = new TreeSet<>();
		data.add(new Car("A",1000));
		data.add(new Car("A",1000));
		data.add(new Car("A",2000)); //모든 field를 비교해서 다르므로 들거감
		data.add(new Car("C",5000));
		data.add(new Car("B",7000));
		data.add(new Car("D",7000)); // TreeSet, TreeMap에서 사용, 
		// compare에서 price만 비교시 price 값이 같으면 add 되지 않음
		
		for(Car cc:data) {
			System.out.println(cc);
		}
	}
	
	private static void f1() {
		//HashSet : 중복없음, 순서없음(index가 없음)
		//TreeSet : 중복없음, 순서없음(index가 없음)
		//			add시 값을 비교하여 정렬한다. 추출시 Ascending 순으로 나온다.
		Set<String> data = new TreeSet<>();
		data.add("B");
		data.add("A");
		data.add("A");
		data.add("C");
		
		for(String s:data) {
				System.out.println(s);
		}
	}
}
