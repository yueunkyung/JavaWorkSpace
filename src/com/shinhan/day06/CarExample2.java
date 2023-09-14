package com.shinhan.day06;

public class CarExample2 {

	public static void main(String[] args) {
		//1.배열 : 같은 타입의 변수를 연속 공간에 담기 위한 자료구조
		//Car가 5개 있다.
		Car[] cars = new Car[] {
				new Car("A", "black"),
				new Car("B", "black"),
				new Car("C", "black"),
				new Car("D", "black"),
				new Car("E", "black")
		};
		for(Car cc:cars) {
			System.out.println(cc);
		}
		/*
		car[0] = new Car("A", "black");
		car[1] = new Car("B", "black");
		car[2] = new Car("C", "black");
		car[3] = new Car("D", "black");
		car[4] = new Car("E", "black");
		*/

	}

}
