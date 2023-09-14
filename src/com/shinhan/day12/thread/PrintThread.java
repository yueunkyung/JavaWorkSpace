package com.shinhan.day12.thread;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			sharedArea.print();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
