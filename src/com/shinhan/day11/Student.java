package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = {"stdId"}) //학번이 같으면 같은객체이다.
@ToString //(exclude = {"stdId", "year"}) //객체 정보 보여줄떄, "stdId", "year" 제외
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student> {
	//1.field : data를 저장하기 위함
	private String stdId;
	private String name;
	private String major;
	private int year;
		

	public Student(String stdId, String name, String major) {
		this(stdId, name, major, 2023);
	}


	@Override
	public int compareTo(Student obj) {
		// 년도의 Ascending
		int result = year - obj.year;
		if(result == 0) {
			//같은 년도이면 학번으로 sort
			return obj.stdId.compareTo(stdId);
		}
		return result; 
	}
	
	
}
