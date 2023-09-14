package ch13.sec02.exam02;

import com.shinhan.day12.CellPhone;

public class GenericExample {
	public static void main(String[] args) {

		CellPhoneAgency aa = new CellPhoneAgency();
		CellPhone phone = aa.rent();
		phone.charge(60);
		phone.printBattery();
		phone.call(10);
		phone.printBattery();
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();

		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		//Car car = new Car();
		car.run();
	}
}