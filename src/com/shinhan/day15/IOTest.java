package com.shinhan.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class IOTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		f5();

	}
	private static void f5() throws FileNotFoundException {
		File f = new File("bb.data");
		
		System.out.println("크기: "+f.length());		
		System.out.println("절대경로: "+f.getAbsolutePath());
		
		FileInputStream fi = new FileInputStream(f);
		FileInputStream fi2 = new FileInputStream("bb.data");
	}
	// DataInputStream, DataOutputStream : 자바의 기본타입의 값을 파일이나 네트웍에 보내고, 받기
	// ObjectInputStream, ObjectOutputStream : 자바의 객체를 파일이나 네트웍에 보내고자 한다.(Serializable한 객체만 가능)
	// Object는 직렬화가 가능해야한다.
	
	private static void f4() throws ClassNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("bb.data");
		ObjectInputStream ois = new ObjectInputStream(fi);
		String s = (String) ois.readObject();
		String s2 = (String) ois.readUTF();
		String s3 = (String) ois.readUTF();
		Member m = (Member) ois.readObject();
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(m.mname + " : " + m.age);
	}

	private static void f3() throws IOException {
		// 자바의 객체를 파일이나 네트웍에 보내고자 한다.(Serializable한 객체만 가능)
		FileOutputStream fos = new FileOutputStream("bb.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new String("자바"));
		oos.writeUTF(new String("자바2"));
		oos.writeUTF("자바3");
		oos.writeObject(new Member("1233", "홍길동", 12));
		oos.close();
		fos.close();
	}

	private static void f2() {
		PrintStream p = System.out;
	}

	private static void f1() throws IOException {
		// 자바의 기본타입의 값을 파일이나 네트웍에 보내고, 받기
		int a = 100;
		double b = 3.14;
		FileOutputStream fw = new FileOutputStream("aa.data");
		DataOutputStream dos = new DataOutputStream(fw);

		dos.write(a);
		dos.writeDouble(b);

		dos.close();
		fw.close();

		FileInputStream fi = new FileInputStream("aa.data");
		DataInputStream dis = new DataInputStream(fi);

		int c = dis.read() + 1;
		double d = dis.readDouble() + 1;
		System.out.println(c);
		System.out.println(d);
		dis.close();
		fi.close();
	}

}
