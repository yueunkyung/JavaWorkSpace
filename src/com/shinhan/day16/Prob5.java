package com.shinhan.day16;

//자바 시험 리뷰
public class Prob5 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };

		int[] counter = new int[4]; //0(1의개수), 1(2의개수), 2(3의개수), 3(4의개수)

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.println((i + 1) + "의 갯수는 " + counter[i] + "개 입니다.");
		}

	}

}