package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		//함수내의 변수는 지역변수이다. 지역변수는 반드시 초기화하고 사용한다.
		int sum = 0;
		int i;
			
		for(i=1; i<=100; i++) {
//			sum += i;
			sum = sum + i;
		}
			
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}	//main end
 }	//class end