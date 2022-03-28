package op;

//논리 연산자 : 결과가 true, false
// && : 논리 곱 and
// || : 논리 합 or
// ! : 부정 

public class LogicalOperatorEx1 {
	public static void main(String[] args) {
		
		boolean result = (5>3) && (5>2);
		System.out.println(result);
		
		 result = (5 > 3) || (5 < 2); // Dead code (5<2) 이미 죽은 코드, 앞이 조건이 맞기 때문에 뒤쪽은 생략
		System.out.println(result);
		

	}

}
