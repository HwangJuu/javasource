<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	//joinForm.jsp 넘긴 값 가져오기
	MemberDTO registerDto = new MemberDTO();
	registerDto.setUserid(request.getParameter("userid"));
	registerDto.setPassword(request.getParameter("password"));
	registerDto.setName(request.getParameter("name"));
	registerDto.setGender(request.getParameter("gender"));
	registerDto.setEmail(request.getParameter("email"));	
	
	String confirmPassword = request.getParameter("confirm_password");
	
	
	//db작업(register)한꺼번에
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	String path = "";	
	//페이지이동 : 성공 - loginForm, 실패 - joinForm
	if(confirmPassword.equals(registerDto.getPassword())){
		if(dao.register(registerDto)){
			JdbcUtil.commit(con);
			path = "loginForm.jsp";
		}else{	
			JdbcUtil.rollback(con);
			path = "joinForm.jsp";
		}
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);



%>