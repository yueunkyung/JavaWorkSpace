package ch06.sec08.exam02;

public class Computer {
	
	int a=10;
	int b=20;
	int c=30;
	



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computer [a=")
		.append(a)
		.append(", b=")
		.append(b)
		.append(", c=")
		.append(c)
		.append("]");
		return builder.toString();
	}




	//가변길이 매개변수를 갖는 메소드 선언
	int sum(int ... values) {
		//sum 변수 선언
		int sum = 0;
		
		//values는 배열 타입의 변수처럼 사용
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		//합산 결과를 리턴
		return sum;
	}
}