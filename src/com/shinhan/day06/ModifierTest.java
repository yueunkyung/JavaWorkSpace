package com.shinhan.day06;

public class ModifierTest {

	public static void main(String[] args) {
		NoteBook aa= new NoteBook();
		
		aa.model ="A";
		aa.price = 100;
		//불가
		//aa.os = "window";
		aa.setOs("unix");
	}

}
