package member.service;

import java.sql.Connection;

import member.dao.JdbcUtil;
import member.dao.MemberDAO;
import static member.dao.JdbcUtil.*;

public class MemberLeaveService {
	
	public boolean remove(String userid, String password) {
		
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	boolean result = dao.leave(userid, password);
	
	if(result) {
		commit(con);
		
	}else {
		rollback(con);
	}
	close(con);
	
	return result;
	}

}
