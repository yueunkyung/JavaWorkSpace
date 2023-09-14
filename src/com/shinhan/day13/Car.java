package com.shinhan.day13;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode//(of = "model") //모델이 같으면 동등객체라고 재정의
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car implements Comparable<Car> {
	private String model;
	private int price;
	@Override
	public int compareTo(Car obj) {
		//int result = price - obj.price; //price로 Ascending
		int result = obj.price - price; //price로 Descending
		if(result == 0) {
			return model.compareTo(obj.model);//model로 Ascending
		}
		return result;
	}
	
	//TreeSet, TreeMap에서 사용
	//값이 같으면 add되지 않음
}
