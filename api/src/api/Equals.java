package api;

public class Equals {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		
		System.out.println(str1.equals(str2)); //false : 대소문자를 구분하기 때문에
		System.out.println(str1.equalsIgnoreCase(str2)); //true : 대소문자와 상관없이 같은지 확인 
		
	}

}
