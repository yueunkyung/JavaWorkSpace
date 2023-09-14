package com.shinhan.day07;

public class ShopService {
	
	private static ShopService service;
	
	//생성자를 정의하지 않으면 컴파일러가 default 생성자를 .class에 추가해준다.
	//생성자를 직접 추가한다. private는 외부접근불가
	private ShopService(){
		
	}
	
	public static ShopService getInstance(){
		if(service == null) service = new ShopService();
		return service;
	}
}
