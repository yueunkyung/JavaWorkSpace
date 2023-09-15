package ch17.sec10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		//정수 배열
		int[] arr = {1, 2, 3, 4, 5};
		String[] arr2 = {"apple", "banana","aaa", "bbbbb"};
		
		System.out.println(arr2.length+"개");
		
		long result = Arrays.stream(arr2).filter(s->s.startsWith("a")).count();
		System.out.println("a로 시작하는 data개수"+result);
		
		//stream은 중간단계 거치고 최종단계로 온다.
		//중간에 중단시 결과를 볼 수 없다.
		int result2 = Arrays.stream(arr2).mapToInt(s->s.length()).peek(aa->System.out.println(aa+"글자")).sum();
		System.out.println("문자 길이들의 합계"+result2);
		
		IntStream is = Arrays.stream(arr2).mapToInt(s->s.length()).peek(aa->System.out.println(aa+"!!!!!!!!!!!!!글자"));
		
		
		//카운팅
		long count = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2의 배수 개수: " + count);

		//총합
		long sum = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.sum();
		System.out.println("2의 배수의 합: " + sum);

		//평균
		double avg = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균: " + avg);

		//최대값
		int max = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.max()
				.getAsInt();
		System.out.println("최대값: " + max);
		
		//최소값
		int min = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.min()
				.getAsInt();
		System.out.println("최소값: " + min);
		
		//첫 번째 요소
		int first = Arrays.stream(arr)
				.filter(n -> n%3==0)
				.findFirst()
				.getAsInt();
		System.out.println("첫 번째 3의 배수: " + first);
	}
}