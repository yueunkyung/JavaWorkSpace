package ch06.sec11.exam01;

public class Korean {
	//인스턴스 final 필드 선언
	//final field는 한번만 값 할당, 수정불가
	final String nation = "대한민국"; //선언시 초기화
	final String ssn2;
	final String ssn;
	
	//인스턴스 필드 선언
	String name;

	//instance block으로 초기화	
	{
		ssn2 = "aa";
	}
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}