package com.shinhan.day13;

//람다표현식은 interface에 1개의 메서드만 있는 경우 사용가능

//***interface 구현하기
//1) implements class를 만든다.
//2) 익명구현 class를 만든다.
//3) 람다표현식을 이용한다.

class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("1) implements class를 만든다.");
	}	
}
public class LambdaExpressionTest {
	public static void main(String[] args) {
		f2();
	}

	private static void f2() {
		//MyInterface2 var1 = (x, y)->{System.out.println("더하기 합니다."); return x+y;};
		//MyInterface2 var1 = (x, y)-> x+y;
		MyInterface2 var1 = (x, y)-> Integer.parseInt(x)+Integer.parseInt(y);
		
		int result = var1.add("10", "20");
		System.out.println(result);
	}

	private static void f1() {
		Runnable r1 = new RunnableImpl();
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("2) 익명구현 class를 만든다.");
			}	
		};
		Runnable r3 = ()->{System.out.println("3) 람다표현식을 이용한다.");};
		
		work(r1);
		work(r2);
		work(r3);		
	}

	private static void work(Runnable rr) {
		Thread t1= new Thread(rr);
		t1.start();
	}

}
