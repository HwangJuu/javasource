package api;

public class Trim {

	public static void main(String[] args) {
		String s = "      Hello  World      ";
		String s1 = "Hello  World";
		System.out.println(s.equals(s1)); //false
		System.out.println(s.trim().equals(s1));//true
		System.out.println(s);
		System.out.println(s.trim());// trim : 공백제거, 양쪽 공백만 제거, 중간 공백 제거 되지 않음
		
	}

}
