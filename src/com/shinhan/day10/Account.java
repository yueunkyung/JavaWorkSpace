package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //default 생성자를 컴파일시 만들어 줌
@AllArgsConstructor // field 갯수만큼 갖은 생성자가 컴파일시 만들어줌
@Getter	//getXXXX()
@Setter //setXXXX()
@ToString
public class Account {
	private String accNo;
	private String owner;
	private int balance;
	
}
