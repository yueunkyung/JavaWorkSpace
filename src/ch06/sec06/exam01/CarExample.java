package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		myCar.model = "A";
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
		
		Car myCar2 = new Car();
		myCar2.model = "B";
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar2.model);
		System.out.println("시동여부: " + myCar2.start);
		System.out.println("현재속도: " + myCar2.speed);
	}
}