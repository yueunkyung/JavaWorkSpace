package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList< >();

		/*//예외 발생(java.util.NoSuchElementException)
 		double avg = list.stream()
 			.mapToInt(Integer :: intValue)
 			.average()
 			.getAsDouble();
		*/
		
		list.add(100);
		OptionalDouble result1 = list.stream()
		.mapToInt(i->i.intValue())		// 또는 .mapToInt(Integer::intValue)
		.peek(a->System.out.println(a))
		.average();
		
		//1)
		if(result1.isPresent()) {
			System.out.println("존재하면 묻기"+result1.getAsDouble());
		}
		
		//2)
		double result2 = result1.orElse(0);
		System.out.println("존재하지 않으면 초기값을 춤: "+result2);
		
		//3)
		result1.ifPresentOrElse(i->{
			System.out.println("값이 있음: " + i);
		}, ()->{
			System.out.println("값이 없음");
		});
		
		
		
		System.out.println("--------------------------------------------");
		
		//방법1
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue)
			.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}

		//방법2
		double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0);
		System.out.println("방법2_평균: " + avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a));
	}
}