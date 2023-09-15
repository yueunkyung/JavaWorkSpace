package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4 ,6 };
		String[] arr = {"apple", "banana","aaa", "bbbbb"};
		
		boolean v1 = Arrays.stream(arr).allMatch(s->s.length()>3);
		System.out.println("모두 3자리보다 큰가요?"+ v1);
		
		boolean v2 = Arrays.stream(arr).anyMatch(s->s.length()>3);
		System.out.println("아무거나 하나라도 3자리보다 큰가요?"+ v2);

		boolean v3 = Arrays.stream(arr).noneMatch(s->s.length()>10);
		System.out.println("10자리보다 큰 길이가 없는가?"+ v2);
		
		boolean result = Arrays.stream(intArr)
			.allMatch(a -> a%2==0);
		System.out.println("모두 2의 배수인가? " + result);
		
		result = Arrays.stream(intArr)
			.anyMatch(a -> a%3==0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
			.noneMatch(a -> a%3==0);
		System.out.println("3의 배수가 없는가?  " + result);
	}
}
