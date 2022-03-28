package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpAddService;
import emp.util.ConsoleUtil;

public class EmpAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		EmpDTO insertDto = util.getNewEmp(sc);
		
		EmpAddService service = new EmpAddService();
		//null로 들어가 있어서 널포인터가 나온거에요
		boolean insertResult = service.addEmp(insertDto);
		
		if(insertResult) {
			util.printAddSuccessMessage(insertDto);
		}else {
			util.printAddFailMessage(insertDto);
		}

	}

}
