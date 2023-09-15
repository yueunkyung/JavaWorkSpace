package com.shinhan.day14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest3 {
	
	static List<Student> stdList = new ArrayList<Student>();
	static {
		stdList.add(new Student("김3",100));
		stdList.add(new Student("김1",50));
		stdList.add(new Student("김5",40));
		stdList.add(new Student("김4",70));
		stdList.add(new Student("김2",80));
		stdList.add(new Student("김2",80));
	}
	public static void main(String[] args) {
		f1();
	}
	private static void f1() {
		//distinct() : 중복배제 equals(), hashCode()로 동등객체 비교
		int total = stdList.stream().distinct()
//		.sorted(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.getScore() - o1.getScore();
//			}
//		})
		.filter(std->std.getScore()>=70)
		.sorted((o1,o2)->o2.getScore() - o1.getScore())
//		.sorted()
//		.forEach(std->System.out.println(std));
		.peek(std->System.out.println(std))
		.mapToInt(st->st.getScore()).sum();
		
		System.out.println(total);		
	}
}
