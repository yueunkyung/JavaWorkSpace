package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Person implements Comparable<Person> {
	//field : data 저장하기 위함
	private String name;
	private int age;
	private String phoneNumber;

	@Override
	public int compareTo(Person obj) {
		//나이순(ascending), 나이가 같으면 이름순(descending)
		int result = age - obj.age;
		if(result==0) {
			return obj.name.compareTo(name);
		}
		return result;
	}
}
