package com.shinhan.day11;

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) {
		// 구현...주사위를 2개 만들고 n번 던진다... 같은 눈이 나오는 횟수를 return		
		int count = 0;
		try {
			if(n < 0) throw new IllegalArgumentException("!!!! 횟수는 음수불가 !!!");			
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			return count;
			
		}
		
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		for(int i=1; i<=n; i++) { //for는 조건이 맞는동안 looping
			int su1 = d1.play();
			int su2 = d2.play();
			System.out.println(su1+"----"+su2);
			
			if(su1 == su2) count++;
			
		}
		
		return count;
	}
}
