package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws UnknownHostException {
		// f2();
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("getLocalHost : " + local);

		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress addr : arr) {
			System.out.println("getHostAddress : " + addr.getHostAddress());
			System.out.println("getHostName : " + addr.getHostName());
		}
	}

	public static void f2() {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}