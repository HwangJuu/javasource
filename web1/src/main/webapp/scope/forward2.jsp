<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//forward1.jsp 넘긴값 가져오기 ==> request.getPameter("")
	
	request.setAttribute("name", "홍길동");

	pageContext.forward("forward3.jsp");
%>