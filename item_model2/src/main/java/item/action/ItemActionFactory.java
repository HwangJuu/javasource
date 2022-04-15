package item.action;

public class ItemActionFactory {
	//하나의 단일 창구로 공장에 주문
	//싱글톤 패턴
	private static ItemActionFactory baf;
	
	private ItemActionFactory() {}
	
	public static ItemActionFactory getInstance() {
		if(baf == null) {
			baf = new ItemActionFactory();
		}
		return baf;
	}

	Action action = null;
	public Action action(String cmd) {
		
		//Action 생성시 path 지정(작업이 성공할 경우 움직일 페이지)
		if(cmd.equals("/list.do")) {
			action = new ItemListAction("/list.jsp");
		}else if(cmd.equals("/insert.do")) {
			action = new ItemInsertAction("/list.do");
		}
		
		
		return action; //controller에게 리턴
	}
}
