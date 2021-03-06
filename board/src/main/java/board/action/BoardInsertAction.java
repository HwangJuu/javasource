package board.action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardInsertService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardInsertAction implements Action {
	
	private String path;

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//form태그 변경으로 getPamater로 불러오기 못함.
		UploadUtil util = new UploadUtil();
		HashMap<String, String> dataMap = util.uploadFile(request);
		
		//dataMap에서 값 가져오기
		BoardDTO insertDto = new BoardDTO();
		insertDto.setName(dataMap.get("name"));
		insertDto.setTitle(dataMap.get("title"));
		insertDto.setContent(dataMap.get("content"));
		insertDto.setPassword(dataMap.get("password"));
		insertDto.setAttach(dataMap.get("attach"));
		
		// getParameter
		// qna_board_write.jsp 넘긴 값 가져오기
//		BoardDTO insertDto = new BoardDTO();
//		insertDto.setName(request.getParameter("name"));
//		insertDto.setTitle(request.getParameter("title"));
//		insertDto.setContent(request.getParameter("content"));
//		insertDto.setPassword(request.getParameter("password"));			
				
		// 서비스 호출
		BoardInsertService service = new BoardInsertService();
				
		// 결과에 페이지 이동 => 성공 qList.do, 실패 qna_board_write.jsp		
		if(!service.insert(insertDto)) {
			path = "/view/qna_board_write.jsp";
		}				
		return new ActionForward(path, true);
	}

}
