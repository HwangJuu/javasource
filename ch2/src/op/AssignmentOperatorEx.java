package op;

public class AssignmentOperatorEx {
	public static void main(String[] args) {
		// 복합대입연산자
		
		int result = 10;
		
		result +=10; // <- 간단하게  result = result + 10; 
		System.out.println("result = " +result);
		
		result -= 5; // <- 간단하게 result = result -5;
		System.out.println("result = " +result);
		
		result *=3; // <- 간단하게 result = result * 3;
		System.out.println("result = " +result);
		
		result /= 5;// <- 간단하게 result = result / 5;
		System.out.println("result = " +result);
		
		result %=3; // <- 간단하게 result = result % 3;
		System.out.println("result = " +result);

	}

}
