<%@page import="web2.dao.MemberDAO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//폼(사용자)가 보낸 값 가져오기
	int id = Integer.parseInt(request.getParameter("id"));
	

	//db작업
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	boolean result = dao.delete(id);
	
	//페이지 이동
	String path ="";
	if(result){
		JdbcUtil.commit(con);
		path = "list.jsp";
	}else{
		JdbcUtil.rollback(con);
		path = "readProcess.jsp?id="+id;
	}
	response.sendRedirect(path);
	JdbcUtil.close(con);

%>