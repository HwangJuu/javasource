package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.service.ItemDeleteService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemDeleteAction implements Action {
	
	private String path;

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter 작업		
		int num = Integer.parseInt(request.getParameter("num"));
		
		//service 호출
		ItemDeleteService service = new ItemDeleteService();
		if(!service.deleteItem(num)) {
			path="/delete.jsp";
		}
		
		
		return new ActionForward(path, true);
	}

}
