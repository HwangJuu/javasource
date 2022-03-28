package op;

public class CompareOperatorEx2 {
	public static void main(String[] args) {
		// ""문자 사용시 String
		// 시작이 대문자면 자바에선 클래스로 인식
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		
		
		System.out.println(str1 == str2); // == 숫자나, 기본타입 일때 사용
		System.out.println(str1 == str3);
		
		System.out.println();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3)); //문자열을 확인 시, equals 사용
		

	}

}
