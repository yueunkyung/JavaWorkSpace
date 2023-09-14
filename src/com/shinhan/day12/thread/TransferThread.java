package com.shinhan.day12.thread;

public class TransferThread extends Thread {

	SharedArea sharedArea;

	public TransferThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			// synchronized block : 공유데이터 처리하는 동안 다른 쓰레드가 들어오지 못하게 lock 걸기
			sharedArea.transfer();

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
