package member.action;

public class MemberActionFactory {
	//하나의 단일 창구로 공장에 주문
	//싱글톤 패턴
	private static MemberActionFactory baf;
	
	private MemberActionFactory() {}
	
	public static MemberActionFactory getInstance() {
		if(baf == null) {
			baf = new MemberActionFactory();
		}
		return baf;
	}

	Action action = null;
	public Action action(String cmd) {
		
		//Action 생성시 path 지정(작업이 성공할 경우 움직일 페이지)
		if(cmd.equals("/login.do")) {
			action = new MemberLoginAction("/view/loginForm.jsp");
		}else if(cmd.equals("/logout.do")) {
			action = new MemberLogoutAction("/view/loginForm.jsp");
		}else if(cmd.equals("/leave.do")) {
			action = new MemberLeaveAction("/index.do");
		}else if(cmd.equals("/modify.do")) {
			action = new MemberModifyAction("/view/loginForm.jsp");
		}else if(cmd.equals("/join.do")) {
			action = new MemberJoinAction("/view/loginForm.jsp");
		}else if(cmd.equals("/checkId.do")) {
			action = new MemberCheckIdAction("/view/checkId.jsp");
		}
		
		
		
		return action; //controller에게 리턴
	}
}
