package com.shinhan.day06;

public class LAB6 {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Student("홍길동"+(i+1), 20+(10*i), 200201+i);
			arr[i].print();
		}
		
		//Student student = new Student("홍길동", 20, 200201);
		Teacher teacher = new Teacher("이순신", 30, "JAVA");
		Employee emp = new Employee("유관순", 40, "교무과");

		//student.print();
		teacher.print();
		emp.print();
	}
}
