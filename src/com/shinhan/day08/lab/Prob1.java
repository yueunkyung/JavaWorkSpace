package com.shinhan.day08.lab;

public class Prob1 {
	public static void main(String[] args) {
		//문제를 파악 : 부모 => Entry 자식 => Directory, File
		Entry e1 = new Directory("tetD");
		e1.print();
		Entry e2 = new File("testF", 1000);
		e2.print();

	}

}

abstract class Entry {
	private String name;
	private int size;

	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entry(String name) {
		super();
		this.name = name;
	}

	public Entry(int size) {
		super();
		this.size = size;
	}

	public Entry(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public abstract void print();

}

class Directory extends Entry {
	Directory(String name) {
		//setNmae(name);
		super(name);
	}

	@Override
	public void print() {

		System.out.println(getName());
	}

}

class File extends Entry {
	File(String name, int size) {
		//setName(name);setSize(size);
		super(name, size);
	}

	@Override
	public void print() {
		System.out.println(getName() + "(" + getSize() + ")");
	}

}
