package com.shinhan.day04;

public class ArrayTest {

	public static void main(String[] args) {
		f11(); //

	}

	private static void f11() {
		// String[] arr = new String[] { "자바", "프로그램", "웹", null, null };
		// String[] arr = { "자바", "프로그램", "웹", null, null };
		String[] arr = new String[5];
		arr = new String[] { "자바", "프로그램", "웹", null, null };

		for (String s : arr) {
			System.out.println(s);
		}
	}

	private static void f10() {
		// 여러명의 학생들의 여러과목의 시험점수가 저장되어있다. 각각의 학생들의 총점과 평균구하기
		int[][] scores = { { 99, 88, 77, 66 }, { 100, 100 }, { 100, 99, 88 }, { 100, 99 }, { 100, 99, 88, 100 } };
		double maxAvg = -1;
		int maxIdx = -1;
		for (int student = 0; student < scores.length; student++) {
			System.out.print(student + "번째 학생 ");
			int total = 0;
			double avg;
			for (int jumsu : scores[student]) {
				total += jumsu;
			}
			avg = (double) total / scores[student].length;
			System.out.println("총점은 " + total + " 평균은 " + avg);
			if (avg > maxAvg) {
				maxAvg = avg;
				maxIdx = student;
			}
		}

		// 1등?평균이 가장 높은 사람을 1등으로 한다.
		System.out.println("1등 평균은" + maxAvg);
		// 1등의 index??
		System.out.println("1등은 " + maxIdx + "번째 학생");

//		for (int i = 0; i < scores.length; i++) {
//			int total = 0;
//			for (int j = 0; j < scores[i].length; j++) {
//			    total += scores[i][j];
//			}
//			System.out.println("학생"+ (i+1) + " 총점"+ total +" 평균"+ total/scores[i].length );
//		}
//		
//		System.out.println();
//
//		int student = 0;
//		for (int[] dataArr : scores) {
//			int total = 0;
//			student++;
//			for (int data : dataArr) {
//				total += data;
//			}
//			System.out.println("학생"+ student + " 총점"+ total +" 평균"+ total/dataArr.length );
//		}
//		

	}

	private static void f9() {
		// 선언+생성+초기화
		// int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 } };
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("======== 향상for, 확장for =====================================================");

		for (int[] dataArr : arr) {
			for (int data : dataArr) {
				System.out.print(data);
			}
			System.out.println();
		}
	}

	private static void f8() {
		// 선언+생성+자동초기화
		int[][] arr1 = new int[3][4];

		System.out.println(arr1.length + "개");
		System.out.println(arr1[0].length + "개...값이 저장되어 있는 곳");
		System.out.println(arr1[2][3]);
	}

	private static void f7() {
		// 1.배열변수선언
		int[][] arr1;

		// 2.배열생성
		arr1 = new int[3][]; // 3개짜리 배열이 각각 4개짜리 배열을 가리킨다.

		// 3.배열사용
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + "행");
			arr1[i] = new int[5 - i];
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("----" + j + "열*****" + arr1[i][j]);
			}
		}
	}

	private static void f6() {
		// 2차원배열 : 배열의 배열
		// 1.배열변수선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];

		// 2.배열생성
		arr1 = new int[3][4];
		arr2 = new int[3][];

		// 3.배열사용
		arr1[0][0] = 99;
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		arr2[2] = new int[3];
		arr2[0][0] = 88; // 오류

		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
		System.out.println(arr2[1][0]);
		System.out.println(arr2[2][0]);
	}

	private static void f5() {
		// String[] subject = new String[5]; //기본형이 아닌 객체의 배열은 null로 초기화
		String[] subject = new String[] { "자바", "웹", "스프링", null, null };

		System.out.println(subject.length); // 변수, field, 속성

		for (String data : subject) {
			System.out.println(data + "--" + data.length()); // ()함수
		}

	}

	private static void f4() {
		// 점수들의 총점과 평균을 출력하자
		int[] arr2 = { 100, 90, 80, 100, 77 }; // 생성문을 생략불가
		int total = 0;

		for (int score : arr2) {
			total += score;
		}
		System.out.println("총점:" + total);
		System.out.println("평균:" + (double) total / arr2.length);
	}

	private static void f3() {
		// 1.배열변수선언 + 2.배열생성(배열은 객체이다), 자동초기화
		/*
		 * int[] arr1 = new int[5]; arr1[0] = 100; arr1[1] = 90; arr1[2] = 80; arr1[3] =
		 * 100; arr1[4] = 70;
		 */

		// 1.배열변수선언 + 2.배열생성, 초기화
		// int[] arr1 = new int[] { 100, 90, 80, 100, 60 };
		int[] arr1 = { 100, 90, 80, 100, 60 }; // 선언시 생성하면서 초기화하는 경우는 new int[] 생략 가능
		int[] arr2;
		arr2 = new int[] { 100, 90, 80, 100, 70 }; // 생성문을 생략불가

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i + "번째 점수는" + arr2[i]);
		}
		System.out.println("=========항상for=====================================");
		for (int data : arr2) {
			System.out.println(data);
		}
	}

	private static void f2() {
		// 1.배열변수선언 + 2.배열생성(배열은 객체이다), 갯수가 필수, 자동초기화 (정수:0, 실수:0.0, boolean:false)
		int[] arr1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + "번째 ==>" + arr1[i]);
		}
		// 3.배열사용

	}

	private static void f1() {
		// 배열 : 하나의 이름으로 같은 타입의 값을 여러개 저장하기위한 연속 공간
		// 접근시에는 첨자를 이용한다. 0부터 시작한다.

		// 1.배열변수선언
		int[] arr1;
		double arr2[];
		char[] arr3;
		boolean[] arr4;
		// 2.배열생성(배열은 객체이다), 갯수가 필수, 자동초기화 (정수:0, 실수:0.0, boolean:false)
		arr1 = new int[10];
		arr2 = new double[10];
		arr3 = new char[10];
		arr4 = new boolean[10];
		// 3.배열사용
		arr1[0] = 100;
		System.out.println("0번째:" + arr1[0]);
		System.out.println("9번째:" + arr1[9]);
		System.out.println("0번째:" + arr2[0]);
		System.out.println("9번째:" + arr2[9]);
		System.out.println("0번째:*" + arr3[0] + "*");
		System.out.println("9번째:*" + arr3[9] + "*");
		System.out.println("0번째:" + arr4[0]);
		System.out.println("9번째:" + arr4[9]);
	}

}
