package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.service.MemberCheckIdService;

@AllArgsConstructor
public class MemberCheckIdAction implements Action {
	private String path;

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter		
		String userid = request.getParameter("userid");
		
		//service 호출
		MemberCheckIdService service = new MemberCheckIdService();
		
		String result = "";
		
		//아이디가 중복이라면 false, undefiend, null =>
		if(service.dupId(userid)) {
			result = "true";
		}else{
			result = "false";
		}
		
		request.setAttribute("dupId", result);		
		
		return new ActionForward(path, false);
	}

}
