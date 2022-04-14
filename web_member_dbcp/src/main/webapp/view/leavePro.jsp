<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//leaveForm에서 보낸값 가져오기(userid, password)
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");
	
	//db작업(leave)
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	boolean result = dao.leave(userid, password);
	
	String path = "";
	//탈퇴 성공 - 세션 해제
	//페이지 이동 : 성공 - index, 실패 - leaveForm
	if(result){
		JdbcUtil.commit(con);
		session.invalidate();
		path = "index.jsp";
	}else{
		JdbcUtil.rollback(con);
		path = "leaveForm.jsp";
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
	
	




%>