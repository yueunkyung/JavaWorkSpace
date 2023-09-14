package ch03.sec07;

public class LogicalOperatorExample {

	public static void f1() {
		int charCode = 'A';
		System.out.println(charCode>=65&&charCode<=90?"대문자":"대문자아님");
		
		//char기본형 + 기능 => Character.Wrapper class
		boolean result1 = Character.isUpperCase(charCode);
		boolean result2 = Character.isLowerCase(charCode);
		boolean result3 = Character.isDigit(charCode);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1?"대문자":result2?"소문자":"숫자");
		
		if(result1) {
			System.out.println("대문자");
		} else {
			if(result2) {
				System.out.println("소문자");				
			} else {
				System.out.println("숫자");
			}
		}
	}
	
	public static void main(String[] args) {
		f1();
		
		/*
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';

		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요.");
		}
			
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자이군요.");
		}

		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//----------------------------------------------------------

		int value = 6;
		//int value = 7;
			
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}

		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
		*/
	}
}