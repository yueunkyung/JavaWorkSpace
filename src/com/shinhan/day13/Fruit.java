package com.shinhan.day13;

import lombok.ToString;

@ToString
public class Fruit implements Comparable<Fruit> {
	public String name;
	public int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit otherFruit) {
		int result = price - otherFruit.price; //Ascending
		if(result==0) return otherFruit.name.compareTo(name); //Descending
		return result;
	}
}