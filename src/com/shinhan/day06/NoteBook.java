package com.shinhan.day06;

/*접근제한자
 * public : class, field, constructor, method 
 * protected : field, constructor, method 
 * 생략 : class, field, constructor, method 
 * private : field, constructor, method 
 */

//public : 모든 패키지에서 접근가능
//생략: 같은 패키지에서 접근가능
//private : 같은 class만 접근가능
public class NoteBook {
	public String model;
	int price;
	private String os;
	public NoteBook(){
		System.out.println("셍성자");
	}
	
	public void setOs(String os) {
		this.os = os;
	}
}
