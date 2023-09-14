package com.shinhan.day06;
//=>나의 class가 위치하는 패키지이다.

//import java.sql.Date;
//import java.util.Date;
//=>이 class내에서 사용되는 Date는 java.util.Date패키지에 Date class를 사용한다. 

/*
import java.util.Scanner;
import java.util.Calendar;
*/
import java.util.*;

import com.shinhan.day05.Account;
import com.shinhan.day05.Book;

public class PackageTest {

	public static void main(String[] args) {
		/*
		//Date d1= new Date(2023-1900,9,15);
		Date d1= new Date();
		java.util.Date d3 = new java.util.Date();
		java.sql.Date d2= new java.sql.Date(d3.getTime());
		System.out.println(d3);
		System.out.println(d2);
		System.out.println(d1);
		*/
		Date d1 = new Date();
		System.out.println(d1);	
		
		java.util.Date d2 =new java.util.Date();
		System.out.println(d2);	
		
		java.sql.Date d3 =new java.sql.Date(d2.getTime());
		System.out.println(d3);	
		
		Scanner sc;
		
		Book book = new Book("JAVA");
		Account acc = new Account("123",100);	
		
	}
	

}
