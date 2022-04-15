package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookDeleteService;

public class BookDeleteAction implements Action {
	
	private String path;
	

	public BookDeleteAction(String path) { //롬복 사용 가능
		super();
		this.path = path; // /list.do
	}


	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParmeter 작업
		int code = Integer.parseInt(request.getParameter("code"));
		
		//sevice 호출
		BookDeleteService service = new BookDeleteService();
		
		if(!service.remove(code)) {
			path = "/delete.jsp";
		}		
		
		return new ActionForward(path, true);
	}

}
