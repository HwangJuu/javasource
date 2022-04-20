/**
 * qna_board_list.jsp 스크립트
 */
 
$(function(){
	//text에 엔터 금지
	$(":text").keydown(function(e){ //:text 모든 텍스트에
		if(e.keyCode == 13){ // enter 키 코드 : 13
			e.preventDefault();//event 막기 태그가 가지고 있는 event들을 막기
		}		
	})
	
 	$(".btn-primary").click(function(){
 		//criteria가 value가 n이면 경고 메시지
 		if($('[name="criteria"]').val() == "n"){
			alert("검색 조건이 없습니다.");
			return false;
		}
 		
 		//keyword 도 비어있으면 경고 메시지
 		if($('[name="keyword"]').val()== ""){ //""공백 넣으면 공백도 글자로 인식해서 alert 실행 안됨
			alert("검색어 없습니다.");
			return false;
		}
 		
 		//form submit
 		$("#search").submit();
 	})
 	//페이지 나누기 이동
 	
 	//페이지 나누기 정보를 가지고 있는 폼 가져오기
 	let actionForm = $("#actionForm");
 	
 	//1234 or 이전, 다음 이 클릭되면 actionForm 보내기
 	$(".page-link").click(function(e){
		//a 태그 기능 중지
		e.preventDefault();
		
		//a태그의 href 속성이 가지고 있는 값 가져오기
		let page = $(this).attr("href");
		//actionForm 안의 page 번호를 교체
		actionForm.find("[name = 'page']").val(page);
		//console.log(page); console에서 번호값이 넘어오는지 확인
		//actionForm 보내기
		actionForm.submit();
		
	})
 	
 	
 	
 	
 }) 
 
 
 
 