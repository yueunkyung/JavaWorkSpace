package com.shinhan.day09.lab;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0] = new Rectangle(5,6);
		arr[1] = new RectTriangle(6,2);
		
		for(Shape s:arr) {
			System.out.println("area:"+ s.getArea());
			System.out.println("perimeter:"+ s.getPerimeter());
			if(s instanceof Resizable re) {
				//((Resizable)s).resize(0.5);
				re.resize(0.5);
				System.out.println("new area:"+ s.getArea());
				System.out.println("new perimeter:"+ s.getPerimeter());
			}
		}
	}

}
