package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.dto.ItemDTO;
import item.service.ItemInsertService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemInsertAction implements Action {
	
	private String path;

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter
		ItemDTO insertDto = new ItemDTO();
		insertDto.setCategory(request.getParameter("category"));
		insertDto.setName(request.getParameter("name"));
		insertDto.setContent(request.getParameter("content"));
		insertDto.setPsize(request.getParameter("psize"));
		insertDto.setPrice(Integer.parseInt(request.getParameter("price")));
	
		
		
		ItemInsertService service = new ItemInsertService();
		if(!service.insertItem(insertDto)) {
			path = "/insert.jsp"; 
		}
		
		return new ActionForward(path, true);
	}

}
