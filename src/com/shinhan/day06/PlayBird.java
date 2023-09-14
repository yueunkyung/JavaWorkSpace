package com.shinhan.day06;

public class PlayBird {
public static void main(String[] args) {
	Duck d = new Duck("꽥꽥이", 2, 15);
	d.fly();
	d.sing();
	System.out.println(d);
	
	Sparrow s = new Sparrow("쨱쨱",2, 10);
	s.fly();
	s.sing();
	System.out.println(s);
	
}
}
