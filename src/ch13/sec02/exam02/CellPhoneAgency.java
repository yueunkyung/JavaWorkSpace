package ch13.sec02.exam02;

import com.shinhan.day12.CellPhone;

public class CellPhoneAgency implements Rentable<CellPhone> {

	@Override
	public CellPhone rent() {
		// TODO Auto-generated method stub
		return new CellPhone("아이폰20");
	}

}
