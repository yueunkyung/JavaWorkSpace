package com.shinhan.day05;

public class Employee {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;

	public Employee(String name, String title, int baseSalary) {
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
	}

	public void getTotalSalary() {
		if(title.equals("부장")) {
			totalSalary = (int) (baseSalary+baseSalary*0.25);
		} else if(title.equals("과장")) {
			totalSalary = (int) (baseSalary+baseSalary*0.15);			
		} else {
			totalSalary = (int) (baseSalary+baseSalary*0.05);			
		}
	}
	public void print() {
		getTotalSalary();
		System.out.println(title + " 직급의 " + name + "씨의 " + "본봉은 " + baseSalary + " 원이고 총급여는 " + totalSalary + " 원입니다.");
	}
}
