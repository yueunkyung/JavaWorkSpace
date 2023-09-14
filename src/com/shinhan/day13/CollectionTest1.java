package com.shinhan.day13;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

//interface: Collection, List, Set, Map
//List: 순서 있고 중복 가능....구현 class: ArrayList, Vector, LinkedList
//Set: 순서 없고 중복 불가능....구현 class: HashSet, TreeSet(검색기능 강화)
//Map: key와 value의 쌍인 Entry를 갖는다....구현 class: HashMap, Hashtable, TreeMap(검색기능강화)
//Hashtable을 상속받은 Properties : 키와 값이 모두 문자로 제한, 설정파일을 읽을때 사용
public class CollectionTest1 {
	public static void main(String[] args) throws IOException {
		f9();
	}

	private static void f9() throws IOException {
		Properties pro = new Properties();

		InputStream is = CollectionTest1.class.getResourceAsStream("dbinfo.properties");
		pro.load(is);

		for(Object key:pro.keySet()) {
			System.out.println(key+"=>"+pro.getProperty((String)key));
		}
		
		/*
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String uid = pro.getProperty("userid");
		String pass = pro.getProperty("password");
		String name = pro.getProperty("myname");
		String major = pro.getProperty("mymajor");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(uid);
		System.out.println(pass);
		System.out.println(name);
		System.out.println(major);
		 */
	}

	private static void f8() {
		// Map<String, Integer> data = new HashMap<String, Integer>();
		Map<String, Integer> data = new Hashtable<String, Integer>();
		data.put("또리", 100);
		data.put("앵지", 90);
		data.put("지안", 95);
		data.put("이지", 88);
		data.put("제니", 96);
		data.put("제니", 70); // key가 중복되면 덮어쓰기가 된다.

		System.out.println("인원: " + data.size());
		System.out.println("key로 값을 찾기: " + data.get("제니"));
		System.out.println("key가 존재하는지? : " + data.containsKey("지안"));
		System.out.println("value가 존재하는지? : " + data.containsValue(100));

		System.out.println("key가 존재하는지? : " + data.containsKey("또리"));
		data.remove("또리");
		System.out.println("key가 존재하는지? : " + data.containsKey("또리"));

		for (String key : data.keySet()) {
			System.out.println(key);
		}
	}

	private static void f7() {
		// 키와 값의 쌍이다. (Entry) .... key는 Set이기 때문에 중복 불가, 순서없음.
		Map<String, Integer> data = new HashMap<String, Integer>();
		data.put("또리", 100);
		data.put("앵지", 90);
		data.put("지안", 95);
		data.put("이지", 88);
		data.put("제니", 96);
		data.put("제니", 70); // key가 중복되면 덮어쓰기가 된다.

		System.out.println("-------- 향상for --------------------------");
		/*
		 * for(String key :data.keySet()) { System.out.println(key + "학생의 점수는 => " +
		 * data.get(key)); }
		 */
		Set<String> keys = data.keySet();
		for (String key : keys) {
			System.out.println(key + "학생의 점수는 => " + data.get(key));
		}

		System.out.println("-------- entrySet 이용 --------------------------");
		int total = 0;
		Set<Entry<String, Integer>> entrys = data.entrySet();
		for (Entry<String, Integer> row : data.entrySet()) {
			System.out.println(row.getKey() + "====" + (row.getValue() + 5));
			total += row.getValue();
		}

		System.out.println("총점: " + total);
		System.out.println("평균: " + 1.0 * total / entrys.size());

	}

	private static void f6() {
		// 제네릭사용, promotion(자동형변환):상위 = 하위
		Set<Car> data = new HashSet<>();
		data.add(new Car());
		data.add(new Car("A", 1000));// 먼저
		data.add(new Car("B", 2000));
		data.add(new Car("A", 1000));// 중복되었으므로 add거부
		data.add(new Car("A", 3000));
		data.add(new Car("D", 1000));
		data.add(new Car("D", 1000));

		for (Car c : data) {
			System.out.println(c);
		}

	}

	private static void f5() {
		// 제네릭사용, promotion(자동형변환):상위 = 하위
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("월요일");
		// Set은 순서없음
		// data.add(0, "수요일");

		// Set은 순서불가(무작위)
		System.out.println("------- 일반 for 이용 ( Set은 순서불가(무작위) )-----------------------");
		/*
		 * for(int i = 0; i<data.size(); i++) { System.out.println(i+"번쨰 "+data.get(i));
		 * }
		 */

		System.out.println("------- 확장 for 이용 -----------------------");
		int i = 0;
		for (String s : data) {
			System.out.println(i + "번쨰 " + s);
			i++;
		}

		System.out.println("------- 반복자 이용 -----------------------");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void f4() {
		// 제네릭사용, promotion(자동형변환):상위 = 하위
		List<String> data = new Vector<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("월요일");
		data.add(0, "수요일");
		System.out.println("------- 일반 for 이용 -----------------------");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "번쨰 " + data.get(i));
		}

		System.out.println("------- 확장 for 이용 -----------------------");
		int i = 0;
		for (String s : data) {
			System.out.println(i + "번쨰 " + s);
			i++;
		}

		System.out.println("------- 반복자 이용 -----------------------");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void f3() {
		// 제네릭사용, promotion(자동형변환):상위 = 하위
		List<String> data = new LinkedList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("월요일");
		data.add(0, "수요일");
		System.out.println("------- 일반 for 이용 -----------------------");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "번쨰 " + data.get(i));
		}

		System.out.println("------- 확장 for 이용 -----------------------");
		int i = 0;
		for (String s : data) {
			System.out.println(i + "번쨰 " + s);
			i++;
		}

		System.out.println("------- 반복자 이용 -----------------------");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void f2() {
		// 제네릭이 사용되지 않은 경우에는 원하지 않은 datatype 저장될 수 있다. 형변환 때문에 불편.
		ArrayList<String> data = new ArrayList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("월요일");
		data.add(0, "수요일");
		System.out.println("------- 일반 for 이용 -----------------------");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "번쨰 " + data.get(i));
		}

		System.out.println("------- 확장 for 이용 -----------------------");
		int i = 0;
		for (String s : data) {
			System.out.println(i + "번쨰 " + s);
			i++;
		}

		System.out.println("------- 반복자 이용 -----------------------");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void f1() {
		// 제네릭이 사용되지 않은 경우 : 원하지 않은 datatype 저장될 수 있다. 형변환 때문에 불편.
		ArrayList data = new ArrayList();
		data.add(100);
		data.add("월요일");
		int a = (Integer) data.get(0);
		String b = (String) data.get(1);
	}
}
