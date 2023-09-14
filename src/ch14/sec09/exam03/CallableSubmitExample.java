package ch14.sec09.exam03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class 익명구현클래스 implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 100;
	}
}

class 익명연습 {
	void f1(int su) {
		int su2 = 100;
		int su3 = su2;
		//su2++; //불가
		su2++;
		//익명구현 class를 정의하고 그것으로 객체 생성
		//Local inner class에서 매개변수나 local 변수를 사용하면 무조건 final이다.
		Callable<Integer> aa = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				//su2++; //불가
				return su + su3;
			}
		};
	};
}


public class CallableSubmitExample {
	public static void main(String[] args) {
		
		class AA {
			int a = 10;
			void f1(int su) {
				int su2 = 200;
				//su2++;
				class BB{
					// method 내에 있는 class (Local class)
					// 지역변수 또는 파라메터를 접근 할 수 있다.
					// 접근하면 무조건 final이 붙는다.
					void f2() {
						System.out.println(su);
						System.out.println(su2);
					}
				}
			}
			
		}
		
		
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		//ExcutorService execute( Runnable ) :return 불가
		//ExcutorService submit( Callable ) :return 가능
		
		
		//계산 작업 생성 및 처리 요청
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1; i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산");
					return sum;
				}
			});

			try {
				int result = future.get();
				System.out.println("\t리턴값: " + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//ExecutorService 종료
		executorService.shutdown();
	}
}