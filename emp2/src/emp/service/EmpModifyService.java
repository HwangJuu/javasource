package emp.service;

import java.sql.Connection;
import static emp.dao.JdbcUtil.*;
import emp.dao.EmpDAO;

public class EmpModifyService {
	public boolean modifyEmp(int empno, int mgr) {
		
		
		boolean isModifySuccess = false;
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean modifyResult = dao.update(empno, mgr);
		if(modifyResult) {
			
		}else {
			rollback(con);
			
		}
		return isModifySuccess;
	}
	

}
