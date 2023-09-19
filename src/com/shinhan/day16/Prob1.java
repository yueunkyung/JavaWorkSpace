package com.shinhan.day16;

//자바 시험 리뷰
public class Prob1 {

	public static void main(String[] args) {

		String[] array = { "황남기85점", "조성호89점", "한인성188점", "독고정진22277점" };

		printMaxScore(array);

	}

	private static void printMaxScore(String[] array) {
		int maxScore = 0;
		String maxName = "";
		for (String s : array) {
			int len = s.length();
			int idx = -1;
			for (int i = 0; i < len; ++i) {
				if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
					idx = i;
					break;
				}
			}
			String name = s.substring(0, idx);
			int score = Integer.parseInt(s.substring(idx, len - 1));

			if (score > maxScore) {
				maxScore = score;
				maxName = name;
			}
		}
		System.out.printf("최고점수는 %s님 %d점 입니다.", maxName, maxScore);
	}

	/*
	 * private static void printMaxScore(String[] array) {
	 * 
	 * int max = 0; int temp = 0; String name = null; String reStr = "[가-힣]+";
	 * String reInt = "\\d+[점]"; for (int i = 0; i < array.length; i++) { temp =
	 * Integer.parseInt(array[i].replaceAll(reStr, ""));
	 * 
	 * if (max < temp) { max = temp; name = array[i].replaceAll(reInt, ""); }
	 * 
	 * }
	 * 
	 * System.out.println("최고점수는 " + name + "님 " + max + "점 입니다.");
	 * 
	 * }
	 */

}