<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<form id="modifyform" action="modifyPro.jsp" method="post">
	<div class="card"  style="width: 40rem;margin:40px auto;">	
		<div class="card-header">
	    	<h4>비밀번호 변경</h4>
	  	</div>
	 	<div class="card-body">	
			<div class="form-group row justify-content-center">		
				<div class="col-sm-10">	
					<input type="password" name="current_password" id="current_password" class="form-control" placeholder="현재 비밀번호" autofocus="autofocus"/>
					<small id="current_password" class="text-info"></small>	
				</div>
			</div>	
			<div class="form-group row justify-content-center">		
				<div class="col-sm-10">	
					<input type="password" name="new_password" id = "new_password" class="form-control" placeholder="새 비밀번호"/>
					<small id="new_password" class="text-info"></small>
				</div>	
			</div>	
			<div class="form-group row justify-content-center">		
				<div class="col-sm-10">	
					<input type="password" name="confirm_password" id = "confirm_password" class="form-control" placeholder="새 비밀번호 확인"/>
					<small id="confirm_password" class="text-info"></small>
				</div>	
			</div>	
			<div class="form-group text-center">		
				<button type="submit" class="btn btn-primary">수정</button>
			    <button type="reset" class="btn btn-secondary" id="modifycancel">취소</button>		
			</div>
		</div>
	</div>		
</form>
<%--로그인 후 메뉴 --%>
<%
	//세션에 정보있는지 가져오기
	MemberDTO loginDto = (MemberDTO)session.getAttribute("loginDto");
%>
<script>
	let name = '<%=loginDto.getName()%>';
</script>
<script src="/js/menu.js"></script>
<%-- 정보수정 들어왔으니 정보수정 버튼 없애기 --%>
<script>
	//비밀번호 변경 버튼 지우기
$(function(){ //$(document).ready(frunction(){});  간단한 버전
			 //$(function(){}); :  dom 동적으로 추가되는 경우나 이미 생성된 경우 적용
	$("#modify").detach();
		
})
</script>
<%--폼 검증 --%>
<script src="/js/modify.js"></script>
<%-- 버튼 이벤트 --%>
<%@ include file="../layout/footer.jsp" %>








