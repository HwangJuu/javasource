<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upload.jsp" method="post" enctype="multipart/form-data"> <!-- 설정하지 않으면 기본 타입 enctype= application/x-www-form-urlencoded -->
	<div>
		<label> 제목
			<input type="text" name="title" id="title"/>
		</label>
	</div>
	<div>
		<label>내용
			<textarea name="contents" id="contents" cols="30" rows="10"></textarea>
		</label>
	</div>
	<div>
		<label>첨부파일
			<input type="file" name="file1" id="" multiple="multiple"/>
		</label>
	</div>
	<div>
		<input type="submit"  value="전송"/>
	</div>
</form>
</body>
</html>