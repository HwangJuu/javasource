package classtest;

//public class Student 설명
//접근제어자(public, private)
//class(패키지 이름을 class로 지정할 수 없는 이유)
//클래스 명(클래스 이름은 대문자로 시작, 내용을 알 수 있도록 정의)


/* 코딩 컨벤션 : 코딩을 할 때 읽기 쉽고 이해하기 쉽도록 정한 규칙
 * 
 * 변수명 : 문자로 시작(소문자로 지정), 두개의 단어가 오면 뒤에 오는 단어는 대문자.
 *
 *  클래스 이름은 대문자로 시작
 * camelcase : 단어가 두개 합쳐졌을 때 뒷단어의 시작을 대문자. studenId
 * snakecase : 언더바 사용.  student_name (파이썬에서 주로 사용)
 * 
 * 
 * 
 */

public class Student {
	//속성(특성) : 필수는 아님(들어와도 되고, 안들어와도 됨) - 멤버 변수(property)
	//기능(동작) : 필수는 아님 - 멤버메소드
	
	//속성(변수) - 학번(20221010), 이름(홍길동), 주소(서울 중구 ~~), 핸드폰(010-0000-0000)
	int studenId; //학번 : 숫자만
	String studentName; // 이름 : 문자
	String address; //주소 : 문자와 숫자 혼합
	String mobile; //핸드폰 : 숫자와 - 혼합
	
	//기능(메소드) - 핸드폰 번호를 번경한다.주소를 변경한다.
	void changeMobile() {}
	void changeAddress() {}
	
	

}
