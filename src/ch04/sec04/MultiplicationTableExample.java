package ch04.sec04;

public class MultiplicationTableExample {
	public static void f2() {
		// 구구단
		aa:for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
//				if(dan==4) continue; //현재 반복문의 증감으로 나간다.
//				if(dan==4) break; //현재 반복문을 중단(빠져나간다)
//				if(dan==4) break aa; // label 이름과 같은 반복문 중단 (빠져나간다)
//				if(dan==4) continue aa; // label 이름과 같은 반복문의 증감으로 간다.
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);

			}
			System.out.println();
		}

	}

	public static void f1() {
		// 구구단
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%d * %d = %d\n", dan, gop, dan * gop);
			}
		}

	}

	public static void main(String[] args) {
		f2();
		

//		for (int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		}
	}
}