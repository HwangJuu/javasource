package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;
import book.service.BookListService;

public class BookListAction implements Action {
	
	private String path;	

	public BookListAction(String path) {
		super();
		this.path = path; // /list.jsp
	}

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//getParameter 작업. 넘어오는 값이 없음 => 건너뜀
		//service 호출
		BookListService service = new BookListService();
		List<BookDTO> list = service.listALL(); //결과 도착
				
		request.setAttribute("list", list);
			
		
		
		return new ActionForward(path, false); //상단에 있는 path. false면 forward방식으로 
	}

}
