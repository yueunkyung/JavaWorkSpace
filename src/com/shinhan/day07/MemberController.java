package com.shinhan.day07;

import java.util.Scanner;

//Controller : 사용자의 요청을 받아서 처리하고(처리는 서비스에 보낸다) 응답을 보내는 역할을 한다.
public class MemberController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("로그인id,password>>");
		
		MemberService memberService = new MemberService();
		
		String id = sc.next();
		boolean result = memberService.login(id, sc.next());
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("admin");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		sc.close();
	}

}
