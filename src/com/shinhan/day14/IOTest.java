package com.shinhan.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		f5();
	}

	private static void f5() {

		File f = new File("bb.txt");
		System.out.println(f.exists()?"파일존재":"파일없음");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		
		//파일복사
		try (FileReader fr = new FileReader("src/com/shinhan/day14/Review.java");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("bb.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			String data;			
			while((data = br.readLine())!=null) {
				System.out.println(data);
				bw.write(data);
				bw.newLine(); //다음 라인으로 이동
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void f4() throws IOException {

		// 4.파일 출력 : 입출력 성능향상
		FileReader fr = new FileReader("src/com/shinhan/day14/Review.java");
//		BufferedReader br = new BufferedReader(fr);
		int data;

		FileWriter fw = new FileWriter("aa.txt"); // src/aa.txt
//		BufferedWriter bw = new BufferedWriter(fw);

		while ((data = fr.read()) != -1) {
			System.out.println((char) data);
			fw.write(data);
		}

		// 자원을 반납하지 않으면 다른곳에서 사용 불가
		fw.close();
		fr.close();
		System.out.println("f4 end");

	}

	private static void f3() throws IOException {

		// 4.파일에서 읽기 : 입출력 성능향상
		FileReader fr = new FileReader("src/com/shinhan/day14/Review.java");
		BufferedReader br = new BufferedReader(fr);

		String data;

		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}

		System.out.println("f3 end");

	}

	private static void f2() throws FileNotFoundException {
		// 2.파일에서 읽기
		try (FileReader fi = new FileReader("src/com/shinhan/day14/Review.java")) {
			int data;
			while ((data = fi.read()) != -1) { // -1 : End of File
				System.out.print((char) data);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("f2 end");
	}

	private static void f1() throws IOException {
		// 1.키보드에서 입력된 값을 읽기
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);

		while (true) {
			int data = ir.read();
			if (data == 13)
				break;
			System.out.println((char) data);
		}
		System.out.println("f1 end");
	}
}
