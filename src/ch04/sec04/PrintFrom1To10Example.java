package ch04.sec04;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==5) continue;	// 5만 출력에서 제외시킨다.
			if(i==5) break;	// 5일때 중단
			System.out.print(i + " ");
		}
	}
}