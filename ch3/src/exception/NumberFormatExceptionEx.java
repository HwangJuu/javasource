package exception;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		String data1="200";
		String data2 = "100";
				
		try {
			int value1 = Integer.parseInt(data1); //a100 => 숫자로 바꿀수 없음 그래서 예외
			int value2 = Integer.parseInt(data2);
			
			System.out.println(value1+value2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //예외 여부와 상관없이 무조건 실행해야하는 코드
			System.out.println("종료");
		}

	}
}
