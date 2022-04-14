<%@page import="java.util.List"%>
<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	//serch.jsp 에서 넘긴 값 가져오기
	String criteria = request.getParameter("criteria"); //code or writer
	String keyword = request.getParameter("keyword"); //1004 or 홍길동
	
	
	//db작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	List<BookDTO> list = dao.searchList(criteria, keyword);	
		
	JdbcUtil.close(con);
	
	//페이지 이동
	//list.jsp : 공유하기 위해서
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");
	


%>