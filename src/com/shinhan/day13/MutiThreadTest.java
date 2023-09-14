package com.shinhan.day13;

public class MutiThreadTest {

	public static void main(String[] args) {
		BathRoom room = new BathRoom();
		
		//4명의 고객이 공유 영역을 3번씩 사용하려고 한다.
		BathRoomThread t1 = new BathRoomThread(room, "지나");
		BathRoomThread t2 = new BathRoomThread(room, "영란");
		BathRoomThread t3 = new BathRoomThread(room, "유리");
		BathRoomThread t4 = new BathRoomThread(room, "순자");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
