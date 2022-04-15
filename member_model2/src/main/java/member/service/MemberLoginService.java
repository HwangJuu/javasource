package member.service;

import static member.dao.JdbcUtil.*;
import java.sql.Connection;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberLoginService {
	
	public MemberDTO login(String userid, String password) {		
	//db작업
	Connection con = getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	//dao 보면서 하기
	MemberDTO loginDto = dao.isLogin(userid, password);
	
	close(con);
	
	//잘됐나, 안됐나 값 보내기
	return loginDto;
			
			
	}

}
