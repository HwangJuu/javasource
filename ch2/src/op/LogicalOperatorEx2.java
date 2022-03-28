package op;

// == : 같다.
// != : 같지 않다.

public class LogicalOperatorEx2 {
	public static void main(String[] args) {
		
		int charCode = 'A';
//		System.out.println(charCode);
//		char char1 = 'A';
//		System.out.println(char1);
		
		if((charCode >=65) && (charCode<=90)) {
			System.out.println("대문자");
		
		}
		
		if(!(charCode <48) && !(charCode > 57)) {
			System.out.println("숫자"); //false 라서 출력되지 않음.
		}
		
		int value = 6;
		if((value %2 ==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}

	}

}
