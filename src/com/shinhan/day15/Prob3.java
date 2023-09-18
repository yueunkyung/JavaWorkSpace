package com.shinhan.day15;

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

	// 구현하시오.
	private String user;
	private int call;
	private int sms;
	private int data;
	private int total;

	public PhoneCharge(String user, int call, int sms, int data) {
		super();
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
	}

	public int calcCharge() {
		int callFee = 0;
		int smsFee = 0;
		int dataFee = 0;
		if (call > 200) {
			callFee = (call * 10) * 2;
		} else {
			callFee = call * 10;
		}
		if (sms > 300) {
			smsFee = (sms * 20) * 4;
		} else {
			smsFee = sms * 20;
		}
		if (data > 7) {
			dataFee = (data * 1000) * 2;
		} else {
			dataFee = data * 1000;
		}
		return total = callFee + smsFee + dataFee;
	}

	public void printCharge() {
		calcCharge();
		System.out.println(user + " 사용자는 이번달에 사용하신 전화요금이 " + total + " 원입니다.");
	}

}
