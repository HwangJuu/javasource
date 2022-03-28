package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpRowService;
import emp.util.ConsoleUtil;

public class EmpRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//서비스 호출하기
		EmpRowService service = new EmpRowService();
		
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.printRowMessage(sc);
		
		EmpDTO dto = service.GetRow(empno);
		
		//출력
		util.printEmpMessage(dto);

	}

}
