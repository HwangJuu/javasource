<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//loginForm 넘긴 값 가져오기
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");
	
	//db 작업
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	MemberDTO loginDto = dao.isLogin(userid, password);
	
	JdbcUtil.close(con);
	
	//페이지 이동
	String path ="loginForm.jsp"; 
	if(loginDto!=null){
	//	path = "/index.jsp";  //http://localhost:9090/index.jsp
		session.setAttribute("loginDto", loginDto); //로그인 정보가 따라다님
	}
	/* else{ //로그인 실패
		path = "loginForm.jsp"; //http://localhost:9090/view/loginForm.jsp
	} */
	//path : / 사용 여부에 따라 절대주소, 상대주소 구분
	//절대주소 : path = "/index.jsp";  => http://localhost:9090/index.jsp
	//상대주소 : path = "loginForm.jsp"=> //http://localhost:9090/view/loginForm.jsp
	response.sendRedirect(path);




%>