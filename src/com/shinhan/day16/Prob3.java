package com.shinhan.day16;

//자바 시험 리뷰
class Prob3 {

	public static void main(String args[]) {

		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);

		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);

		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);

		skt.printCharge();

		ktf.printCharge();

		lgt.printCharge();

	}

}

class PhoneCharge {

	private String user;
	private int call;
	private int sms;
	private int data;
	private int total;

	public PhoneCharge(String user, int call, int sms, int data) {
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
	 
	}

	public int calcCharge() {

		int callFee = 0;
		
		if (call < 200) {
			callFee = 10 * call;
		} else if (call >= 200) {
			callFee = 20 * call;
		}
		
		int smsFee = 0;
		if (sms < 200) {
			smsFee = 20 * sms;
		} else if (sms >= 300) {
			smsFee = 80 * sms;
		}

		int dataFee = 0;
		if (data < 7) {
			dataFee = 1000 * data;
		} else if (data >= 7) {
			dataFee = 2000 * data;
		}
		total = callFee + smsFee + dataFee;
		return total;

	}
	
	void printCharge() {
		calcCharge();
		System.out.println(user +
				" 사용자는 이번달에 사용하신 전화요금이 " + total + "원 입니다.");
	}
}