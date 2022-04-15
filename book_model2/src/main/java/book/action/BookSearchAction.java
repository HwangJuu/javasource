package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;
import book.service.BookSearchService;

public class BookSearchAction implements Action {
	
	private String path;

	public BookSearchAction(String path) {
		super();
		this.path = path; //  /list.do 가 아닌  list.jsp로 가야함.
						  //  /list.do로 가면 목록 전체가 보임.
	}

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParmeter 작업
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		BookSearchService service = new BookSearchService();
		
		List<BookDTO> list = service.list(criteria, keyword);
		
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
