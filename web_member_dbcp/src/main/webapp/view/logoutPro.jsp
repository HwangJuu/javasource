<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그아웃-db작업 x. 세션 해제
	//session 해지방법
	//removeAttribute("이름") => 이름만 날리는거 / invalidate() => 전부 날리는거
	session.removeAttribute("loginDto");
	
	
	//페이지 이동 : loginFrom.jsp
	response.sendRedirect("loginForm.jsp");

%>