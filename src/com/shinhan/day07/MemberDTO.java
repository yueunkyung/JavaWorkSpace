package com.shinhan.day07;

//class : 설계
//VO(Value Object)
//DTO(Data Transfer Object)
//Java Beans
public class MemberDTO {
	// 1.field : data를 저장하기 위함
	private String name;
	private String id;
	private String password;
	private int age;

	public MemberDTO(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public MemberDTO(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
