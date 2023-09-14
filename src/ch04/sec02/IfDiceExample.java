package ch04.sec02;

public class IfDiceExample {
	public static void f3() {
		System.out.println("f3");
		int num = (int) (Math.random() * 6) + 1;
		
		switch (num) {
		case 1 -> {
			System.out.println("1번이 나왔습니다.");
			break;
		}
		case 2 -> {
			System.out.println("2번이 나왔습니다.");
			break;
		}
		case 3 -> {
			System.out.println("3번이 나왔습니다.");
			break;
		}
		case 4 -> {
			System.out.println("4번이 나왔습니다.");
			break;
		}
		case 5 -> {
			System.out.println("5번이 나왔습니다.");
			break;
		}
		default -> System.out.println("6번이 나왔습니다.");
		}
		
	}
	
	public static void f2() {
		System.out.println("f2");
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}

	}

	public static void f1() {
		System.out.println("f1");
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1)
			System.out.println("1번이 나왔습니다.");
		else if (num == 2)
			System.out.println("2번이 나왔습니다.");
		else if (num == 3)
			System.out.println("3번이 나왔습니다.");
		else if (num == 4)
			System.out.println("4번이 나왔습니다.");
		else if (num == 5)
			System.out.println("5번이 나왔습니다.");
		else
			System.out.println("6번이 나왔습니다.");

	}

	public static void main(String[] args) {
		f3();
		/*
		 * int num = (int)(Math.random()*6) + 1; //0<= <1
		 * 
		 * if(num==1) { System.out.println("1번이 나왔습니다."); } else if(num==2) {
		 * System.out.println("2번이 나왔습니다."); } else if(num==3) {
		 * System.out.println("3번이 나왔습니다."); } else if(num==4) {
		 * System.out.println("4번이 나왔습니다."); } else if(num==5) {
		 * System.out.println("5번이 나왔습니다."); } else { System.out.println("6번이 나왔습니다.");
		 * }
		 */
	}
}