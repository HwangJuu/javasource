package board.service;

import static board.dao.JdbcUtil.*;
import java.sql.Connection;
import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class BoardReplyService {
	public boolean reply(BoardDTO replDto) {
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		boolean result = dao.reply(replDto);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return result;
		
		
		
	}

}
