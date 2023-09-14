package com.shinhan.day06;

public class 사람 {
	String name;

	사람() {
		name = "아무개";
	}

	사람(String name) {
		this.name = name;
	}

	void 웃다() {
		System.out.println(name + "사람은 웃는다");
	}

	void 먹는다() {
		System.out.println(name + "사람은 먹는다");
	}

	void 계산한다(String company) {
		전자계산기 aa = new 전자계산기();
		전자계산기 bb = new 전자계산기(company);

		int result = aa.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int result2 = bb.minus(10, 2);
		System.out.println(aa.company + "계산기로 더하기" + result);
		System.out.println(bb.company + "계산기로 더하기" + result2);
	}
	public static void main(String[] args) {
		사람 aa = new 사람("정");
		aa.웃다();
		aa.먹는다();
		aa.계산한다("퍼스트존");
	}
}
