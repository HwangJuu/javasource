package op;

public class Trapezoid {

	public static void main(String[] args) {
		// 사다리꼴 넓이 구하기(윗변+아랫변)*높이 / 2
		// 윗변 = 5 , 아랫변 = 10, 높이 = 7로 변수 선언하기
		// 넓이 구하기
		
//		int x = 5;
//		int y = 10;
//		int z = 7;
//		
//		int result = (x + y) * z / 2;
//		System.out.println("사다리꼴 넓이 = " +result); double타입이 아니라 소수점까지 나오지 않음.
		
		
		
		int lengTop = 5;
		int lengBottom = 10;
		int height = 7;
		
		double area = (double)(lengTop+lengBottom) * height /2;
		System.out.println("넓이 = "+area);
				
				
	}

}
