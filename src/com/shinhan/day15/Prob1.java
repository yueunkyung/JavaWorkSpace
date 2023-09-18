package com.shinhan.day15;

import java.util.ArrayList;
import java.util.List;

public class Prob1 {

	public static void main(String[] args) {

		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};

		printMaxScore(array);

	}	

	private static void printMaxScore(String[] array){

		// 구현하세요.
            String name = "";		
		int maxScore = 0;
		List<Integer> copied = new ArrayList<>();
		
		
		for(int i=0; i<array.length; i++) {
			copied.add(Integer.parseInt(array[i].replaceAll("[^0-9]", "")));
		}
		
		for(int score:copied) {
			if(maxScore<score) {
				System.out.println(score);
				maxScore = score;
			}
		}
		name = array[copied.indexOf(maxScore)].substring(0, 3);
		System.out.println("최고점수는 "+ name +"님 "+maxScore+"점 입니다.");
	}
}