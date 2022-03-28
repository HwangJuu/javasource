package exception;

public class ArithmethicExceptionEx {
	public static void main(String[] args) {
	
		int num1=5, num2 =0;
		// java.lang.ArithmeticException
		//Exception in thread "main" java.lang.ArithmeticException: 오류 시 구글링으로 검색해보기
		
		try { // 예와가 발생할 만한 코드를 입력
			System.out.println(num1/num2);
			
		} catch (Exception e) {//예외가 발생하면 처리
//			System.out.println("예외 발생");
//			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		
		

	}
}
