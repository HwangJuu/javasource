package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardListService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class BoardListAction implements Action {
	
	private String path;

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 넘어오는 값이 없기 때문에 서비스 바로 입력		
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.list();
		
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
