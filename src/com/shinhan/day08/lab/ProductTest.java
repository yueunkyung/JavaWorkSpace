package com.shinhan.day08.lab;

import java.util.Arrays;

public class ProductTest {
	public static void main(String[] args) {
		ProductVO[] productList = {
				new ProductVO("쵸코쵸코",25000,"Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("마이쭈", 17050, "Samsong"),
				new ProductVO("고소미", 24500, "Samsong"),
				new ProductVO("짱구", 75000, "Daehoo") };
		
		productList = selectProduct(productList, 25000);
		
		for (int i = 0; i < productList.length; i++) {
			//if(productList[i]==null) break;
			System.out.println(productList[i].toString());
		}
		
	}

	private static ProductVO[] selectProduct(Object[] productList, int i) {
		// 구현
		ProductVO[] plist = new ProductVO[productList.length];
		int index=0;
		for (Object obj:productList) {
			if(obj instanceof ProductVO pro) {				
				if(pro.getPrice()>=i) {
					plist[index++] =pro;
				}
			}
		}
		
		ProductVO[] plist2 = new ProductVO[index];
		System.arraycopy(plist, 0, plist2, 0, index);
		
		return plist2;
	}
}
