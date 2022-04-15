package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberLoginService;
import member.service.MemberModifyService;

@AllArgsConstructor
public class MemberModifyAction implements Action {
	
	private String path;//롬복 사용. 생성자 생성 불필요

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParamater
		String password = request.getParameter("current_password");
		String newPassword = request.getParameter("new_password");
		String confirmPassword = request.getParameter("confirm_password");
		
		//세션 호출
		HttpSession session = request.getSession();
		MemberDTO loginDto = (MemberDTO)session.getAttribute("loginDto");
		String userid = loginDto.getUserid();
		
		MemberLoginService loginService = new MemberLoginService();
		if(loginService.login(userid, password)!=null) {//현재 패스워드가 일치하면
			//service 호출
			MemberModifyService service = new MemberModifyService();
			
			
			if(newPassword.equals(confirmPassword)) { //두 개의 비밀번호가 같은지 확인
				if(!service.modify(userid, confirmPassword)) { //변경이 실패를 한다면
					path = "/view/modifyForm.jsp"; //수정하던 곳으로 이동
				}else { //비밀번호 변경 성공
					session.invalidate();				
				}
			}
			
		}else { //현재 비밀번호가 일치하지 않을 때
			path =  "/view/modifyForm.jsp";
		}			
		
		return new ActionForward(path, true);
	}

}
