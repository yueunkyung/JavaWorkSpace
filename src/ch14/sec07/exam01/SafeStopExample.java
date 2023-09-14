package ch14.sec07.exam01;

public class SafeStopExample {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start(); //run()계속 ~~

		try {
			Thread.sleep(3000); //main이 3초를 기다린다.
		} catch (InterruptedException e) {
		}
		
		//printThread.stop();	//권장하지않음(안정적 종료가 아님)
		printThread.setStop(true);
	}
}