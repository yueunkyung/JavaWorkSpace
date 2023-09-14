package com.shinhan.day09;

interface Resizable {
	// public abstract 생략
	void resize(double size);
}

class Circle implements Resizable {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void resize(double size) {
		System.out.println("Circle의 resize " + size);
	}

}

class Circle2 implements Resizable {
	int radius;

	Circle2(int radius) {
		this.radius = radius;
	}

	@Override
	public void resize(double size) {
		System.out.println("Circle2의 resize " + size);
	}

}

public class 익명구현클래스연습2 {
	public static void main(String[] args) {
		shapeUse(new Circle(10));
		shapeUse(new Circle2(10));
		shapeUse(new Resizable() {
			
			//생성자를 만들 수 없다. 생성자는 class이름과 같아야 한다.
			
			@Override
			public void resize(double size) {
				System.out.println("익명구현class.... resize재정의");
				
			}
		});
		shapeUse(size->System.out.println("람다표현식"+size));
	}

	private static void shapeUse(Resizable shape) {
		shape.resize(0.5);

	}
}
