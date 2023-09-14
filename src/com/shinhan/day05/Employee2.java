package com.shinhan.day05;

//public : 모든 패키지에서 접근가능
//생략 : 같은 패키지에서만 접근가능
// private : 같은 class에서만 접근가능
public class Employee2 extends Object  {
	private String id;
	private String name;
	private int baseSalary;

	//생성자
	public Employee2(String id, String name, int baseSalary) {
		// super();
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	//getter/setter
	//set멤버변수이름 : 값을 변경하는 메서드
	//get멤버변수이름 : 값을 return하는 메서드

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getSalary(double bonus) {
		double salary = baseSalary + baseSalary * bonus ; 
		return salary; 
	}
	
	/*
	 * override(덮어쓰기)
	 * 부모가 정의한 내용을 재정의한다.
	 * method 이름 같고 매캐변수 사양이 같고
	 * return 같고
	 * 접근제한자는 같거나 더 넓어야 한다.
	 * public>protected>생략>private
	 */
	public String toString() {
		String message = name
				+ "("
				+ id
				+ ") 사원의 기본급은 "
				+ baseSalary
				+ "원 입니다."
				+ "총 급여는"
				+ getSalary(0.5)
				+ "입니다.";
		return message;
	}
}
//모든 class의 맨 상위 부모 : Object
