package com.shinhan.day10;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = "price")
@ToString
public class Car implements Comparable<Car> {
	private String model;
	private int price;
	
	@Override
	public int compareTo(Car obj) {
		int result = model.compareTo(obj.model);
		if(result == 0) {
			//모델이 같다를 의미한다.
			//가격으로 descending
			return obj.price - price;
			
		}
		return result; //< = >
	}

}
