package com.shinhan.day07;

import com.shinhan.day06.NoteBook;

public class ModifierTest2 {

	public static void main(String[] args) {
		NoteBook aa= new NoteBook();

		aa.model ="A";
		//불가
		//aa.price = 100;
		aa.setOs("unix");
	}

}
