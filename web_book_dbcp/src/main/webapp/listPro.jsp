<%@page import="java.util.List"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dto.BookDTO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="book.dao.BookDAO"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//도서 목록 전체 조회 후 화면 이동
	//db 작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	List<BookDTO> list = dao.getList();
	
	//페이지 이동
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");


%>