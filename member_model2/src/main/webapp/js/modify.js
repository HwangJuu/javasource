/**
 * register.html 폼 유효성 검증
 * jquery validation plug-in 사용
 */
$(function () {
  $("#modifyform").validate({
    //validate() : 해당폼을 검증할꺼야
    //rules 정하기 - 유효성 검증 규칙 지정
    //폼 요소 이름 사용
    rules: {
     current_password: {
        required: true,
        validPwd: true,
      },
      new_password: {
        required: true,
        validPwd: true,
      },
      confirm_password: {
        required: true,
        validPwd: true,
        equalTo: "#new_password", //현재 요소가 어떤 요소랑 값이 같아야 하는가? (id 사용)
      },
    }, //rules 종료

    //규칙이 맞지 않을 경우 보여줄 메세지 작성
    messages: {
     current_password: {
        required: "현재 비밀번호는 필수 입력 요소입니다.",
      },
      new_password: {
        required: "비밀번호는 필수 입력 요소입니다.",
      },
      confirm_password: {
        required: "비밀번호는 필수 입력 요소입니다.",
        equalTo: "새 비밀번호와 다릅니다.",
      },
    },
    errorPlacement:function(error, element){
		$(element).closest("form")
				  .find("small[id='" + element.attr('id')+ "']") //"small[id='" 띄워쓰기하면 오류남
				  .append(error);
	}
  });
});
$.validator.addMethod(
  "validId",
  function (data) {
    const regId = /^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]{6,12}$/;
    return regId.test(data);
  },
  "아이디는 영문자, 숫자의 조합으로 6~12자리로 만들어야 합니다"
);

$.validator.addMethod(
  "validPwd",
  function (data) {
    const regPwd =
      /^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,15}$/;
    return regPwd.test(data);
  },
  "비밀번호는 영문자, 숫자의 조합으로 8~15자리로 만들어야 합니다"
);

