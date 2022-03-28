package classtest;

public class Student2 {
	//속성(특성) : 필수는 아님(들어와도 되고, 안들어와도 됨) - 멤버 변수(property)
	//기능(동작) : 필수는 아님 - 멤버메소드
	//생성자 : default 생성자, 인자를 받는 생성자
	//       접근제한자(public, private package)클래스명(){}
	//인자(인수-argument) : 괄호안에 들어있는 변수 지칭
	
	
	//속성(변수) - 학번(20221010), 이름(홍길동), 주소(서울 중구 ~~), 핸드폰(010-0000-0000)
	int studenId; //학번 : 숫자만
	String studentName; // 이름 : 문자
	String address; //주소 : 문자와 숫자 혼합
	String mobile; //핸드폰 : 숫자와 - 혼합
	
	//생성자 - 초기화를 담당(내가 가지고 있는 멤버 변수(속성)에 값을 넣어주는 역할
	//     - 객체를 생성하면서 필요한 사전 작업 담당 > 규칙이기에 외워야함
	//생성자 오버로딩 - 여러개 올 수 있음(하나의 클래스에 여러개 생성자) 
	//              (단, default 무조건 하나, 인자를 받는 생성자가 여러개로 오는 것=>괄호안에 똑같은 내용은 안됨.)
	//객체를 생성할 때 자동 호출
	public Student2() {
		//default 생성자 : 무조건 하나만 생성한다. 두개는 안됨.
		System.out.println("Student2 객체 생성");
	} 
	public Student2(int studentId,String studentName) {
		//인자를 받는 생성자 (괄호 안에 쓰여진 내용 모두)
		//this :  객체 자기 자신. 나 = stuend2(클래스명)
		System.out.println("인자를 받는 Student2 객체 생성(1)");
		this.studenId = studentId;
		this.studentName = studentName;		
		
	} 
	// 생성자는 괄호안이 달라야함 -  타입이 다른거나 갯수가 다르거나 
	// 순서가 중요하기 때문에 순서가 바뀐건 다른걸로 인식.
	public Student2(String studentName,int studentId) { 
		//인자를 받는 생성자 (괄호 안에 쓰여진 내용 모두)
		//this :  객체 자기 자신. 나 = stuend2(클래스명)
		System.out.println("인자를 받는 Student2 객체 생성(1)");
		this.studenId = studentId;
		this.studentName = studentName;		
		
	} 
	
	
	public Student2(int studentId,String studentName,String address) {
		System.out.println("인자를 받는 Student2 객체 생성(2)");
		this.studenId = studentId;
		this.studentName = studentName;
		this.address = address;
		
	} 
	
	public Student2(int studentId,String studentName,String address, String mobile) {
		System.out.println("인자를 받는 Student2 객체 생성(3)");
		
		this.studenId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.mobile = mobile;
		
	} 
	
			
	//기능(메소드) - 핸드폰 번호를 번경한다.주소를 변경한다.
	void changeMobile() {}
	void changeAddress() {}
	
	

}
