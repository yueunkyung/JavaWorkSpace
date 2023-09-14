package ch06.sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		//Computer 객체 생성
		Computer myCom = new Computer();
		System.out.println(myCom);
		
		//sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
		//합산 결과를 리턴 받아 result1 변수에 대입
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result1);

		//sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고
		//합산 결과를 리턴 받아 result2 변수에 대입
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2: " + result2);

		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴 받아 result3 변수에 대입
		int[] values = { 1, 2, 3, 4, 5 };
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);

		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴 받아 result4 변수에 대입
		int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result4: " + result4);
		
		

		Computer myCom2 = new Computer();

		int aa = myCom2.sum(1,2,3,4,5);
		System.out.println("aa: "+aa);
		
		int[] arr = new int[5];
		int aa2 = myCom2.sum(arr);
		System.out.println("aa2: "+aa2);
		
		int aa3= myCom2.sum(new int[] {1,2,3});
		System.out.println("aa3: "+aa3);
	}
}