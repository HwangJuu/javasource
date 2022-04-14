package pattern.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.service.LoginService;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("LoginAction");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
//		System.out.println(request.getParameter("userid"));
//		System.out.println(request.getParameter("password"));
		
		//db 작업 => Service 
		LoginService service = new LoginService();
		//페이지 이동
		if(service.login(userid, password)) {
			//path = "index.jsp";
		}else {
			//path = "loginForm.jsp";
		}
		//각 액션에서 일이 끝난 후 path, 어떤 방식(forward,sendRedirect)으로 움직일 것인지 리턴 방식		
		//두개를 리턴을 못하니 객체 생성
		//return path, redirect;
		return new ActionForward("path", true);

	}

}
