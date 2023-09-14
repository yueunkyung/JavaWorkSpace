package com.shinhan.day07;

//Service : 업무로직을 수행한다.
public class MemberService {

	boolean login(String id, String password) {
		boolean result = false;
		//DB에 저장된 사용자를 check하고자 한다.
		//DAO에서 처리한다.(Data Access Object)
		if (id.equals("admin") && password.equals("1234")) {
			result = true;
		}
		return result;
	}
	void logout(String id) {
		System.out.println(id+"로그아웃 성공");
	}

}
