package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		// person.ordering(String :: compareToIgnoreCase);

		// 1.익명구현class이용
		person.ordering(new Comparable() {
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareToIgnoreCase(b);
			}
		});

		// 2.람다표현식이용
		person.ordering((x, y) -> x.compareToIgnoreCase(y));
		
		//3.람다표현식 축약문법
		person.ordering(String::compareToIgnoreCase);

	}
}