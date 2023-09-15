package com.shinhan.day14;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	@Override
	public int compareTo(Student obj) {
		return name.compareTo(obj.name);
	}
	
	
}
