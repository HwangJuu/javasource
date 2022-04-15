package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MemberLogoutAction implements Action {
	
	private String path;//롬복 사용. 생성자 필요 없음

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// db 사용 하지 않음.
		// 세션 해제만 하면 됨.			
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto");
		
		
		return new ActionForward(path, true);
	}

}
