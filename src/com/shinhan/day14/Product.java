package com.shinhan.day14;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	
	
}
