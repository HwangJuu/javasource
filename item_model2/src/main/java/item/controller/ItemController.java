package item.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.action.Action;
import item.action.ActionForward;
import item.action.ItemActionFactory;


@WebServlet("*.do")
public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//모든 request에 대한 한글처리
		request.setCharacterEncoding("utf-8");
		
		//requestUri 확인
		String cmd = request.getRequestURI(); // /list.do /insert.do /delete.do /update.do /search.do
		
		
		//Action 생성 => BookActionFactory이용
		ItemActionFactory baf = ItemActionFactory.getInstance();
		Action action =  baf.action(cmd);
		
		//생성된 action에게 요청 넘기기
		ActionForward af = null;
		try {
			af = action.excute(request, response);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		//af = path, 이동방식
		if(af.isRedirect()) {
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
