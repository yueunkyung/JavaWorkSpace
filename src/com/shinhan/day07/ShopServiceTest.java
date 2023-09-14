package com.shinhan.day07;

public class ShopServiceTest {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) { //주소비교
		System.out.println("같은 ShopService 객체입니다.");
		} else {
		System.out.println("다른 ShopService 객체입니다.");
		}

	}

}
