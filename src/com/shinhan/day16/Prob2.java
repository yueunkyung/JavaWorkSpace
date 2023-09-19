package com.shinhan.day16;

//자바 시험 리뷰
public class Prob2 {

	public static void main(String[] args) {

		System.out.println(leftPad("Samsung", 10, '#'));

		System.out.println(leftPad("SDS", 5, '*'));

		System.out.println(leftPad("Multicampus", 5, '@'));

	}

	public static String leftPad(String str, int size, char fillChar) {
		int len = str.length();
		String fill = "";
		try {
			if(len<size) {
				for(int i=0; i<size-len; i++) {
					fill += fillChar;
				}
				str = fill+str;
				return str;
			} else {
				//Exception일으키기(발생)
				throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
			}
			
		} catch(Exception e){ //Exception처리
			String message = e.getMessage();
			System.out.println(message);
			return ""; 
		}
		
		
		

		

	}

}

//구현하시오.
class IllegalSizeException extends Exception {
	public IllegalSizeException() {
		super("aaaaaaaaaaaa");
	}
	
	public IllegalSizeException(String message) {
		super(message);
	}
	
}




