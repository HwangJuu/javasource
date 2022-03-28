package classtest;

public class MethodTest1 {
	// true, false 리턴하는 메소드 작성 = isRedirect()
	// 인자는 없음
	//void를 제외하고는 무조건 보내겠다.
	
	boolean isRedirect(){
		return true; // return false; 상관없음
	}

	//정수타입 리턴, sum()
	//인자는 정수타입 2개를 입력받음 - 인자 타입이라하면 괄호 안에 값넣기
	//넘어온 정수타입 2개를 더하기 한후 결과값 리턴
	int sum(int num1, int num2) {
		return num1 + num2; //int result = num1 + num2; return result;
	}
	
	//문자 하나 리턴, method1()
	//인자 없음	
	char method1() {
		return 'c';
	}
	
	//실수 타입 리턴, divide1()
	//인자는 실수 값 2개를 입력받음
	float divide1(float num1, float num2) {
		return num1/num2;
	}
	double divide2(double num1, double num2) {
		return num1/num2;
	}
	
	//int 타입의 배열 리턴
	//array()
	//인자는 int 타입의 배열
	
	int[] array(int arr[]) {
		arr[0] = 8;
		return arr;
	}
	
	//문자열 타입 리턴
	//method2() : 인사말 리턴
	//인자 없음
	String method2() {
		return "안녕하세요";
	}
	
	
	
	
	
	
	
	
	
}
