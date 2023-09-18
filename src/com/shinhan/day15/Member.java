package com.shinhan.day15;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//DTO, VO
//lombok 라이브러리를 이용함 : 컴파일시에 코드를 생성해준다.
@EqualsAndHashCode(of = "mid")
@ToString
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {
	//private static final long serialVersionUID = 1L;
	String mid;
	String mname;
	int age;

	
}
