package board.action;

public class BoardActionFactory {
	//하나의 단일 창구로 공장에 주문
	//싱글톤 패턴
	private static BoardActionFactory baf;
	
	private BoardActionFactory() {}
	
	public static BoardActionFactory getInstance() {
		if(baf == null) {
			baf = new BoardActionFactory();
		}
		return baf;
	}

	Action action = null;
	public Action action(String cmd) {
		
		//Action 생성시 path 지정(작업이 성공할 경우 움직일 페이지)
		if(cmd.equals("/qWrite.do")) {
			action = new BoardInsertAction("/qList.do");
		}else if(cmd.equals("/qList.do")) {
			action = new BoardListAction("/view/qna_board_list.jsp");
		}
		
		
		return action; //controller에게 리턴
	}
}
