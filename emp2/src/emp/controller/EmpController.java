package emp.controller;

import java.util.Scanner;

import emp.action.Action;

public class EmpController {
	public void processRequest(Action action, Scanner sc) {
		
		try {
			action.execute(sc); //list action
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
