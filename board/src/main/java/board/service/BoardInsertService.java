package board.service;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import static board.dao.JdbcUtil.*;
import java.sql.Connection;

public class BoardInsertService {
	public boolean insert(BoardDTO insertDto){
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		boolean result = dao.insertArticle(insertDto);
		
		if(result) {
			commit(con);
		}else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}

}
