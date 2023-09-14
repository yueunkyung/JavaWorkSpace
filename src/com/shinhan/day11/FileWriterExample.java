package com.shinhan.day11;

import java.io.IOException;

public class FileWriterExample {
	
	//try 벗어나면 자원반납이 자동이다.
	//implements AutoCloseable
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("file.txt")){
			fw.write("Java!!!!!!");
		} catch(IOException ex) {
			ex.printStackTrace();
		};
	}
	
	public static void f2() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("file.txt");
			fw.write("Java!!!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}