package api;

public class StringEx1 {

	public static void main(String[] args) {
		
		//문자열 만들 때 2가지 방법
		//문자열 리터럴을 지정
		//String 클래스 생성자 이용
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);//true : 같은 주소를 의미
		System.out.println(str3 == str4);//false : new를 사용해서 새로운 주소를 잡음
		
		//내용비교 equals()

	}

}
