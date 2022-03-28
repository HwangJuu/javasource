package member.controller;
//요청을 제어하는 클래스
import java.util.Scanner;

import member.action.Action;

public class MemberController {

	public void processRequest(Action action,Scanner sc) {
		//사용자의 요청을 처리하는 액션 클래스의 메소드 호출	
		try {
			action.execute(sc);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
