package pattern.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.factory.TransactionFactory;

import pattern.action.Action;
import pattern.action.ActionFactory;

/**
 * Servlet implementation class PatternController
 */
@WebServlet("*.do")
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String command = request.getRequestURI();
		
		System.out.println("requestUri" + command);  // /insert.do 2./select.do 3./login.do
		
		//ActionFactory 객체 생성 : 싱글톤 객체 생성
		ActionFactory af = ActionFactory.getInstance();
		Action action = af.action(command);  //action(InsertAction) 2.action(SelectAction) 3.action(LoginAction)
		
		try {
			action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
