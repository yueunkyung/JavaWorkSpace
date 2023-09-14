package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor //필수 입력이어야 하는 field를 argument로 갖는 생성자
//@AllArgsConstructor
@Data
public class Member {
	private final String id="aa";
	private @NonNull String name="bb";
	private int age;	
}
