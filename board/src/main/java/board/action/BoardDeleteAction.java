package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardDeleteService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class BoardDeleteAction implements Action {
	
	private String path;

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// bno, password 값 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("password");
		
		//service 호출
		BoardDeleteService service = new BoardDeleteService();
		if(!service.remove(bno, password)) {
			path = "/view/qna_board_pwdCHeck.jsp?bno=" + bno; //+bno 안하면 0이 들어감
		}
		
		
		return new ActionForward(path, true);
	}

}
