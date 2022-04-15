package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberLoginService;

@AllArgsConstructor
public class MemberLoginAction implements Action {
	
	private String path; //롬복 사용
	

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter
		//loginForm 넘긴 값 가져오기
		String userid = request.getParameter("userid");
		String password = request.getParameter("current_password");
		
		//service호출
		MemberLoginService service = new MemberLoginService();
		MemberDTO loginDto = service.login(userid, password);
		
		//session에 담기
		HttpSession session = request.getSession();
		session.setAttribute("loginDto", loginDto);
		
		return new ActionForward(path, true);
	}

}
