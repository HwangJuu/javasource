package servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello") //http://localhost:9090/Hello 입력시 Served at: 
						//Hello -> hello 소문자 변경도 가능
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//메소드 doGet,doPost 구현
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//보여줄 페이지 설정 필요(한글은 깨짐)
		response.setContentType("text/html;charset=utf-8");
		
		//화면에 출력하기
		PrintWriter out = response.getWriter();
		
		out.print("Hello");
		out.print("<br>");
		out.print("안녕하세요"); //"text/html;charset=utf-8" 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
