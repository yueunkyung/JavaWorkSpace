package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
	public void run() {
		
	}
}
class MyThread2 extends Object implements Runnable {
	public void run() {
		
	}
}


class 익명연습 {
	void f1() {
		Thread t1 = new Thread() {
			public void run() {
				
			}
		};
		t1.start();
		(new Thread() {
			public void run() {
				
			}
		}).start();
		
		Thread t2 = new Thread(new MyThread2());
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}); 
		t2.start();		
		t3.start();		
	}
}

public class RunnableExecuteExample {

	public static void main(String[] args) {
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		//이메일을 보내는 작업 생성 및 처리 요청
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
				}
			});
		}
			
		//ExecutorService 종료
		executorService.shutdown();
	}
}