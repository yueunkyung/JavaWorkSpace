package com.shinhan.day12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Box2<A, B, C> {
	private A kind;
	private B model;
	private C price;
	
	public Box2<A, B, C> makeBox(A a, B b, C c) {
		return new Box2<>(a,b,c);
	}
}

class GenericExample {
	public <A, B, C> Box2<A, B, C> makeBox(A a, B b, C c) {
		return new Box2<>(a,b,c);
	}
	
}