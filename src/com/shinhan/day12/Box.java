package com.shinhan.day12;

public class Box<A, B> {
	private A content;
	private B size;
	
	public Box(A content, B size) {
		super();
		this.content = content;
		this.size = size;
	}

	public A getContent() {
		return content;
	}

	public void setContent(A content) {
		this.content = content;
	}

	public B getSize() {
		return size;
	}

	public void setSize(B size) {
		this.size = size;
	}
	
}
