package ch06.sec08.exam04;

//overloading : 이름 같고 매개변수 사양이(개수, 타입) 다르다.
public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	int areaRectangle(int width) {
		return width * width;
	}	
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}