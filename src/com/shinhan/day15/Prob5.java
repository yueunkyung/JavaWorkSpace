package com.shinhan.day15;

public class Prob5 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };

		int count = 0;
		// 구현하시오 - 숫자들의 개수를 세어 저장하는 코드를 작성한다.
		int max = 0;
		for (int i = 0; i < answer.length; i++) {
			if (max < answer[i]) {
				max = answer[i];
			}
		}
		System.out.println("max" + max);
		for (int i = 1; i >= max; i++) {
			int cnt = 0;
			if(i==1) {
			}
			System.out.println(i+"의 갯수는" + count + "개 입니다.");
		}

		// 구현하시오 - 출력결과와 같이 나오도록 작성한다.

		int[] counter = new int[count];
	}

}