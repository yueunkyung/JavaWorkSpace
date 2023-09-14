package com.shinhan.day13;

//Thread
public class BathRoomThread extends Thread {
	BathRoom room;
	String custName;
	
	BathRoomThread(BathRoom room, String custName){
		this.room = room;
		this.custName = custName;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=3; i++) {
			room.use(custName);			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
