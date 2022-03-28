package api;
/*
 * Wrapper 클래스
 * 기본형 타입을 객체로 다루기 위한 클래스들
 * 
 * int => Integer(Integer.parseInt())
 * boolean => Boolean(Boolean.parseBoolean())
 * byte => Byte
 * short =>Short
 * char => Character 
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		
		
		Boolean b = Boolean.valueOf(true);		
		Integer i = Integer.valueOf(100); //Integer i = new Integer(100) 9번전부터 사용 불가
		
		int i2 = 100;
		
		System.out.println(i==i2);
		System.out.println();
		

	}

}
